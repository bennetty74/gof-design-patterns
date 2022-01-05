package cn.bugkit.behavioral.observer;

/**
 * @author bugkit
 * @since 2022.1.5
 */
public class ObserverTest {
    public static void main(String[] args) {

        PublishHouse publishHouse = new PublishHouse();

        Observer observer1 = new Person();
        Observer observer2 = new Person();
        Observer observer3 = new Person();

        // subscribe
        observer1.subscribe(publishHouse);
        observer2.subscribe(publishHouse);

        publishHouse.addNewspaper(new Newspaper("Newspaper1"));
        System.out.println();

        observer3.subscribe(publishHouse);
        publishHouse.addNewspaper(new Newspaper("Newspaper2"));

        System.out.println();
        observer2.unsubscribe(publishHouse);
        publishHouse.addNewspaper(new Newspaper("Newspaper3"));

    }
}
