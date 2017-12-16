package ma.snrt.nayd.securing;

import ma.snrt.nayd.models.User;
import ma.snrt.nayd.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by nabil on 17/10/2017.
 */
@Service
public class UtilisateurService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User u=userRepository.findByEmail(s);
        if(u==null){
            throw new UsernameNotFoundException("Utilisateur "+s+" introuvable");
        }
        return new Utilisateur(u);
    }
}
