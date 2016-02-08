package kindergarden.persistence;

import java.io.Serializable;

import kindergarden.entity.Group;

public interface GroupDAO extends RootDAO {
    Serializable saveGroup(Group child);

    boolean deleteGroup(Group child);

    boolean updateGroup(Group child);
}
