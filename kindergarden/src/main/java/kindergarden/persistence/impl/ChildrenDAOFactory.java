package kindergarden.persistence.impl;

import kindergarden.persistence.ChildrenDAO;

public class ChildrenDAOFactory {
    
    public static ChildrenDAO getChildrenDAO(){
        return new TransactionalChildrenDAO();
    }
}
