package cn.bugkit.behavioral.command;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public class TurnRightCommand extends AbstractCommand implements Command{


    public TurnRightCommand(Robot robot) {
        super(robot);
    }

    @Override
    public void execute() {
        robot.turnRight();
    }


}
