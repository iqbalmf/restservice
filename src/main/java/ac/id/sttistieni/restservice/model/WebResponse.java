package ac.id.sttistieni.restservice.model;

public class WebResponse<T> {
    private Integer code;
    private String status;
    private T content;

    public WebResponse(Integer code, String status, T content) {
        this.code = code;
        this.status = status;
        this.content = content;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
