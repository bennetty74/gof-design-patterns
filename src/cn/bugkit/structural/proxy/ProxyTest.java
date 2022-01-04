package cn.bugkit.structural.proxy;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public class ProxyTest {
    public static void main(String[] args) {
        Worker worker = new DefaultWorker();
        Worker proxyWorker = new ProxyWorker(worker);
        proxyWorker.doTask(new SingTask());
    }
}
