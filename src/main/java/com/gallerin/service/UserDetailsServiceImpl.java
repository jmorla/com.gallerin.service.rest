package com.gallerin.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gallerin.repository.UserRepository;

import static java.util.Collections.emptyList;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<com.gallerin.domain.User> applicationUser = userRepository.findByUsername(username);
        
        if(!applicationUser.isPresent()){
        	throw new UsernameNotFoundException(username);
        }
        
        return new User(applicationUser.get().getUsername(), applicationUser.get().getPassword(), emptyList());
    }
}