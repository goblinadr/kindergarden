package kindergarden;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import kindergarden.entity.Child;
import kindergarden.entity.Group;

public class HibernateTests {

    public static void main(String[] args) {
        Calendar one = GregorianCalendar.getInstance();
        one.set(2008, 3, 25);
        Date oneDB =  one.getTime();
      Child childOne = new Child("Владимир", "Макаров", oneDB);
      Child childTwo = new Child("Алексей", "Киржаков", oneDB);
        
      Group group1 = new Group();
      group1.setName("Preporational");
      
      
      
      
      
      
 //     group1
//      ChildrenDAO dao =  DAOFactory.getDAO(ChildrenDAO.class);
//      Serializable id1 = dao.saveChild(childOne);
//      System.out.println(childOne.getId());
//      childOne.setId((Integer) id1);
//      Serializable id2 = dao.saveChild(childTwo);
//      System.out.println(childTwo.getId());
//      childTwo.setId((Integer) id2);
      
      
//      System.out.println("Deleting created objects from DB");
//      if(dao.deleteChild(childTwo)){
//          System.out.println("Child: "+childTwo.getId() + " was deleted");
//      }
//
//      if(dao.deleteChild(childOne)){
//          System.out.println("Child: "+childOne.getId() + " was deleted");
//      }

        ConnectionUtils.exit();
    }
    


}
