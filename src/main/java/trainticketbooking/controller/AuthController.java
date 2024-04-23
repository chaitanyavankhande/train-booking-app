package trainticketbooking.controller;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trainticketbooking.dao.RoleRepository;
import trainticketbooking.dao.UserRepository;
import trainticketbooking.dto.AuthResponseDTO;
import trainticketbooking.dto.LoginDto;
import trainticketbooking.dto.RegisterDto;
import trainticketbooking.model.Role;
import trainticketbooking.model.User;
import trainticketbooking.security.JWTGenerator;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private AuthenticationManager authenticationManager;
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;
    private JWTGenerator jwtGenerator;


    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO>login(@RequestBody LoginDto loginDto){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtGenerator.generateToken(authentication);
        return new ResponseEntity<>(new AuthResponseDTO(token), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto ){
        if(userRepository.existsByUsername(registerDto.getUsername())){
            return new ResponseEntity<>("Username is taken", HttpStatus.BAD_REQUEST);
        }
        User user = new User();
        user.setUsername(registerDto.getUsername());
        user.setUserEmail(registerDto.getEmail());
        user.setUserPassword(passwordEncoder.encode((registerDto.getPassword())));
        String role = registerDto.getRole().getName();

        Role userRole = roleRepository.findByName(role).orElseThrow(
                EntityNotFoundException::new
        );
        user.setRole(userRole);
        System.out.println(user);
        userRepository.save(user);

        return new ResponseEntity<>("User registered success",HttpStatus.OK);
    }
}
