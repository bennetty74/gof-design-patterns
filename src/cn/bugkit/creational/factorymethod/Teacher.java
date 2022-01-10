package cn.bugkit.creational.factorymethod;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public abstract class Teacher {

    /**
     * Get the subject which taught by teacher
     * @return subject
     */
    abstract Subject getSubject();

    /**
     * Teach children by the specific subject
     */
    public void teach(){
        Subject subject = getSubject();
        subject.show();
    }

}
