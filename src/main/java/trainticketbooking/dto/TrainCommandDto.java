package trainticketbooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainCommandDto {
    Integer id;
    String name;
    String fromLocation;
    String toLocation;
    String ticketPrice;
    String seatsAvailable;
}
