package repositories;

import entities.Faq;
import org.springframework.data.repository.CrudRepository;

public interface FaqRepository extends CrudRepository<Faq,Long> {
}
