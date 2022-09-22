package mx.com.metalsa.spx.rest.api.exception;

/**
 * Clase para manejar una exception personalizada del servicio de Integracion
 * @author Kenenias B. Perez Betanzos
 * @since 20/09/2022
 * @version 1.0
 */
public class IntegrationException extends RuntimeException{

    private String message;

    public IntegrationException(String message) {
        super(message);
        this.message = message;
    }

    public IntegrationException(){
        
    }
}
