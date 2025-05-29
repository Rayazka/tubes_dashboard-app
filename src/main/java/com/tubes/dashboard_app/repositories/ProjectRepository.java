package com.tubes.dashboard_app.repositories;

import com.tubes.dashboard_app.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, String> {

    //Mencari proyek berdasarkan ID 
    List<Project> findByOwnerId(String ownerId);

}