package mx.com.metalsa.spx.rest.api.service;

/**
 * Intefaz que mantiene los metodos para verificar que el servicio se encuentre disponible
 * @author Kenenias B. Perez Betanzos
 * @since 19/09/2022
 * @version 1.0
 */
public interface InfoService {

	/**
	 * Metodo que muestra informacion del servicio
	 * @return String con la informacion de que el servicio se encuentra disponible
	 */
	String getInfo();
	
}
