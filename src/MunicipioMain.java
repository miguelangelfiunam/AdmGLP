import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import mx.unam.admglp.modelo.entidades.Estado;
import mx.unam.admglp.modelo.entidades.Municipio;
import mx.unam.admglp.modelo.hibernate.HibernateUtil;
import mx.unam.admglp.servicio.ServicioEstado;
import mx.unam.admglp.servicio.ServicioEstadoImpl;
import mx.unam.admglp.servicio.ServicioMunicipio;
import mx.unam.admglp.servicio.ServicioMunicipioImpl;

public class MunicipioMain {
	static Scanner sn = new Scanner(System.in);
	static ServicioEstado servicioEstado;
	static ServicioMunicipio servicioMunicipio;

	public static void cargaMenu() {
		boolean salir = false;
		int opcion; // Guardaremos la opcion del municipio
		do {
			int i = 1;
			System.out.println(i++ + ". Guarda Municipio");
			System.out.println(i++ + ". Actualiza Municipio");
			System.out.println(i++ + ". Obtener Municipio");
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
	 * Metodo para guardar un municipio
	 */
	public static void guarda() {
		Integer idEstado;
		Date fechaReg = new Date();
		Date fechaAct = null;
		String clave;
		String nombre;
		Integer estatus;

		Municipio municipio = null;
		Boolean salir = false;
		System.out.println("");
		do {
			try {
				List<Estado> estados = servicioEstado.obtenerTodo();
				for (Estado estado : estados) {
					System.out.println("ID: " + estado.getId() + " Nombre: " + estado.getNombre());
				}

				System.out.print("Ingresa el id de estado a relacionar: ");
				idEstado = Integer.valueOf(sn.nextInt());
				sn.nextLine();
				Estado estado = servicioEstado.obtener(idEstado);
				if (estado != null) {
					municipio = new Municipio();
					municipio.setEstado(estado);
					System.out.print("Ingresa la clave(3): ");
					clave = sn.nextLine();
					municipio.setClave(clave);

					System.out.print("Ingresa el nombre: ");
					nombre = sn.nextLine();
					municipio.setNombre(nombre);

					municipio.setFecRegistro(fechaReg);
					municipio.setFecActualizacion(fechaAct);

					System.out.print("Ingresa el status: ");
					estatus = sn.nextInt();
					sn.nextLine();
					municipio.setEstatus(estatus);

					servicioMunicipio.guardar(municipio);

				} else {
					System.out.println("Id de estado no existe en la base para relacionar con el nuevo municipio");
				}
				salir = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!salir);
	}

	public static void actualiza() {
		Integer idMunicipio;
		Date fechaAct = new Date();
		String clave;
		String nombre;
		Integer estatus;

		Municipio municipio = null;
		Boolean salir = false;
		System.out.println("");
		do {
			try {
				System.out.print("Ingresa el id de municipio: ");
				idMunicipio = Integer.valueOf(sn.nextInt());
				sn.nextLine();

				municipio = servicioMunicipio.obtener(idMunicipio);
				if (municipio != null) {

					System.out.print("Ingresa la clave(3) (" + municipio.getClave() + "): ");
					clave = sn.nextLine();
					municipio.setClave(clave);

					System.out.print("Ingresa el nombre (" + municipio.getNombre() + "): ");
					nombre = sn.nextLine();
					municipio.setNombre(nombre);

					municipio.setFecActualizacion(fechaAct);

					System.out.print("Ingresa el status (" + municipio.getEstatus() + "): ");
					estatus = sn.nextInt();
					sn.nextLine();
					municipio.setEstatus(estatus);

					servicioMunicipio.actualizar(municipio);
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
				Municipio u = servicioMunicipio.obtener(id);
				if (u == null) {
					System.out.println("No existe el municipio");
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
			List<Municipio> municipios = servicioMunicipio.obtenerTodo();
			if (municipios != null) {
				if (municipios.isEmpty()) {
					System.out.println("La lista de municipios no tiene elementos");
				} else {
					for (Municipio municipio : municipios) {
						System.out.println(municipio);
					}
				}
			} else {
				System.out.println("La lista de municipios es null");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al obtener la lista");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateUtil.init();
		servicioEstado = ServicioEstadoImpl.getInstance();
		servicioMunicipio = ServicioMunicipioImpl.getInstance();
		cargaMenu();
	}

}
