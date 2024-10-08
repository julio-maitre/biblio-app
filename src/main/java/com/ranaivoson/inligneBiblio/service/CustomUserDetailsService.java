package com.ranaivoson.inligneBiblio.service;

import com.ranaivoson.inligneBiblio.entity.Lecteur;
import com.ranaivoson.inligneBiblio.repository.LecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private LecteurRepository lecteurRepository;
    @Autowired
    public CustomUserDetailsService(LecteurRepository lecteurRepository) {
        this.lecteurRepository = lecteurRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Lecteur lecteur = lecteurRepository.findByEmail(email);
        if(lecteur == null){
            throw new UsernameNotFoundException("Email ou mot de passe incorrect: " + email);
        }
        return new CustomUserDetails(
                lecteur.getEmail(),
                lecteur.getPassword(),
                authorities()
        );
    }
    private Collection<? extends GrantedAuthority> authorities() {
        return Arrays.asList(new SimpleGrantedAuthority("LECTEUR"));
    }
}
