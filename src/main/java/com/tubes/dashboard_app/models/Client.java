package com.tubes.dashboard_app.models;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("CLIENT")

public class Client extends User {

    public Client() {
    }

    public Client(String name, String email) {
        super(name, email);
    }

    @Override
    public String getRole() {
        return "CLIENT";
    }

}
