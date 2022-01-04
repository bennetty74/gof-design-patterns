package cn.bugkit.structural.flyweight;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public class DefaultTask implements Task{
    @Override
    public void execute() {
        //do something
        System.out.println("====task done====");
    }
}
