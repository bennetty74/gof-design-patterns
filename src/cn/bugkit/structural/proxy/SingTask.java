package cn.bugkit.structural.proxy;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public class SingTask implements Task{
    @Override
    public void execute() {
        System.out.println("Sing task done");
    }
}
