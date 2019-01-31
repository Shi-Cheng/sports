package sports.entity;

import java.io.Serializable;

public class UserNameKey implements Serializable {
    private String username;
    private String UUID;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "UserNameKey{" +
                "UUID='" + UUID + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
