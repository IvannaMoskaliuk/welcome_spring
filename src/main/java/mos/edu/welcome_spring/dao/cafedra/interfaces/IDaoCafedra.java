package mos.edu.welcome_spring.dao.cafedra.interfaces;

import mos.edu.welcome_spring.model.Cafedra;

import java.util.List;

public interface IDaoCafedra {

    Cafedra create(Cafedra cafedra);
    Cafedra get(String id);
    Cafedra update(Cafedra cafedra);
    Cafedra delete(String id);
    List<Cafedra> getAll();

}
