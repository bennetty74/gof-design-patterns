package structural.adapter;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public interface Authenticator {
    /**
     * Authenticate by  {@link UsernamePasswordAuthentication}
     * @param usernamePasswordAuthentication {@link UsernamePasswordAuthentication}
     * @return true if authenticated,false otherwise
     */
    boolean authenticate(UsernamePasswordAuthentication usernamePasswordAuthentication);
}
