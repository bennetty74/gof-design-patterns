package cn.bugkit.structural.facade;

/**
 * Responsible for create and sendEmail
 * @author bugkit
 * @since 2021.12.30
 */
public interface EmailSender {


    /**
     * send emailFacade according to emailFacade data
     * @param emailFacade the email data
     */
    void send(EmailFacade emailFacade);
}
