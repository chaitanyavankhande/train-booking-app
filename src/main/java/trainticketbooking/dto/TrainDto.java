package trainticketbooking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrainDto {
    Integer id = null;
    String name;
    String fromLocation;
    String toLocation;
    String ticketPrice;
    Integer seatsAvailable;
}
