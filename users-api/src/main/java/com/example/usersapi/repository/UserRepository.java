package com.example.usersapi.repository;

import com.example.usersapi.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername (String username);

    @Query("FROM User u WHERE u.username = ?1 and u.password = ?2")
    User login(String username, String password);

}
