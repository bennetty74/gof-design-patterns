package cn.bugkit.creational.prototype;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class Computer implements Cloneable {

    private String id;
    private String cpu;
    private String graphics;


    public Computer(String id, String cpu, String graphics) {
        this.id = id;
        this.cpu = cpu;
        this.graphics = graphics;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id='" + id + '\'' +
                ", cpu='" + cpu + '\'' +
                ", graphics='" + graphics + '\'' +
                '}';
    }

    @Override
    protected Object clone() {
        return new Computer(id, cpu, graphics);
    }
}
