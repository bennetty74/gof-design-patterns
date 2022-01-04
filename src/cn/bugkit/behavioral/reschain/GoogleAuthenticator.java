package cn.bugkit.behavioral.reschain;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public class GoogleAuthenticator extends AbstractAuthenticator implements Authenticator {
    @Override
    public boolean authenticate(User user) {
        if (canHandle(user.getType())) {
            System.out.println(getClass() + "Authenticated token:" + user.getToken() + " , userType: " + user.getType());
            return true;
        }
        return next.authenticate(user);
    }

    @Override
    public boolean canHandle(UserType userType) {
        return userType == UserType.GOOGLE;
    }
}
