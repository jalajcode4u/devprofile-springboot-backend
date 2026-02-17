package com.example.devprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.devprofile.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
