package cn.bugkit.creational.abstractfactory;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        // create desktop
        AbstractFactory desktopFactory = new DesktopFactory();
        System.out.println(desktopFactory.makeComputer().getType());

        // create laptop
        AbstractFactory laptopFactory = new LaptopFactory();
        System.out.println(laptopFactory.makeComputer().getType());

        // create phone
        AbstractFactory phoneFactory = new PhoneFactory();
        System.out.println(phoneFactory.makeComputer().getType());
    }
}
