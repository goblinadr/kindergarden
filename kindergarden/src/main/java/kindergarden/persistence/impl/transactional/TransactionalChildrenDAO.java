package kindergarden.persistence.impl.transactional;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import kindergarden.ConnectionUtils;
import kindergarden.entity.Child;
import kindergarden.persistence.ChildrenDAO;

public class TransactionalChildrenDAO implements ChildrenDAO {

    @Override
    public Serializable saveChild(Child child) {
        Session ses = ConnectionUtils.getSession();
        Transaction t = ses.beginTransaction();
        try {
            Serializable res = ses.save(child);
            t.commit();
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            if (t != null)
                t.rollback();
            return null;
        } finally {
            ses.close();
        }
    }

    @Override
    public boolean deleteChild(Child child) {
        Session ses = ConnectionUtils.getSession();
        Transaction t = ses.beginTransaction();
        try {
            ses.delete(child);
            t.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (t != null) 
                t.rollback();
            return false;
        } finally {
            ses.close();
        }

    }

    @Override
    public boolean updateChild(Child child) {
        Session ses = ConnectionUtils.getSession();
        Transaction t = ses.beginTransaction();
        try {
            ses.update(child);
            t.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            if (t != null)
                t.rollback();
            return false;
        } finally {
            ses.close();
        }
    }

}
