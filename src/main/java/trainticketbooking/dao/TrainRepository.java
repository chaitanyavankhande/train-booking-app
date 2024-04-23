package trainticketbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import trainticketbooking.model.Train;

@Repository
public interface TrainRepository extends CrudRepository<Train, Long> {

}
