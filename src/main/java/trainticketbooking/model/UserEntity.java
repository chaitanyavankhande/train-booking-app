package trainticketbooking.model;

//import com.jobapplication.example.jobapplication.applications.Application;
//import com.jobapplication.example.jobapplication.company.Company;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import trainticketbooking.model.Roles;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String username;

    private String userEmail;


    private String userPassword;
//    ManyRole->oneUser
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Roles> roles = new ArrayList<>();



}
