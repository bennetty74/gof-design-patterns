package cn.bugkit.structural.adapter;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class UsernamePasswordAuthenticationAdapter implements UsernamePasswordAuthentication {

    private final TokenAuthentication tokenAuthentication;

    public UsernamePasswordAuthenticationAdapter(TokenAuthentication tokenAuthentication) {
        this.tokenAuthentication = tokenAuthentication;
    }

    @Override
    public String getUsername() {
        return tokenAuthentication.getToken().getUsername();
    }

    @Override
    public String getPassword() {
        return tokenAuthentication.getToken().getPassword();
    }
}


