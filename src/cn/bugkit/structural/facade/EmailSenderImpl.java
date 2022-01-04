package cn.bugkit.structural.facade;

import java.util.List;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class EmailSenderImpl implements EmailSender{

    private final InternalEmail email;


    public EmailSenderImpl() {
        this.email = new InternalEmail();
    }
    void setReceivers(EmailFacade emailFacade) {
        email.receivers = emailFacade.getReceivers();
    }

    void setCCs(EmailFacade emailFacade) {
        email.ccs = emailFacade.getCcs();
    }

    void setSubject(EmailFacade emailFacade) {
        email.subject = emailFacade.getSubject();
    }

    void setBody(EmailFacade emailFacade) {
        email.body = emailFacade.getBody();
    }

    void setAttachments(EmailFacade emailFacade) {
        email.attachments = emailFacade.getAttachments();
    }

    /**
     * Encapsulates the conversion process from {@link EmailFacade} to {@link InternalEmail}
     * @param emailFacade the email data
     */
    @Override
    public void send(EmailFacade emailFacade) {
        this.setSubject(emailFacade);
        this.setBody(emailFacade);
        this.setAttachments(emailFacade);
        this.setReceivers(emailFacade);
        this.setCCs(emailFacade);
        System.out.println("====send done=====");
    }

    private static class InternalEmail{
        /**
         * the email receivers
         */
        private List<String> receivers;
        /**
         * the email ccs
         */
        private List<String> ccs;
        /**
         * the email subject
         */
        private String subject;
        /**
         * the email body
         */
        private Object body;
        /**
         * the email attachments
         */
        private List<Object> attachments;
    }

}
