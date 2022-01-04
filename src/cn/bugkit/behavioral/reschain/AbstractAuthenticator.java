package cn.bugkit.behavioral.reschain;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public abstract class AbstractAuthenticator implements Authenticator{


    protected Authenticator next;

    @Override
    public void setNext(Authenticator authenticator) {
        this.next = authenticator;
    }
}
