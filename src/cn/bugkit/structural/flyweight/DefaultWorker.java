package cn.bugkit.structural.flyweight;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public class DefaultWorker implements Worker{

    @Override
    public void doTask(Task task) {
        task.execute();
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}
