package cn.bugkit.structural.proxy;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public interface Worker {

    /**
     * Do task
     * @param task {@link Task}
     * @return true if the task done, false otherwise
     */
    boolean doTask(Task task);

}
