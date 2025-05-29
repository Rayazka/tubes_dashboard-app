package com.tubes.dashboard_app.repositories;
import com.tubes.dashboard_app.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository 
public interface UserRepository extends JpaRepository<User, String> {

    // Untuk mencari user berdasarkan email
    Optional<User> findByEmail(String email); 
}