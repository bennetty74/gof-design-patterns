package cn.bugkit.behavioral.command;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public abstract class AbstractCommand implements Command{

    protected Robot robot;

    public AbstractCommand(Robot robot) {
        this.robot = robot;
    }
}
