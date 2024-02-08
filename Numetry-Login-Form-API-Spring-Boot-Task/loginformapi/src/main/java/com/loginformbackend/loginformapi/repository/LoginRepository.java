package com.loginformbackend.loginformapi.repository;

import com.loginformbackend.loginformapi.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login,Long> {
}
