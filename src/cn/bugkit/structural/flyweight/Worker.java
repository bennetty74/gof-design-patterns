package cn.bugkit.structural.flyweight;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public interface Worker {

    void doTask(Task task);

    /**
     * Check the worker whether available
     * @return true available, false otherwise
     */
    boolean isAvailable();
}
