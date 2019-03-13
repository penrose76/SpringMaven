package pl.penrose.dao;

import org.springframework.data.repository.CrudRepository;
import pl.penrose.model.Person;

public interface PersonDao extends CrudRepository<Person, Integer> {




}
