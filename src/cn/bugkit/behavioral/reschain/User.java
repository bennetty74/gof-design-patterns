package cn.bugkit.behavioral.reschain;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public class User {
    /**
     * the token for authentication
     */
    private String token;
    /**
     * the user type
     */
    private UserType type;

    public User(String token, UserType type) {
        this.token = token;
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public UserType getType() {
        return type;
    }
}
