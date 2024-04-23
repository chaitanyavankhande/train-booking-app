package trainticketbooking.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BookedSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    Train train;

    @ManyToOne
    User user;

    Integer bookedSeats;
}
