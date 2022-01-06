package cn.bugkit.behavioral.templatemethod;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class DoctorsOneDay extends AbstractOneDay{

    @Override
    protected void working() {
        System.out.println("Profession: doctor");
    }

    @Override
    protected void takeTransportation() {
        System.out.println("By walking");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("Breakfast: bread");
    }

    @Override
    protected void getUp() {
        System.out.println("Get up at 8:00");
    }
}
