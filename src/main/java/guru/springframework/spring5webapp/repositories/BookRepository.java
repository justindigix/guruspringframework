package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * BookRepository.java
 * Part of project "spring5webapp"
 * Created on 22.Aug.2019 17:03
 *
 * @author justin
 * @version 1.0.0
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
