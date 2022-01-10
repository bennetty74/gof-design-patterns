package cn.bugkit.creational.prototype;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class PrototypeTest {
    public static void main(String[] args)  {
        Computer computer = new Computer("id123","Intel i7","Nvidia");
        Object clone = computer.clone();
        System.out.println(computer);
        System.out.println(clone);
    }
}
