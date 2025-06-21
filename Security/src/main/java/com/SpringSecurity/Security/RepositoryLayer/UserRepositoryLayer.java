package com.SpringSecurity.Security.RepositoryLayer;

import com.SpringSecurity.Security.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositoryLayer extends JpaRepository<User,Long> {
    Optional<User>findByUsername(String username);
}
