package kindergarden;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionUtils {
    private static final Configuration conf;
    private static final SessionFactory factory;
    static {
        conf = new Configuration();
        factory = conf.configure("PostgreSQL.cfg.xml").buildSessionFactory();
    }
    
    public static Session getSession(){
        return factory.openSession();
    }
    
    public static void exit(){
        factory.close();
    }
    
}
