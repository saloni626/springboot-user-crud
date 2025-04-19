package com.example.user.model;


import jakarta.persistence.*;

@Entity
@Table(name = "name")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String rollNo;

    @Column
    private String email;


    // Constructor

    public User(){

    }


    public User(Integer id, String name, String rollNo, String email) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
    }

    // getter and setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
