package br.developerspace.springangular.model;

import jakarta.persistence.*;

@Entity
@Table(name ="Employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String fistName;

    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_Id")
    private String emailId;

    public Employee(){

    }

    public Employee(String fistName, String lastName, String emailId) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}