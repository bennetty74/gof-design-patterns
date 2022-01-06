package cn.bugkit.behavioral.templatemethod;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class TeachersOneDay extends AbstractOneDay{
    @Override
    protected void working() {
        System.out.println("Profession: teacher");
    }

    @Override
    protected void takeTransportation() {
        System.out.println("By bus");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("Breakfast: noodles");
    }

    @Override
    protected void getUp() {
        System.out.println("Get up at 7:00");
    }
}
