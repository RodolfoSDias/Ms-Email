package com.ms.user.repositories;

import com.ms.user.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
