package ma.snrt.nayd.securing;

import ma.snrt.nayd.models.User;
import ma.snrt.nayd.models.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by nabil on 17/10/2017.
 */
public class Utilisateur extends User implements UserDetails{

    public Utilisateur(User u) {
        super(u);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        final List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (final UserRole privilege : getRoles()) {
            authorities.add(new SimpleGrantedAuthority(privilege.getRole().getRoleName()));
        }
        return authorities;
        //return getRoles();
    }

    @Override
    public String getPassword() {
        return getPassword();
    }

    @Override
    public String getUsername() {
        return getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
