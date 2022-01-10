package cn.bugkit.creational.abstractfactory;

import cn.bugkit.creational.simplefactory.Computer;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class PhoneFactory extends AbstractFactory {
    @Override
    public Computer makeComputer() {
        return new Phone();
    }
}
