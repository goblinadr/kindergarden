package kindergarden.persistence;

import java.io.Serializable;

import kindergarden.entity.Child;

public interface ChildrenDAO {
    Serializable saveChild(Child child);

    boolean deleteChild(Child child);

    boolean updateChild(Child child);
}
