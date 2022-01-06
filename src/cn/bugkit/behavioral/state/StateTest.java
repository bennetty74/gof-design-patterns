package cn.bugkit.behavioral.state;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class StateTest {

    public static void main(String[] args) {
        State state = new WorkingState();
        Person person = new Person(state);

        // received phone call during working state
        person.receivedPhone("234");

        person.setState(new HomeState());
        person.receivedPhone("234");
        person.receivedPhone("123");
    }
}
