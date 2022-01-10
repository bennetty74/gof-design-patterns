package cn.bugkit.creational.singleton;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class SingletonTest {

    public static void main(String[] args) {
        // get single instance
        Switch instance1 = Switch.getInstance();
        instance1.turnOffLights();

        Switch instance2 = Switch.getInstance();
        instance2.turnOnLights();

        System.out.println(instance1 == instance2);
    }
}
