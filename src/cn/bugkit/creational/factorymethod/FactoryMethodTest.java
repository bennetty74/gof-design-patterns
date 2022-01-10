package cn.bugkit.creational.factorymethod;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Teacher mathTeacher = new MathTeacher();
        mathTeacher.teach();

        Teacher physicsTeacher = new PhysicsTeacher();
        physicsTeacher.teach();
    }

}
