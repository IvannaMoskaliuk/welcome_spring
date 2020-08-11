package mos.edu.welcome_spring.repository;

import mos.edu.welcome_spring.model.Cafedra;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CafedraRepository extends MongoRepository<Cafedra, String> {
}
