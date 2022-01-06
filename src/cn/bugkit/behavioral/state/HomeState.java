package cn.bugkit.behavioral.state;

/**
 * During home state, it just receives mom's phone call. reject other phone numbers otherwise
 * @author bugkit
 * @since 2022.1.6
 */
public class HomeState implements State{


    @Override
    public void receivePhone(String phoneNumber) {
        // mom's number
        if ("123".equals(phoneNumber)) {
            System.out.println("At home state, received mom's phone");
            return;
        }
        System.out.println("At home state, rejected number " + phoneNumber);
    }

}
