package trainticketbooking.dto;
import lombok.Data;
import trainticketbooking.model.Role;

import java.util.ArrayList;
import java.util.List;

@Data
public class RegisterDto {
    private String username;
    private String email;

    private String password;
    private Role role;
}
