package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * PublisherRepository.java
 * Part of project "spring5webapp"
 * Created on 23.Aug.2019 12:10
 *
 * @author justin
 * @version 1.0.0
 */
public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
