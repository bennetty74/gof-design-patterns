package cn.bugkit.creational.abstractfactory;

import cn.bugkit.creational.simplefactory.Computer;
import cn.bugkit.creational.simplefactory.Desktop;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class DesktopFactory extends AbstractFactory{

    @Override
    public Computer makeComputer() {
        return new Desktop();
    }

}
