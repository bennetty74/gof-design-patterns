package cn.bugkit.creational.builder;

/**
 * @author bugkit
 * @since 2022.1.10
 */
public class BuilderTest {

    public static void main(String[] args) {

        Computer computer = Computer.builder()
                .cpu("Intel i7")
                .graphics("Nvidia 3-00")
                .id("id:1234")
                .memorySize(16)
                .motherboard("ASUS")
                .mouse("ASUS")
                .build();

        System.out.println(computer);
    }
}
