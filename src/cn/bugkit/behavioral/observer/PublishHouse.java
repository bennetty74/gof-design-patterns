package cn.bugkit.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public class PublishHouse {


    private final List<Observer> observerList;

    public PublishHouse() {
        observerList = new ArrayList<>();
    }

    /**
     * Add observer
     * @param observer {@link Observer}
     */
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * Remove observer
     * @param observer {@link Observer}
     */
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * Add a new newspaper
     * @param newspaper {@link Newspaper}
     */
    public void addNewspaper(Newspaper newspaper) {
        //do something and notify all observers
        notifyObservers(newspaper);
    }

    public void notifyObservers(Newspaper newspaper) {
        for (Observer observer : observerList) {
            observer.consume(newspaper);
        }
    }

}
