package dev.rodweleo.app.model;

public class Parent {
    private int id;
    private String username;
    private String password;

    public Parent() {
    }

    public static final Parent[] parents = {
            new Parent(1, "parent_rodweleo", "rodweleo"),
            new Parent(2, "parent_alextopsy", "alextopsy"),
    };

    public Parent(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
