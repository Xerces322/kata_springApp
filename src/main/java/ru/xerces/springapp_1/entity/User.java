package ru.xerces.springapp_1.entity;

public class User {
    private static int globalId = 0;
    private int id;
    private String nickname;
    private String email;
    private String country;

    public User() {}

    public User(String nickname, String email, String country) {
        globalId++;
        this.nickname = nickname;
        this.email = email;
        this.country = country;
        this.id = globalId;
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
