package mx.com.metalsa.spx.rest.api.model;

import lombok.*;

import java.io.Serializable;


@EqualsAndHashCode
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class WSResponse implements Serializable {

    private Integer code;
    private String message;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

