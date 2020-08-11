package mos.edu.welcome_spring.datastorage;

import mos.edu.welcome_spring.model.Cafedra;
import mos.edu.welcome_spring.model.Group;
import mos.edu.welcome_spring.repository.CafedraRepository;
import mos.edu.welcome_spring.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository

public class DataFake {
    @Autowired
    CafedraRepository cafedraRepository;
    @Autowired
    GroupRepository groupRepository;

    private List<Cafedra> cafedras = new LinkedList<>(Arrays.asList(
            new Cafedra("IPZ", "Ivanov", "Engeneering"),
            new Cafedra("KN", "Petrov", "MSOfice"),
            new Cafedra("IT", "Pshek", "ndjsgrsg")
    ));

    private List<Group> groups = new LinkedList<>(Arrays.asList(
            new Group("1","543", "ChNU", cafedras.get(0)),
            new Group("2","KN-42", "UzhNU", cafedras.get(1)),
            new Group("3","6.04.51.15.01", "KhNEU", cafedras.get(2))
    ));

    @PostConstruct
    private void init(){
        cafedraRepository.deleteAll();
        cafedraRepository.saveAll(cafedras);
        groupRepository.deleteAll();
        groupRepository.saveAll(groups);
    }

    public List<Cafedra> getCafedras() {
        return cafedras;
    }

    public void setCafedras(List<Cafedra> cafedras) {
        this.cafedras = cafedras;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

}
