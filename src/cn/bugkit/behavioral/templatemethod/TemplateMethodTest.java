package cn.bugkit.behavioral.templatemethod;

/**
 * @author bugkit
 * @since 2022.1.6
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractOneDay doctorsOneDay = new DoctorsOneDay();
        AbstractOneDay teachersOneDay = new TeachersOneDay();

        doctorsOneDay.oneDay();
        System.out.println("----------------------");
        teachersOneDay.oneDay();
    }
}
