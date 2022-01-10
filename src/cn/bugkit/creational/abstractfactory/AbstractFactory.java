package cn.bugkit.creational.abstractfactory;

import cn.bugkit.creational.simplefactory.Computer;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public abstract class AbstractFactory {

    /**
     * Make computer
     * @return Computer
     */
    public abstract Computer makeComputer();

}
