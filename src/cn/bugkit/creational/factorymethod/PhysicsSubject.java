package cn.bugkit.creational.factorymethod;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class PhysicsSubject implements Subject{
    @Override
    public void show() {
        System.out.println("Physics Subject");
    }
}
