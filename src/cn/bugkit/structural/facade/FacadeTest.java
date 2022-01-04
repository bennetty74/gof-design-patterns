package cn.bugkit.structural.facade;

/**
 * @author bugkit
 * @since 2022.1.4
 */
public class FacadeTest {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSenderImpl();
        emailSender.send(new EmailFacade());
    }
}
