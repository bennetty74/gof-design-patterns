package cn.bugkit.creational.factorymethod;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public abstract class Teacher {

    /**
     * Create the subject which taught by teacher
     * @return subject
     */
    abstract Subject createSubject();

    /**
     * Teach children by the specific subject
     */
    public void teach(){
        Subject subject = createSubject();
        subject.show();
    }

}
