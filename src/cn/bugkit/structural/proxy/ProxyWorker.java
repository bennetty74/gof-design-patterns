package cn.bugkit.structural.proxy;

/**
 * The proxy worker class,which is used to record  working duration
 * @author bugkit
 * @since 2022.1.4
 */
public class ProxyWorker implements Worker{

    private final Worker worker;

    public ProxyWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public boolean doTask(Task task) {
        long start = System.currentTimeMillis();
        boolean res =  worker.doTask(task);
        System.out.println("Duration: " + (System.currentTimeMillis() - start));
        return res;
    }
}
