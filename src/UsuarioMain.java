import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import mx.unam.admglp.funciones.Funciones;
import mx.unam.admglp.modelo.entidades.Contra;
import mx.unam.admglp.modelo.entidades.Rol;
import mx.unam.admglp.modelo.entidades.Usuario;
import mx.unam.admglp.modelo.hibernate.HibernateUtil;
import mx.unam.admglp.servicio.ServicioContra;
import mx.unam.admglp.servicio.ServicioContraImpl;
import mx.unam.admglp.servicio.ServicioRol;
import mx.unam.admglp.servicio.ServicioUsuario;
import mx.unam.admglp.servicio.ServicioUsuarioImpl;
import mx.unam.admglp.servicio.ServicioUsuarioRol;

public class UsuarioMain {
	static Scanner sn = new Scanner(System.in);
	static ServicioUsuario servicioUsuario;
	static ServicioUsuarioRol servicioUsuarioRol;
	static ServicioRol servicioRol;
	static ServicioContra servicioContra;

	public static void cargaMenu() {
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario
		do {
			int i = 1;
			System.out.println(i++ + ". Guarda Usuario");
			System.out.println(i++ + ". Actualiza Usuario");
			System.out.println(i++ + ". Elimina Usuario");
			System.out.println(i++ + ". Obtener Usuario");
			System.out.println(i++ + ". Obtener todo");
			System.out.println(i++ + ". Obtener por estatus");
			System.out.println(i++ + ". Obtener por id de rol");

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
					getByIdEstatus();
					break;
				case 7:
					getByIdRol();
					break;
				case 8:
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
	 * Metodo para guardar un usuario
	 */
	public static void guarda() {
		String apodo;
		String correo1;
		String correo2;
		String nombre;
		String ap1;
		String ap2;
		Integer edad;
		String strFechaNac;
		Date fechaNac;
		String tel1;
		String tel2;
		Date fechaReg = new Date();
		Date fechaAct = null;
		Integer status;
		Usuario usu = null;
		Boolean salir = false;
		System.out.println("");
		do {
			try {
				Contra contra = new Contra();
				contra.setFecRegistro(fechaReg);
				contra.setFecActualizacion(fechaAct);

				System.out.print("Ingresa cifrado de la contraseña: ");
				String cifrado = sn.nextLine();
				contra.setContraCifrado(cifrado);

				System.out.print("Ingresa el status de la contraseña: ");
				Integer estatus = sn.nextInt();
				sn.nextLine();
				contra.setEstatus(estatus);

				servicioContra.guardar(contra);
				
				
				
				System.out.print("Ingresa el apodo: ");
				apodo = sn.nextLine();
				System.out.print("Ingresa el correo1: ");
				correo1 = sn.nextLine();
				System.out.print("Ingresa el correo2: ");
				correo2 = sn.nextLine();
				System.out.print("Ingresa el nombre: ");
				nombre = sn.nextLine();
				System.out.print("Ingresa el ap1: ");
				ap1 = sn.nextLine();
				System.out.print("Ingresa el ap2: ");
				ap2 = sn.nextLine();
				System.out.print("Ingresa la edad: ");
				edad = sn.nextInt();
				sn.nextLine();
				System.out.print("Ingresa la fecha de nacimiento (dd/mm/yyyy): ");
				strFechaNac = sn.nextLine();
				fechaNac = Funciones.convierteCadenaADate(strFechaNac);

				System.out.print("Ingresa el tel1: ");
				tel1 = sn.nextLine();
				System.out.print("Ingresa el tel2: ");
				tel2 = sn.nextLine();
				System.out.print("Ingresa el status: ");
				status = sn.nextInt();
				sn.nextLine();
				usu = new Usuario();
				usu.setContra(contra);
				usu.setApodo(apodo);
				usu.setCorreo1(correo1);
				usu.setCorreo2(correo2);
				usu.setNombre(nombre);
				usu.setApellido1(ap1);
				usu.setApellido2(ap2);
				usu.setEdad(edad);
				usu.setFechaNacimiento(fechaNac);
				usu.setTelefono1(tel1);
				usu.setTelefono2(tel2);
				usu.setFecRegistro(fechaReg);
				usu.setFecActualizacion(fechaAct);
				usu.setEstatus(status);

				servicioUsuario.guardar(usu);
				salir = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!salir);
	}

	public static void actualiza() {
		Integer id;
		String apodo;
		String correo1;
		String correo2;
		String nombre;
		String ap1;
		String ap2;
		Integer edad;
		String strFechaNac;
		Date fechaNac;
		String tel1;
		String tel2;
		Date fechaReg = new Date();
		Date fechaAct = null;
		Integer status;
		Usuario usu = null;
		Boolean salir = false;
		do {
			List<Usuario> usuarios = servicioUsuario.obtenerTodo();
			for (Usuario usu2 : usuarios) {
				System.out.println("ID: " + usu2.getIdUsuario() + " Nombre: " + usu2.getApodo());
			}
			System.out.print("Ingresa el id para actualizar: ");
			id = Integer.valueOf(sn.nextInt());
			sn.nextLine();
			usu = servicioUsuario.obtener(id);
			System.out.println(usu);
			if (usu != null) {
				try {
					System.out.print("Ingresa el apodo(" + usu.getApodo() + "): ");
					apodo = sn.nextLine();
					System.out.print("Ingresa el correo1(" + usu.getCorreo1() + "): ");
					correo1 = sn.nextLine();
					System.out.print("Ingresa el correo2(" + usu.getCorreo2() + "): ");
					correo2 = sn.nextLine();
					System.out.print("Ingresa el nombre(" + usu.getNombre() + "): ");
					nombre = sn.nextLine();
					System.out.print("Ingresa el ap1(" + usu.getApellido1() + "): ");
					ap1 = sn.nextLine();
					System.out.print("Ingresa el ap2(" + usu.getApellido2() + "): ");
					ap2 = sn.nextLine();
					System.out.print("Ingresa la edad(" + usu.getEdad() + "): ");
					edad = sn.nextInt();
					sn.nextLine();
					System.out.print("Ingresa la fecha de nacimiento (dd/mm/yyyy)(" + usu.getFechaNacimiento() + "): ");
					strFechaNac = sn.nextLine();
					fechaNac = Funciones.convierteCadenaADate(strFechaNac);

					System.out.print("Ingresa el tel1(" + usu.getTelefono1() + "): ");
					tel1 = sn.nextLine();
					System.out.print("Ingresa el tel2(" + usu.getTelefono2() + "): ");
					tel2 = sn.nextLine();
					System.out.print("Ingresa el status(" + usu.getEstatus() + "): ");
					status = sn.nextInt();
					sn.nextLine();

					usu.setApodo(apodo);
					usu.setCorreo1(correo1);
					usu.setCorreo2(correo2);
					usu.setNombre(nombre);
					usu.setApellido1(ap1);
					usu.setApellido2(ap2);
					usu.setEdad(edad);
					usu.setFechaNacimiento(fechaNac);
					usu.setTelefono1(tel1);
					usu.setTelefono2(tel2);
					usu.setFecRegistro(fechaReg);
					usu.setFecActualizacion(fechaAct);
					usu.setEstatus(status);

					servicioUsuario.actualizar(usu);
					salir = true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {
				System.out.println("No existe el usuario con id: " + id);
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
				servicioUsuario.borrar(id);

				System.out.println("Usuario borrado");
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
				Usuario u = servicioUsuario.obtener(id);
				if (u == null) {
					System.out.println("No existe el usuario");
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
			List<Usuario> usuarios = servicioUsuario.obtenerTodo();
			if (usuarios != null) {
				if (usuarios.isEmpty()) {
					System.out.println("La lista de usuarios no tiene elementos");
				} else {
					for (Usuario usuario : usuarios) {
						System.out.println(usuario);
					}
				}
			} else {
				System.out.println("La lista de usuarios es null");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al obtener la lista: " + e.getMessage());
		}

	}
	
	public static void getByIdEstatus() {
		try {
			System.out.print("Ingresa el estatus: ");
			Integer idEstatus = Integer.valueOf(sn.nextInt());
			sn.nextLine();
			List<Usuario> usuarios = servicioUsuario.getContactosByIdEstaus(idEstatus);
			if (usuarios != null) {
				if (usuarios.isEmpty()) {
					System.out.println("La lista de usuarios no tiene elementos");
				} else {
					for (Usuario usuario : usuarios) {
						System.out.println(usuario);
					}
				}
			} else {
				System.out.println("La lista de usuarios es null");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al obtener la lista: " + e.getMessage());
		}

	}
	
	public static void getByIdRol() {
		try {
			System.out.print("Ingresa el id de rol: ");
			Integer idRol = Integer.valueOf(sn.nextInt());
			sn.nextLine();
			List<Usuario> usuarios = servicioUsuario.getContactosByIdRol(idRol);
			if (usuarios != null) {
				if (usuarios.isEmpty()) {
					System.out.println("La lista de usuarios no tiene elementos");
				} else {
					for (Usuario usuario : usuarios) {
						System.out.println(usuario);
					}
				}
			} else {
				System.out.println("La lista de usuarios es null");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al obtener la lista: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateUtil.init();
		servicioUsuario = ServicioUsuarioImpl.getInstance();
		servicioContra =  ServicioContraImpl.getInstance();
		cargaMenu();
	}

}
