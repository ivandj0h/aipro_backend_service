package com.ivandjoh.aipro_backend_service.repository;

import com.ivandjoh.aipro_backend_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByEmail(String email);
}
