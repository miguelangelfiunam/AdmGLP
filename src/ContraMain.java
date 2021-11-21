import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import mx.unam.admglp.modelo.entidades.Contra;
import mx.unam.admglp.modelo.entidades.Usuario;
import mx.unam.admglp.modelo.hibernate.HibernateUtil;
import mx.unam.admglp.servicio.ServicioUsuario;
import mx.unam.admglp.servicio.ServicioUsuarioImpl;
import mx.unam.admglp.servicio.ServicioContra;
import mx.unam.admglp.servicio.ServicioContraImpl;

public class ContraMain {
	static Scanner sn = new Scanner(System.in);
	static ServicioContra servicioContra;
	static ServicioUsuario servicioUsuario;

	public static void cargaMenu() {
		boolean salir = false;
		int opcion; // Guardaremos la opcion del contra
		do {
			int i = 1;
			System.out.println(i++ + ". Guarda Contra");
			System.out.println(i++ + ". Actualiza Contra");
			System.out.println(i++ + ". Obtener Contra");
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
	 * Metodo para guardar un contra
	 */
	public static void guarda() {
		Integer idUsuario;
		Date fechaReg = new Date();
		Date fechaAct = null;
		String cifrado;
		Integer estatus;

		Contra contra = null;
		Boolean salir = false;
		System.out.println("");
		do {
			try {

				System.out.print("Ingresa el id de usuario a relacionar con la contra: ");
				idUsuario = Integer.valueOf(sn.nextInt());
				sn.nextLine();

				Usuario usuario = servicioUsuario.obtener(idUsuario);
				if (usuario != null) {
					contra = new Contra();
					contra.setUsuario(usuario);
					contra.setFecRegistro(fechaReg);
					contra.setFecActualizacion(fechaAct);

					System.out.print("Ingresa cifrado: ");
					cifrado = sn.nextLine();
					contra.setContraCifrado(cifrado);

					System.out.print("Ingresa el status: ");
					estatus = sn.nextInt();
					sn.nextLine();
					contra.setEstatus(estatus);

					servicioContra.guardar(contra);
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
		Integer idContra;
		String cifrado;
		Integer estatus;
		Date fechaAct = new Date();
		Contra contra = null;
		Boolean salir = false;
		System.out.println("");
		do {
			System.out.print("Ingresa el id para actualizar: ");
			idContra = Integer.valueOf(sn.nextInt());
			sn.nextLine();
			contra = servicioContra.obtener(idContra);
			System.out.println(contra);
			if (contra != null) {
				try {
					System.out.print("Ingresa el cifrado(" + contra.getContraCifrado() + "): ");
					cifrado = sn.nextLine();

					System.out.print("Ingresa el status(" + contra.getEstatus() + "): ");
					estatus = sn.nextInt();
					sn.nextLine();

					contra.setContraCifrado(cifrado);
					contra.setEstatus(estatus);
					contra.setFecActualizacion(fechaAct);
					servicioContra.actualizar(contra);
					salir = true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {
				System.out.println("No existe el contra con id: " + idContra);
			}
		} while (!salir);
	}

	public static void elimina() {
		Boolean salir = false;
		Integer id;
		do {
			try {
				servicioContra.borrar(id);
				System.out.println("Contra borrado");
				salir = true;
			} catch (Exception e) {
				System.out.println("Campo incorrecto: " + e.getMessage());
			}
		} while (!salir);
	}
	
	public static void eliminaPorUsuario() {
		Boolean salir = false;
		Integer id;
		do {
			try {
				System.out.print("Ingresa el id de usuario: ");
				id = Integer.valueOf(sn.nextInt());
				sn.nextLine();
				Usuario usuario = servicioUsuario.obtener(id);
				servicioContra.borrar(id);
				System.out.println("Contra borrado");
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
				Contra u = servicioContra.obtener(id);
				if (u == null) {
					System.out.println("No existe el contra");
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
			List<Contra> contras = servicioContra.obtenerTodo();
			if (contras != null) {
				if (contras.isEmpty()) {
					System.out.println("La lista de contras no tiene elementos");
				} else {
					for (Contra contra : contras) {
						System.out.println(contra);
					}
				}
			} else {
				System.out.println("La lista de contras es null");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al obtener la lista: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateUtil.init();
		servicioContra = ServicioContraImpl.getInstance();
		servicioUsuario = ServicioUsuarioImpl.getInstance();
		cargaMenu();
	}

}
