package fr.formation.mykafetarea.services;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo=repo;
    }



}