package cn.bugkit.behavioral.command;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public class Phone {
    /**
     * send command to robot
     * @param command {@link Command}
     */
    public void send(Command command) {
        command.execute();
    }
}
