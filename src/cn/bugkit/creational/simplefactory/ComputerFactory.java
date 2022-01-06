package cn.bugkit.creational.simplefactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class ComputerFactory {

    public static Computer createComputer(ComputerType type) {
        if (type == ComputerType.DESKTOP) {
            return new Desktop();
        }
        throw new NotImplementedException();
    }

}
