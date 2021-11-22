import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import mx.unam.admglp.modelo.entidades.Acceso;
import mx.unam.admglp.modelo.entidades.Usuario;
import mx.unam.admglp.modelo.hibernate.HibernateUtil;
import mx.unam.admglp.servicio.ServicioUsuario;
import mx.unam.admglp.servicio.ServicioUsuarioImpl;
import mx.unam.admglp.servicio.ServicioAcceso;
import mx.unam.admglp.servicio.ServicioAccesoImpl;

public class AccesoMain {
	static Scanner sn = new Scanner(System.in);
	static ServicioAcceso servicioAcceso;
	static ServicioUsuario servicioUsuario;

	public static void cargaMenu() {
		boolean salir = false;
		int opcion; // Guardaremos la opcion del acceso
		do {
			int i = 1;
			System.out.println(i++ + ". Guarda Acceso");
			System.out.println(i++ + ". Actualiza Acceso");
			System.out.println(i++ + ". Elimina Acceso");
			System.out.println(i++ + ". Obtener Acceso");
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
					elimina();
					break;
				case 4:
					get();
					break;
				case 5:
					getAll();
					break;
				case 6:
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
	 * Metodo para guardar un acceso
	 */
	public static void guarda() {
		Integer idUsuario;
		Date fechaInicio = new Date();
		Date fechaReg = new Date();
		Date fechaAct = null;
		Date fechaFin = null;
		String descripcion;
		Integer estatus;

		Acceso acceso = null;
		Boolean salir = false;
		System.out.println("");
		do {
			try {
				List<Usuario> usuarios = servicioUsuario.obtenerTodo();
				for (Usuario usuario : usuarios) {
					System.out.println("ID: " + usuario.getIdUsuario() + " Apodo: " + usuario.getApodo());
				}
				System.out.print("Ingresa el id de usuario a relacionar con el acceso: ");
				idUsuario = Integer.valueOf(sn.nextInt());
				sn.nextLine();

				Usuario usuario = servicioUsuario.obtener(idUsuario);
				if (usuario != null) {
					acceso = new Acceso();
					acceso.setUsuario(usuario);
					acceso.setFechaInicioAcceso(fechaInicio);
					acceso.setFechaFinAcceso(fechaFin);

					System.out.print("Ingresa la descripcion: ");
					descripcion = sn.nextLine();
					acceso.setDescripcion(descripcion);

					acceso.setFecRegistro(fechaReg);
					acceso.setFecActualizacion(fechaAct);

					System.out.print("Ingresa el status: ");
					estatus = sn.nextInt();
					sn.nextLine();
					acceso.setEstatus(estatus);

					servicioAcceso.guardar(acceso);
					salir = true;
				} else {
					throw new IllegalStateException("El usuario no existe");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!salir);
	}

	public static void actualiza() {
		Integer idAcceso;
		String descripcion;
		Integer estatus;
		Date fechaAct = new Date();

		Acceso acceso = null;
		Boolean salir = false;
		System.out.println("");
		do {
			System.out.print("Ingresa el id para actualizar: ");
			idAcceso = Integer.valueOf(sn.nextInt());
			sn.nextLine();
			acceso = servicioAcceso.obtener(idAcceso);
			System.out.println(acceso);
			if (acceso != null) {
				try {
					System.out.print("Ingresa la descripcion(" + acceso.getDescripcion() + "): ");
					descripcion = sn.nextLine();

					System.out.print("Ingresa el status(" + acceso.getEstatus() + "): ");
					estatus = sn.nextInt();
					sn.nextLine();

					acceso.setDescripcion(descripcion);
					acceso.setEstatus(estatus);
					acceso.setFecActualizacion(fechaAct);
					servicioAcceso.actualizar(acceso);
					salir = true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {
				System.out.println("No existe el acceso con id: " + idAcceso);
			}
		} while (!salir);
	}

	public static void elimina() {
		Boolean salir = false;
		Integer id;
		do {
			try {
				System.out.print("Ingresa el id a borrar: ");
				id = Integer.valueOf(sn.nextInt());
				sn.nextLine();
				servicioAcceso.borrar(id);

				System.out.println("Acceso borrado");
				salir = true;
			} catch (Exception e) {
				System.out.println("Campo incorrecto: " + e.getMessage());
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
				Acceso u = servicioAcceso.obtener(id);
				if (u == null) {
					System.out.println("No existe el acceso");
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
			List<Acceso> accesos = servicioAcceso.obtenerTodo();
			if (accesos != null) {
				if (accesos.isEmpty()) {
					System.out.println("La lista de accesos no tiene elementos");
				} else {
					for (Acceso acceso : accesos) {
						System.out.println(acceso);
					}
				}
			} else {
				System.out.println("La lista de accesos es null");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al obtener la lista");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateUtil.init();
		servicioAcceso = ServicioAccesoImpl.getInstance();
		servicioUsuario = ServicioUsuarioImpl.getInstance();
		cargaMenu();
	}

}
