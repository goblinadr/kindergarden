package kindergarden.persistence.impl.transactional;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import kindergarden.ConnectionUtils;
import kindergarden.entity.Group;
import kindergarden.persistence.GroupDAO;

public class TransactionalGroupDAO implements GroupDAO {

    @Override
    public Serializable saveGroup(Group group) {
        Session ses = ConnectionUtils.getSession();
        Transaction t = ses.beginTransaction();
        try {
            Serializable res = ses.save(group);
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
    public boolean deleteGroup(Group group) {
        Session ses = ConnectionUtils.getSession();
        Transaction t = ses.beginTransaction();
        try {
            ses.delete(group);
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
    public boolean updateGroup(Group group) {
        Session ses = ConnectionUtils.getSession();
        Transaction t = ses.beginTransaction();
        try {
            ses.update(group);
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
