package org.group.apirest.model;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String lastName;

    @Column(length = 50)
    private String password;

    @Column(length = 50)
    private String premiumUser;

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPremiumUser() {
        return premiumUser;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPremiumUser(String premiumUser) {
        this.premiumUser = premiumUser;
    }
}
