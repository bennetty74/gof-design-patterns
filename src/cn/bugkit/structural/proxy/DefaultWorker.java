package cn.bugkit.structural.proxy;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public class DefaultWorker implements Worker{
    @Override
    public boolean doTask(Task task) {
        task.execute();
        return true;
    }
}
