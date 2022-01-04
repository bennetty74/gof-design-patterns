package cn.bugkit.behavioral.reschain;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public interface Authenticator {


    /**
     * Authenticate the specific user
     * @param user user for authenticating
     * @return true if authenticated successfully, false otherwise
     */
    boolean authenticate(User user);

    /**
     * Check whether can handle the authentication of specific user type
     * @param userType {@link UserType}
     * @return true if it can handle, false otherwise
     */
    boolean canHandle(UserType userType);

    /**
     * Set the next authenticator
     * @param authenticator the next authenticator
     */
    void setNext(Authenticator authenticator);

}
