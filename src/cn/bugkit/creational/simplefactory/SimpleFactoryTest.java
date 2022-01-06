package cn.bugkit.creational.simplefactory;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Computer computer = ComputerFactory.createComputer(ComputerType.DESKTOP);
        System.out.println(computer.getType());
    }


}
