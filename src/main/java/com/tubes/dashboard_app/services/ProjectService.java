package com.tubes.dashboard_app.services;

import com.tubes.dashboard_app.models.Project;
import java.util.List;

public interface ProjectService{
        Project createProject(Project project);
        Project getProjectById(String id);
        List<Project> getAllProjects();
        List<Project> getProjectsByOwnerId(String ownerId);
        Project updateStatusProject(String id, Project projectDetails);
        void deleteProject(String id);
}