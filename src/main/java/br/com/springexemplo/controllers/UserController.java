package br.com.springexemplo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springexemplo.model.User;
import br.com.springexemplo.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {

        Optional<User> user = this.userRepository.findById(id);

        if(user.isPresent()) {
            return user.get();
        }

        // TODO: resource not found
        return null;
    }

    @PostMapping("/")
    public ResponseEntity<User> postUser(@RequestBody User user) {
        // TODO: validar o email
        return new ResponseEntity<User>(this.userRepository.save(user), HttpStatus.CREATED);

    }

    @GetMapping("/list")
    public List<User> getList() {
        return this.userRepository.findAll();
    }

    @GetMapping("/findByName/{name}")
    public List<User> getListName(@PathVariable String name) {
        String regex = "%" + name + "%";
        return this.userRepository.findByNameLikeIgnoreCase(regex);
    }
}
