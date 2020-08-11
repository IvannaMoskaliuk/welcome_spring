package mos.edu.welcome_spring.service.cafedra.impls;

import mos.edu.welcome_spring.dao.cafedra.impls.DaoCafedraImpl;
import mos.edu.welcome_spring.datastorage.DataFake;
import mos.edu.welcome_spring.model.Cafedra;
import mos.edu.welcome_spring.repository.CafedraRepository;
import mos.edu.welcome_spring.service.cafedra.interfaces.ICafedraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
@Service
public class CafedraServiceImpl implements ICafedraService {

/*    @Autowired
    DaoCafedraImpl daoCafedra;
 */
    @Autowired
    CafedraRepository cafedraRepository;


    @Override
    public Cafedra create(Cafedra cafedra) {
        cafedra.setCreatedAt(LocalDateTime.now());
        cafedra.setUpdateAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public Cafedra get(String id) {
        return cafedraRepository.findById(id).orElse(null);
    }

    @Override
    public Cafedra delete(String id) {
        Cafedra cafedra = this.get(id);
        cafedraRepository.deleteById(cafedra.getId());
        return cafedra;
    }

    @Override
    public Cafedra update(Cafedra cafedra) {
        cafedra.setCreatedAt(LocalDateTime.now());
        cafedra.setUpdateAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }



    @Override
    public List<Cafedra> getAll() {
        return cafedraRepository.findAll();
    }
}
