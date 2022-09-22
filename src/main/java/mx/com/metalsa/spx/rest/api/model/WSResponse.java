package mx.com.metalsa.spx.rest.api.model;

import lombok.*;

import java.io.Serializable;

/**
 * Clase que mantiene el modelo para la respuesta del endpoint de los servicios de Integracion
 * @author Kenenias B. Perez Betanzos
 * @since 14/09/2022
 * @version 1.0
 */
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

