package br.com.springexemplo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springexemplo.model.User;

public interface UserRepository extends JpaRepository <User, Long>{
    
    public List<User> findByNameLikeIgnoreCase(String name);
}
