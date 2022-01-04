package cn.bugkit.behavioral.reschain;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public class ResChainTest {

    public static void main(String[] args) {
        // set the chain of responsibility
        Authenticator authenticatorChain = new AppleAuthenticator();
        Authenticator googleAuthenticator = new GoogleAuthenticator();
        Authenticator wechatAuthenticator = new WechatAuthenticator();
        authenticatorChain.setNext(googleAuthenticator);
        googleAuthenticator.setNext(wechatAuthenticator);

        // authenticate user
        authenticatorChain.authenticate(new User("apple token", UserType.APPLE));
        authenticatorChain.authenticate(new User("google token", UserType.GOOGLE));
        authenticatorChain.authenticate(new User("wechat token", UserType.WE_CHAT));

    }
}
