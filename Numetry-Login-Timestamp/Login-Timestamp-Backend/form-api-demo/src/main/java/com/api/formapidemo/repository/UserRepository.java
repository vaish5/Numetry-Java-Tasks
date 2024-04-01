package com.api.formapidemo.repository;

import com.api.formapidemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserNameAndPassword(String userName, String password);
    User findByUserName(String userName);

    LocalDateTime findLastLoginByUserName(String userName);

    LocalDateTime findLastLogoutByUserName(String userName);
}
