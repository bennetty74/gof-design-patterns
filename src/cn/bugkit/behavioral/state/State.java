package cn.bugkit.behavioral.state;

/**
 * The person's state
 * @author bugkit
 * @since 2022.1.6
 */
public interface State {

    /**
     * During each different state, take a different action when receive a phone call
     * @param phoneNumber the phone number
     */
    void receivePhone(String phoneNumber);

}
