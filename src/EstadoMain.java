import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import mx.unam.admglp.modelo.entidades.Estado;
import mx.unam.admglp.modelo.hibernate.HibernateUtil;
import mx.unam.admglp.servicio.ServicioEstado;
import mx.unam.admglp.servicio.ServicioEstadoImpl;

public class EstadoMain {
	static Scanner sn = new Scanner(System.in);
	static ServicioEstado servicioEstado;

	public static void cargaMenu() {
		boolean salir = false;
		int opcion; // Guardaremos la opcion del estado
		do {
			int i = 1;
			System.out.println(i++ + ". Guarda Estado");
			System.out.println(i++ + ". Actualiza Estado");
			System.out.println(i++ + ". Obtener Estado");
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
	 * Metodo para guardar un estado
	 */
	public static void guarda() {
		Date fechaReg = new Date();
		Date fechaAct = null;
		String clave;
		String nombre;
		Integer estatus;

		Estado estado = null;
		Boolean salir = false;
		System.out.println("");
		do {
			try {

				estado = new Estado();
				System.out.print("Ingresa la clave(2): ");
				clave = sn.nextLine();
				estado.setClave(clave);

				System.out.print("Ingresa el nombre: ");
				nombre = sn.nextLine();
				estado.setNombre(nombre);

				estado.setFecRegistro(fechaReg);
				estado.setFecActualizacion(fechaAct);

				System.out.print("Ingresa el status: ");
				estatus = sn.nextInt();
				sn.nextLine();
				estado.setEstatus(estatus);

				servicioEstado.guardar(estado);
				salir = true;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!salir);
	}

	public static void actualiza() {
		Integer idEstado;
		Date fechaAct = new Date();
		String clave;
		String nombre;
		Integer estatus;

		Estado estado = null;
		Boolean salir = false;
		System.out.println("");
		do {
			try {
				List<Estado> estados = servicioEstado.obtenerTodo();
				for (Estado estado2 : estados) {
					System.out.println("ID: " + estado2.getId() + " Nombre: " + estado2.getNombre());
				}
				System.out.print("Ingresa el id de estado: ");
				idEstado = Integer.valueOf(sn.nextInt());
				sn.nextLine();

				estado = servicioEstado.obtener(idEstado);
				if (estado != null) {

					System.out.print("Ingresa la clave(2) (" + estado.getClave() + "): ");
					clave = sn.nextLine();
					estado.setClave(clave);

					System.out.print("Ingresa el nombre (" + estado.getNombre() + "): ");
					nombre = sn.nextLine();
					estado.setNombre(nombre);

					estado.setFecActualizacion(fechaAct);

					System.out.print("Ingresa el status (" + estado.getEstatus() + "): ");
					estatus = sn.nextInt();
					sn.nextLine();
					estado.setEstatus(estatus);

					servicioEstado.actualizar(estado);
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
				Estado u = servicioEstado.obtener(id);
				if (u == null) {
					System.out.println("No existe el estado");
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
			List<Estado> estados = servicioEstado.obtenerTodo();
			if (estados != null) {
				if (estados.isEmpty()) {
					System.out.println("La lista de estados no tiene elementos");
				} else {
					for (Estado estado : estados) {
						System.out.println(estado);
					}
				}
			} else {
				System.out.println("La lista de estados es null");
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
		cargaMenu();
	}

}
