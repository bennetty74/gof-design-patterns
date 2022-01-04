package cn.bugkit.structural.adapter;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class TokenAuthenticationImpl implements TokenAuthentication{
    @Override
    public Token getToken() {
        return new Token();
    }
}
