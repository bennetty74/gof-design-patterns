package cn.bugkit.creational.singleton;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class Switch {

    private static Switch instance;

    private Switch() {

    }

    public void turnOnLights() {
        System.out.println("Turn on the lights");
    }

    public void turnOffLights() {
        System.out.println("Turn off the lights");
    }

    /**
     * return instance if existed, else create and return
     * @return Switch
     */
    public static Switch getInstance() {
        if (instance == null) {
            instance = new Switch();
        }
        return instance;
    }

}
