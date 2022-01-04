package cn.bugkit.structural.facade;

import java.util.List;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class EmailFacade {
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

    public List<String> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<String> receivers) {
        this.receivers = receivers;
    }

    public List<String> getCcs() {
        return ccs;
    }

    public void setCcs(List<String> ccs) {
        this.ccs = ccs;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public List<Object> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }
}
