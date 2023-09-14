package com.generation.EdeTodos.security;

import com.generation.EdeTodos.model.Usuario;
import com.generation.EdeTodos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<Usuario> usuarios = usuarioRepository.findByLogin(username);

        if (usuarios.isPresent())
        return new UserDetailsImpl(usuarios.get());
        else
            throw new ResponseStatusException(HttpStatus.FORBIDDEN);
    }
}
