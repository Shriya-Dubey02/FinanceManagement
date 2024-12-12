package com.learn.Finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Finance.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
