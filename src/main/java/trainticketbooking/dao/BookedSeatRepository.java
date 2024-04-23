package trainticketbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import trainticketbooking.model.BookedSeat;

@Repository
public interface BookedSeatRepository extends CrudRepository<BookedSeat, Integer> {
}
