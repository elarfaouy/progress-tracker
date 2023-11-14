package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Goal {
    @Id
    private int id;
    private String description;
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
