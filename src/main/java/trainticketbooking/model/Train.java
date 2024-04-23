package trainticketbooking.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    String name;
    String fromLocation;
    String toLocation;
    String ticketPrice;
    @Min(0)
    Integer seatsAvailable;
    Integer totalSeats;

    Boolean hasSeatsAvailable(Integer seatsRequired) {
        return this.seatsAvailable >= seatsRequired;
    }
}
