package com.example.bankapp.service;

import com.example.bankapp.model.User;
import com.example.bankapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo repo;
    public void store(User usr) {
        repo.save(usr);
    }

    public List<User> getUsers() {

        List<User> list=repo.findAll();

        return list;
    }

    public User getUser(int id) {

        User usr=repo.findById(id).orElse(new User());

        return usr;
    }

    public void deleteUsr(int id) {
        repo.deleteById(id);
    }

}



