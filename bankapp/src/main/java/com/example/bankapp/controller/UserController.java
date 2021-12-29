package com.example.bankapp.controller;

import com.example.bankapp.model.User;
import com.example.bankapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserController {
    @Autowired
    UserService service;

    @PostMapping( value = "/saveUsr" ,consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<User> print(@RequestBody User usr)
    {
        service.store(usr);
        return new ResponseEntity<User>(usr, HttpStatus.CREATED);
    }

    @GetMapping( value = "/Users" ,produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<List<User>> getUsrs()
    {
        List<User> list=service.getUsers();
        return new ResponseEntity<List<User>>(list,HttpStatus.CREATED);
    }

    @GetMapping( value = "/User/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<User> getStd(@PathVariable("id") int id)
    {
        User usr=service.getUser(id);
        return new ResponseEntity<User>(usr,HttpStatus.CREATED);
    }

    @PutMapping( value = "/User" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> updateStd(@RequestBody User usr)
    {
        service.store(usr);
        return new ResponseEntity<User>(usr,HttpStatus.CREATED);
    }

    @DeleteMapping( value = "/delete/{id}" ,consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<String> deleteUser(@PathVariable("id") int id)
    {
        service.deleteUsr(id);
        return new ResponseEntity<String>("recored deleted",HttpStatus.CREATED);
    }

}


