package cn.bugkit.behavioral.observer;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public interface Observer {

    void subscribe(PublishHouse publishHouse);

    void unsubscribe(PublishHouse publishHouse);

    void consume(Newspaper newspaper);
}
