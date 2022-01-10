package cn.bugkit.creational.abstractfactory;

import cn.bugkit.creational.simplefactory.Computer;
import cn.bugkit.creational.simplefactory.ComputerType;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class Phone implements Computer {
    @Override
    public ComputerType getType() {
        return ComputerType.PHONE;
    }
}
