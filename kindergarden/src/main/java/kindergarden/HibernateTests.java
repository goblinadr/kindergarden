package kindergarden;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import kindergarden.entity.Child;
import kindergarden.persistence.ChildrenDAO;
import kindergarden.persistence.impl.ChildrenDAOFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTests {

    public static void main(String[] args) {
//      Child childOne = new Child("Владимир", "Макаров", 5);
//      Child childTwo = new Child("Алексей", "Киржаков", 4);
//        
//      ChildrenDAO dao =  ChildrenDAOFactory.getChildrenDAO();
//      Serializable id1 = dao.saveChild(childOne);
//      System.out.println(childOne.getId());
//      childOne.setId((Integer) id1);
//      Serializable id2 = dao.saveChild(childTwo);
//      System.out.println(childTwo.getId());
//      childTwo.setId((Integer) id2);
//      
//      
//      System.out.println("Deleting created objects from DB");
//      if(dao.deleteChild(childTwo)){
//          System.out.println("Child: "+childTwo.getId() + " was deleted");
//      }
//
//      if(dao.deleteChild(childOne)){
//          System.out.println("Child: "+childOne.getId() + " was deleted");
//      }
//
//        ConnectionUtils.exit();
        Path p = Paths.get("C:\\Users\\Aleksander\\workspace");
        Path dir = p.resolve(".git");
        try {
            Files.createDirectory(dir);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    


}
