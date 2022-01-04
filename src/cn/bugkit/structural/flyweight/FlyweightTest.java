package cn.bugkit.structural.flyweight;

/**
 * Flyweight is for reusing the object
 * @author bugkit
 * @since 2022.1.4
 */
public class FlyweightTest {

    public static void main(String[] args) {
        Factory factory = new Factory();
        for (int i = 0; i < 5; i++) {
            factory.serveTask(new DefaultTask());
        }
    }
}
