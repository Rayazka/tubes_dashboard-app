package com.tubes.dashboard_app.controllers;

import com.tubes.dashboard_app.models.User;
import com.tubes.dashboard_app.models.Client;
import com.tubes.dashboard_app.services.User.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController{
        private final UserService userService;

        @Autowired
        public UserController(UserService userService) {
            this.userService = userService;
        }

        // EndPoint membuat user
        @PostMapping()
        public ResponseEntity<User> createUser(@RequestBody Client client) {
                try{
                        User newUser = userService.createUser(client);
                        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
                } catch (Exception e) {
                        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                .body(null);
                }
        }

        // EndPoint membuat user
        @GetMapping()
        public ResponseEntity<List<User>> getAllUsers() {
                try {
                        List<User> users = userService.getAllUsers();
                        return new ResponseEntity<>(users, HttpStatus.OK);
                } catch (Exception e) {
                        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                .body(null);
                }
        }
}