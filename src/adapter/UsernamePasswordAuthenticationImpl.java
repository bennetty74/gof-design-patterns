package adapter;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class UsernamePasswordAuthenticationImpl implements UsernamePasswordAuthentication{
    @Override
    public String getUsername() {
        return "username";
    }

    @Override
    public String getPassword() {
        return "password";
    }
}
