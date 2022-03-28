package com.debrup.usermanagementbackend.repository;

import com.debrup.usermanagementbackend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUserName(String username);

    User findUserByEmail(String email);

}
