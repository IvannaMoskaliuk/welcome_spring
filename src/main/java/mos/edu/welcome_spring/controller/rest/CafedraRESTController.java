package mos.edu.welcome_spring.controller.rest;

import mos.edu.welcome_spring.model.Cafedra;
import mos.edu.welcome_spring.service.cafedra.impls.CafedraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RequestMapping("/api/cafedra")
@RestController
public class CafedraRESTController {

    @Autowired
    CafedraServiceImpl cafedraService;

    @RequestMapping("/hello")
    String getHello(){
        return "<h1>Hello from Cafedra Controller</h1>";
    }


    @RequestMapping (value = "/list", method = RequestMethod.GET)
    List<Cafedra> getCafedrasList(){
        return cafedraService.getAll();
    }

    @RequestMapping (value = "/get/{id}", method = RequestMethod.GET)
    Cafedra getCafedras(@PathVariable("id") String id){
        return cafedraService.get(id);
    }

}
