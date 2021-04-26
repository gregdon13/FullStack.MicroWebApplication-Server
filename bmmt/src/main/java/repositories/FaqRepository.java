package repositories;

import entities.FaqEntity;
import org.springframework.data.repository.CrudRepository;

public interface FaqRepository extends CrudRepository<FaqEntity,Long> {
}
