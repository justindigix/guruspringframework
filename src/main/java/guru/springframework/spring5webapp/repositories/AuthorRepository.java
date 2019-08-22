package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * AuthorRepository.java
 * Part of project "spring5webapp"
 * Created on 22.Aug.2019 17:01
 *
 * @author justin
 * @version 1.0.0
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
