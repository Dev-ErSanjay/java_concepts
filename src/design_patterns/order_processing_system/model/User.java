package model;

public class User {

    private int userId;
    private String name;
    private String email;
    private String address;

    public User(int userId, String name, String email, String address) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

}