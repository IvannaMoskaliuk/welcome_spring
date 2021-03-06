package mos.edu.welcome_spring.controller.rest;

import mos.edu.welcome_spring.model.Group;
import mos.edu.welcome_spring.service.group.impls.GroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/group")
@RestController
public class GroupRestController {

    @Autowired
    GroupServiceImpl groupService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Group> getGroups(){
        return groupService.getAll();
    }

}
