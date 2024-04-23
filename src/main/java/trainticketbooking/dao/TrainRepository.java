package trainticketbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import trainticketbooking.model.Train;

import java.util.List;

@Repository
public interface TrainRepository extends CrudRepository<Train, Long> {
    List<Train> findByFromLocationAndToLocation(String from, String to);
}
