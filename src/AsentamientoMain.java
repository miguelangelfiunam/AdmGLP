import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import mx.unam.admglp.modelo.entidades.Municipio;
import mx.unam.admglp.modelo.entidades.Asentamiento;
import mx.unam.admglp.modelo.hibernate.HibernateUtil;
import mx.unam.admglp.servicio.ServicioMunicipio;
import mx.unam.admglp.servicio.ServicioMunicipioImpl;
import mx.unam.admglp.servicio.ServicioAsentamiento;
import mx.unam.admglp.servicio.ServicioAsentamientoImpl;

public class AsentamientoMain {
	static Scanner sn = new Scanner(System.in);
	static ServicioMunicipio servicioMunicipio;
	static ServicioAsentamiento servicioAsentamiento;

	public static void cargaMenu() {
		boolean salir = false;
		int opcion; // Guardaremos la opcion del asentamiento
		do {
			int i = 1;
			System.out.println(i++ + ". Guarda Asentamiento");
			System.out.println(i++ + ". Actualiza Asentamiento");
			System.out.println(i++ + ". Obtener Asentamiento");
			System.out.println(i++ + ". Obtener todo");
			System.out.println(i++ + ". Salir");
			try {
				System.out.print("Escribe una de las opciones: ");
				opcion = sn.nextInt();
				sn.nextLine();
				switch (opcion) {
				case 1:
					guarda();
					break;
				case 2:
					actualiza();
					break;
				case 3:
					get();
					break;
				case 4:
					getAll();
					break;
				case 5:
					salir = true;
					break;
				default:
					System.out.println("Solo números entre 1 y " + i++);
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sn.next();
			}
		} while (!salir);
	}

	/**
	 * Metodo para guardar un asentamiento
	 */
	public static void guarda() {
		Integer idMunicipio;
		Date fechaReg = new Date();
		Date fechaAct = null;
		String clave;
		String codigoPostal;
		String tipo;
		String nombre;
		Integer estatus;

		Asentamiento asentamiento = null;
		Boolean salir = false;
		System.out.println("");
		do {
			try {
				List<Municipio> municipios = servicioMunicipio.obtenerTodo();
				for (Municipio municipio : municipios) {
					System.out.println("ID: " + municipio.getId() + " Nombre: " + municipio.getNombre());
				}

				System.out.print("Ingresa el id de estado a relacionar: ");
				idMunicipio = Integer.valueOf(sn.nextInt());
				sn.nextLine();
				Municipio municipio = servicioMunicipio.obtener(idMunicipio);
				if (municipio != null) {
					asentamiento = new Asentamiento();
					asentamiento.setMunicipio(municipio);
					System.out.print("Ingresa la clave(4): ");
					clave = sn.nextLine();
					asentamiento.setClave(clave);
					
					System.out.print("Ingresa el codigo postal(5): ");
					codigoPostal = sn.nextLine();
					asentamiento.setCodigoPostal(codigoPostal);
					
					System.out.print("Ingresa el tipo de asentamiento: ");
					tipo = sn.nextLine();
					asentamiento.setTipo(tipo);

					System.out.print("Ingresa el nombre: ");
					nombre = sn.nextLine();
					asentamiento.setNombre(nombre);

					asentamiento.setFecRegistro(fechaReg);
					asentamiento.setFecActualizacion(fechaAct);

					System.out.print("Ingresa el status: ");
					estatus = sn.nextInt();
					sn.nextLine();
					asentamiento.setEstatus(estatus);

					servicioAsentamiento.guardar(asentamiento);

				} else {
					System.out.println("Id de municipio no existe en la base para relacionar con el nuevo asentamiento");
				}
				salir = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!salir);
	}

	public static void actualiza() {
		Integer idAsentamiento;
		Date fechaAct = new Date();
		String clave;
		String codigoPostal;
		String tipo;
		String nombre;
		Integer estatus;

		Asentamiento asentamiento = null;
		Boolean salir = false;
		System.out.println("");
		do {
			try {
				System.out.print("Ingresa el id de asentamiento: ");
				idAsentamiento = Integer.valueOf(sn.nextInt());
				sn.nextLine();

				asentamiento = servicioAsentamiento.obtener(idAsentamiento);
				if (asentamiento != null) {

					System.out.print("Ingresa la clave(4) (" + asentamiento.getClave() + "): ");
					clave = sn.nextLine();
					asentamiento.setClave(clave);
					
					System.out.print("Ingresa el codigo postal (5) (" + asentamiento.getCodigoPostal() + "): ");
					codigoPostal = sn.nextLine();
					asentamiento.setCodigoPostal(codigoPostal);
					
					System.out.print("Ingresa el tipo de asentamiento (" + asentamiento.getTipo() + "): ");
					tipo = sn.nextLine();
					asentamiento.setTipo(tipo);

					System.out.print("Ingresa el nombre (" + asentamiento.getNombre() + "): ");
					nombre = sn.nextLine();
					asentamiento.setNombre(nombre);

					asentamiento.setFecActualizacion(fechaAct);

					System.out.print("Ingresa el status (" + asentamiento.getEstatus() + "): ");
					estatus = sn.nextInt();
					sn.nextLine();
					asentamiento.setEstatus(estatus);

					servicioAsentamiento.actualizar(asentamiento);
					salir = true;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!salir);
	}

	public static void get() {
		Boolean salir = false;
		Integer id;
		do {
			try {
				System.out.print("Ingresa el id: ");
				id = Integer.valueOf(sn.nextInt());
				sn.nextLine();
				Asentamiento u = servicioAsentamiento.obtener(id);
				if (u == null) {
					System.out.println("No existe el asentamiento");
				} else {
					System.out.println(u);
				}
				salir = true;
			} catch (Exception e) {
				System.out.println("Campo incorrecto: " + e.getMessage());
			}
		} while (!salir);
	}

	public static void getAll() {
		try {
			List<Asentamiento> asentamientos = servicioAsentamiento.obtenerTodo();
			if (asentamientos != null) {
				if (asentamientos.isEmpty()) {
					System.out.println("La lista de asentamientos no tiene elementos");
				} else {
					for (Asentamiento asentamiento : asentamientos) {
						System.out.println(asentamiento);
					}
				}
			} else {
				System.out.println("La lista de asentamientos es null");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al obtener la lista");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateUtil.init();
		servicioMunicipio = ServicioMunicipioImpl.getInstance();
		servicioAsentamiento = ServicioAsentamientoImpl.getInstance();
		cargaMenu();
	}

}
