
package trainticketbooking.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import trainticketbooking.dao.UserRepository;
import trainticketbooking.model.Role;
import org.springframework.security.core.userdetails.User;

import java.util.Collections;
import java.util.List;


@Service
public class CustomUserDetailsService implements UserDetailsService {
    private UserRepository userRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        trainticketbooking.model.User user = userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("Username not found"));
        return new User(user.getUsername(), user.getUserPassword(), mapRolesToAuthorities(user.getRole()));
    }

    private List<GrantedAuthority> mapRolesToAuthorities(Role role){
        return Collections.singletonList(new SimpleGrantedAuthority(role.getName()));
    }
}