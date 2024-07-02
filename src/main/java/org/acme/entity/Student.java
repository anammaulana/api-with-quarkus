package org.acme.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue

    private Long id;
    private String name;
    private String major;

    @Column(name = "is_deleted")
    private Boolean IsDeleted;

       // Getter for id
       public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for major
    public String getMajor() {
        return major;
    }

    // Setter for major
    public void setMajor(String major) {
        this.major = major;
    }

    // Getter for isDeleted
    public Boolean getIsDeleted() {
        return IsDeleted;
    }

    // Setter for isDeleted
    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }
}
