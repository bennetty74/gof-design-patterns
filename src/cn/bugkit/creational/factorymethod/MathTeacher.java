package cn.bugkit.creational.factorymethod;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class MathTeacher extends Teacher {

    @Override
    Subject createSubject() {
        return new MathSubject();
    }
}
