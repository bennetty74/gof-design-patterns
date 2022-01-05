package cn.bugkit.behavioral.command;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public class WalkCommand extends AbstractCommand implements Command{

    public WalkCommand(Robot robot) {
        super(robot);
    }

    @Override
    public void execute() {
        robot.walk();
    }
}
