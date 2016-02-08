package kindergarden.persistence.impl;

import java.util.HashMap;
import java.util.Map;

import kindergarden.persistence.ChildrenDAO;
import kindergarden.persistence.RootDAO;

public class DAOFactory {
    private final static String mode;
    private final static String subpackage;
    static {
        mode = "Transactional";
        subpackage = "transactional";
    }

    private static Map<String, RootDAO> daoObjects = new HashMap<>();

    public static <T extends RootDAO> T getDAO(Class<T> daoClass) {
        String className = daoClass.getName();
        if (daoObjects.containsKey(className))
            return (T) daoObjects.get(className);
        RootDAO dao = null;
        try {
            String packege = daoClass.getPackage().getName() + ".";
            String finalClass = packege + "impl." + subpackage + "." + mode
                    + className.replace(packege, "");
            dao = (RootDAO) daoClass.getClassLoader().loadClass(finalClass)
                    .newInstance();
            daoObjects.put(className, dao);
        } catch (InstantiationException | IllegalAccessException
                | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return (T) dao;
    }
}
