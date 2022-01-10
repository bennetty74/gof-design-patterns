package cn.bugkit.creational.builder;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class Computer {
    private String id;
    private String cpu;
    private String graphics;
    private String motherboard;
    private int memorySize;
    private String mouse;

    @Override
    public String toString() {
        return "Computer{" +
                "id='" + id + '\'' +
                ", cpu='" + cpu + '\'' +
                ", graphics='" + graphics + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", memorySize=" + memorySize +
                ", mouse='" + mouse + '\'' +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{

        private final Computer computer;

        public Builder() {
            this.computer = new Computer();
        }

        public Builder id(String id){
            computer.id = id;
            return this;
        }

        public Builder cpu(String cpu) {
            computer.cpu = cpu;
            return this;
        }

        public Builder graphics(String graphics) {
            computer.graphics = graphics;
            return this;
        }

        public Builder motherboard(String motherBoard) {
            computer.motherboard = motherBoard;
            return this;
        }

        public Builder memorySize(int size) {
            computer.memorySize = size;
            return this;
        }

        public Builder mouse(String mouse) {
            computer.mouse = mouse;
            return this;
        }

        public Computer build() {
            return computer;
        }

    }
}
