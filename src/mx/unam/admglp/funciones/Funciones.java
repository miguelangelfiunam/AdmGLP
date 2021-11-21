package mx.unam.admglp.funciones;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funciones {

//	Exception error;
//
//	public Exception getError() {
//		return error;
//	}

	/**
	 * Metodo para convertir una cadena a Date
	 * 
	 * @param cadena String con formato dd/mm/yyyy
	 * @return
	 */
	public static Date convierteCadenaADate(String strFecha) {
		Date fecha = null;
		try {
			fecha = new SimpleDateFormat("dd/MM/yyyy").parse(strFecha);
		} catch (Exception e) {
			// TODO: handle exception
			throw new IllegalStateException("Error en Funciones -> convierteCadenaADate: " + e.getMessage());
		}
		return fecha;
	}
}
