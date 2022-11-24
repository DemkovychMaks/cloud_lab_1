package com.lab_for_cloud.lab_for_cloud.repository;

import com.lab_for_cloud.lab_for_cloud.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
