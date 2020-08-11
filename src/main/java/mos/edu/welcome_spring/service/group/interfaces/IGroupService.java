package mos.edu.welcome_spring.service.group.interfaces;

import mos.edu.welcome_spring.model.Group;

import java.util.List;

public interface IGroupService {

    Group create(Group group);
    Group get(String id);
    Group update(Group group);
    Group delete(String id);
    List<Group> getAll();

}
