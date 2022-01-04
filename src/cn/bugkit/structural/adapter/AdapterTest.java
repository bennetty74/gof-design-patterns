package cn.bugkit.structural.adapter;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class AdapterTest {


    public static void main(String[] args) {
        // the first just for username and password authentication
        Authenticator authenticator = new UsernamePasswordAuthenticator();
        System.out.println(authenticator.authenticate(new UsernamePasswordAuthenticationImpl()));

        // but after some days, the system required for token authentication,but we doesn't have the other method to authenticate by token
        // so we choose to adapt to the UsernamePasswordAuthentication and use the origin authenticate method.
        TokenAuthentication tokenAuthentication = new TokenAuthenticationImpl();
        System.out.println(authenticator.authenticate(new TokenAuthenticationAdapter(tokenAuthentication)));
    }

}
