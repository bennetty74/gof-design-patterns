package cn.bugkit.behavioral.state;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class WorkingState implements State{
    @Override
    public void receivePhone(String phoneNumber) {
        System.out.println("At working state, received phone number " + phoneNumber);
    }
}
