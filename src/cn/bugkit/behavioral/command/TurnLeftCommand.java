package cn.bugkit.behavioral.command;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public class TurnLeftCommand extends AbstractCommand implements Command{

    public TurnLeftCommand(Robot robot) {
        super(robot);
    }

    @Override
    public void execute() {
        robot.turnLeft();
    }
}
