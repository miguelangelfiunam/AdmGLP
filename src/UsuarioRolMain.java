import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import mx.unam.admglp.modelo.entidades.UsuarioRol;
import mx.unam.admglp.modelo.entidades.Rol;
import mx.unam.admglp.modelo.entidades.Usuario;
import mx.unam.admglp.modelo.hibernate.HibernateUtil;
import mx.unam.admglp.servicio.ServicioRol;
import mx.unam.admglp.servicio.ServicioRolImpl;
import mx.unam.admglp.servicio.ServicioUsuario;
import mx.unam.admglp.servicio.ServicioUsuarioImpl;
import mx.unam.admglp.servicio.ServicioUsuarioRol;
import mx.unam.admglp.servicio.ServicioUsuarioRolImpl;

public class UsuarioRolMain {
	static Scanner sn = new Scanner(System.in);
	static ServicioUsuarioRol servicioUsuarioRol;
	static ServicioUsuario servicioUsuario;
	static ServicioRol servicioRol;

	public static void cargaMenu() {
		boolean salir = false;
		int opcion; // Guardaremos la opcion del rol
		do {
			int i = 1;
			System.out.println(i++ + ". Guarda UsuarioRol");
			System.out.println(i++ + ". Actualiza UsuarioRol");
			System.out.println(i++ + ". Elimina UsuarioRol");
			System.out.println(i++ + ". Obtener UsuarioRol");
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
		Integer idUsuario;
		Integer idRol;
		Date fechaReg = new Date();
		Date fechaAct = null;
		Integer estatus;

		UsuarioRol usuarioRol = null;
		Boolean salir = false;
		System.out.println("");
		do {
			try {
				usuarioRol = new UsuarioRol();
				usuarioRol.setFecRegistro(fechaReg);
				usuarioRol.setFecActualizacion(fechaAct);

				System.out.print("Ingresa el id de usuario: ");
				idUsuario = Integer.valueOf(sn.nextInt());
				sn.nextLine();
				
				Usuario usuario = servicioUsuario.obtener(idUsuario);
				if (usuario != null) {
					usuarioRol.setUsuario(usuario);
				}

				System.out.print("Ingresa el id de rol: ");
				idRol = Integer.valueOf(sn.nextInt());
				sn.nextLine();
				
				Rol rol = servicioRol.obtener(idRol);
				if (rol != null) {
					usuarioRol.setRol(rol);
				}

				System.out.print("Ingresa el status: ");
				estatus = sn.nextInt();
				sn.nextLine();
				usuarioRol.setEstatus(estatus);

				servicioUsuarioRol.guardar(usuarioRol);
				salir = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!salir);
	}

	public static void actualiza() {
		Integer idUsuarioRol;
		Integer idUsuario;
		Integer idRol;
		Integer estatus;
		Date fechaAct = new Date();

		UsuarioRol usuarioRol = null;
		Boolean salir = false;
		System.out.println("");
		do {
			System.out.print("Ingresa el id de la relacion para actualizar: ");
			idUsuarioRol = Integer.valueOf(sn.nextInt());
			sn.nextLine();
			usuarioRol = servicioUsuarioRol.obtener(idUsuarioRol);
			System.out.println(usuarioRol);
			if (usuarioRol != null) {
				try {
					System.out.print("Ingresa el id de usuario(" + usuarioRol.getUsuario().getIdUsuario() + "): ");
					idUsuario = Integer.valueOf(sn.nextInt());
					sn.nextLine();
					
					Usuario usuarioNuevo = servicioUsuario.obtener(idUsuario);
					if (usuarioNuevo != null) {
						usuarioRol.setUsuario(usuarioNuevo);
					}

					System.out.print("Ingresa el id de rol(" + usuarioRol.getRol().getIdRol() + "): ");
					idRol = Integer.valueOf(sn.nextInt());
					sn.nextLine();
					
					Rol rolNuevo = servicioRol.obtener(idRol);
					if (usuarioNuevo != null) {
						usuarioRol.setRol(rolNuevo);
					}

					System.out.print("Ingresa el status(" + usuarioRol.getEstatus() + "): ");
					estatus = sn.nextInt();
					sn.nextLine();
					usuarioRol.setEstatus(estatus);
					usuarioRol.setFecActualizacion(fechaAct);

					servicioUsuarioRol.actualizar(usuarioRol);
					salir = true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {
				System.out.println("No existe la relacion del usuario con rol con id: " + idUsuarioRol);
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
				servicioUsuarioRol.borrar(id);

				System.out.println("UsuarioRol borrado");
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
				UsuarioRol u = servicioUsuarioRol.obtener(id);
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
			List<UsuarioRol> rols = servicioUsuarioRol.obtenerTodo();
			if (rols != null) {
				if (rols.isEmpty()) {
					System.out.println("La lista de rols no tiene elementos");
				} else {
					for (UsuarioRol rol : rols) {
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
		servicioUsuario = ServicioUsuarioImpl.getInstance();
		servicioRol = ServicioRolImpl.getInstance();
		servicioUsuarioRol = ServicioUsuarioRolImpl.getInstance();
		cargaMenu();
	}

}
