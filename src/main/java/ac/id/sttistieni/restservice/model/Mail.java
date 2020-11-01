package ac.id.sttistieni.restservice.model;

import java.io.Serializable;

public class Mail implements Serializable {
    private String subject;
    private String recipient;
    private String body;
    private String contentType;

    public Mail() {
        contentType = "text/plain";
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
