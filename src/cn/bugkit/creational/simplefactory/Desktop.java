package cn.bugkit.creational.simplefactory;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class Desktop implements Computer {
    @Override
    public ComputerType getType() {
        return ComputerType.DESKTOP;
    }
}
