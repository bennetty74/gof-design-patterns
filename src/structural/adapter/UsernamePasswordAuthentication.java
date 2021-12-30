package structural.adapter;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public interface UsernamePasswordAuthentication {
    /**
     * Get username authenticated
     * @return username
     */
    String getUsername();

    /**
     * Get authenticated user's password
     * @return password
     */
    String getPassword();
}
