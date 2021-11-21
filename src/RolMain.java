import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import mx.unam.admglp.modelo.entidades.Rol;
import mx.unam.admglp.modelo.entidades.Usuario;
import mx.unam.admglp.modelo.hibernate.HibernateUtil;
import mx.unam.admglp.servicio.ServicioUsuario;
import mx.unam.admglp.servicio.ServicioUsuarioImpl;
import mx.unam.admglp.servicio.ServicioRol;
import mx.unam.admglp.servicio.ServicioRolImpl;

public class RolMain {
	static Scanner sn = new Scanner(System.in);
	static ServicioRol servicioRol;

	public static void cargaMenu() {
		boolean salir = false;
		int opcion; // Guardaremos la opcion del rol
		do {
			int i = 1;
			System.out.println(i++ + ". Guarda Rol");
			System.out.println(i++ + ". Actualiza Rol");
			System.out.println(i++ + ". Elimina Rol");
			System.out.println(i++ + ". Obtener Rol");
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
	 * Metodo para guardar un rol
	 */
	public static void guarda() {
		String nombre;
		String tipo;
		Date fechaReg = new Date();
		Date fechaAct = null;
		Integer estatus;

		Rol rol = null;
		Boolean salir = false;
		System.out.println("");
		do {
			try {
				rol = new Rol();
				rol.setFecRegistro(fechaReg);
				rol.setFecActualizacion(fechaAct);

				System.out.print("Ingresa el nombre: ");
				nombre = sn.nextLine();
				rol.setNombre(nombre);
				
				System.out.print("Ingresa el tipo: ");
				tipo = sn.nextLine();
				rol.setTipo(tipo);

				System.out.print("Ingresa el status: ");
				estatus = sn.nextInt();
				sn.nextLine();
				rol.setEstatus(estatus);

				servicioRol.guardar(rol);
				salir = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!salir);
	}

	public static void actualiza() {
		Integer idRol;
		String nombre;
		String tipo;
		Integer estatus;

		Rol rol = null;
		Boolean salir = false;
		System.out.println("");
		do {
			System.out.print("Ingresa el id para actualizar: ");
			idRol = Integer.valueOf(sn.nextInt());
			sn.nextLine();
			rol = servicioRol.obtener(idRol);
			System.out.println(rol);
			if (rol != null) {
				try {
					System.out.print("Ingresa la descripcion(" + rol.getNombre() + "): ");
					nombre = sn.nextLine();
					
					System.out.print("Ingresa la descripcion(" + rol.getTipo() + "): ");
					tipo = sn.nextLine();

					System.out.print("Ingresa el status(" + rol.getEstatus() + "): ");
					estatus = sn.nextInt();
					sn.nextLine();

					rol.setNombre(nombre);
					rol.setTipo(tipo);
					rol.setEstatus(estatus);

					servicioRol.actualizar(rol);
					salir = true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {
				System.out.println("No existe el rol con id: " + idRol);
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
				servicioRol.borrar(id);

				System.out.println("Rol borrado");
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
				Rol u = servicioRol.obtener(id);
				if (u == null) {
					System.out.println("No existe el rol");
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
			List<Rol> rols = servicioRol.obtenerTodo();
			if (rols != null) {
				if (rols.isEmpty()) {
					System.out.println("La lista de rols no tiene elementos");
				} else {
					for (Rol rol : rols) {
						System.out.println(rol);
					}
				}
			} else {
				System.out.println("La lista de roles es null");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al obtener la lista");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateUtil.init();
		servicioRol = ServicioRolImpl.getInstance();
		cargaMenu();
	}

}
