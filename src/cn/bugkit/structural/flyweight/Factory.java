package cn.bugkit.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public class Factory {

    List<Worker> workerList;

    public Factory() {
        workerList = new ArrayList<>();
    }

    /**
     * Server the task with workers
     * @param task task
     */
    public void serveTask(Task task) {
        Worker worker = availableWorker();
        if (worker != null) {
            worker.doTask(task);
        }
        addWorker(new DefaultWorker()).doTask(task);
    }

    /**
     * Return the exist available work
     * @return the available worker
     */
    private Worker availableWorker() {
        for (Worker worker : workerList) {
            if (worker.isAvailable()) {
                return worker;
            }
        }
        return null;
    }

    /**
     * add the new worker
     * @param worker worker
     * @return the new worker
     */
    private Worker addWorker(Worker worker) {
        this.workerList.add(worker);
        return worker;
    }
}
