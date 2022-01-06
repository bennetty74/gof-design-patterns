package cn.bugkit.behavioral.state;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class Person {

    /**
     * Person's state
     */
    private State state;

    public Person(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * Deal with phone call
     * @param phone the phone number
     */
    public void receivedPhone(String phone) {
        state.receivePhone(phone);

    }

}
