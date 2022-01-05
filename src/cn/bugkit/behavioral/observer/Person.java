package cn.bugkit.behavioral.observer;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public class Person implements Observer{



    @Override
    public void subscribe(PublishHouse publishHouse) {
        publishHouse.addObserver(this);
    }

    @Override
    public void unsubscribe(PublishHouse publishHouse) {
        publishHouse.removeObserver(this);
    }

    @Override
    public void consume(Newspaper newspaper) {
        System.out.println(newspaper);
    }
}
