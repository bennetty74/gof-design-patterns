package adapter;

/**
 * The default implementation of {@link Authenticator}
 * @author bugkit
 * @since 2021.12.30
 */
public class UsernamePasswordAuthenticator implements Authenticator {
    @Override
    public boolean authenticate(UsernamePasswordAuthentication usernamePasswordAuthentication) {
        // authenticate
        return false;
    }
}
