package com.example.usersapi.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_name")
    private String username;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    public User() {}

    public User(long id, String userName, String firstName, String lastName) {
        this.id = id;
        this.username = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //THE GETTERS AND SETTERS FOR THE USER MODEL DATA
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }
    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("User{")
                .append("id:").append(id)
                .append(",userName:").append(username)
                .append(",firstName:").append(firstName)
                .append(",lastName:").append(lastName)
                .append("}");
        return s.toString();
    }

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
}