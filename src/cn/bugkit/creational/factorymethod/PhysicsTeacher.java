package cn.bugkit.creational.factorymethod;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class PhysicsTeacher extends Teacher {
    @Override
    Subject getSubject() {
        return new PhysicsSubject();
    }
}
