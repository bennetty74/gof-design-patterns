package cn.bugkit.behavioral.command;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public class CommandTest {

    public static void main(String[] args) {
        // create phone and robot
        Phone phone = new Phone();
        Robot robot = new Robot();

        // send command
        phone.send(new TurnLeftCommand(robot));
        phone.send(new TurnRightCommand(robot));
        phone.send(new WalkCommand(robot));
    }
}
