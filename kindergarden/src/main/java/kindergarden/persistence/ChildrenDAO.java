package kindergarden.persistence;

import java.io.Serializable;

import kindergarden.entity.Child;

public interface ChildrenDAO extends RootDAO {
    Serializable saveChild(Child child);

    boolean deleteChild(Child child);

    boolean updateChild(Child child);
}
