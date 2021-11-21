package mx.unam.admglp.modelo.entidades;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.sun.istack.NotNull;

/**
 * Clase Usuario
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.1
 * @since 07/10/2021 - 20/11/2021
 * 
 */
@Entity
@Table(name = "t_usuario")
public class Usuario {
	private Integer idUsuario; // Identificador de usuario
	private String apodo; // Seudonimo del usuario en la aplicacion
	private String correo1; // Correo electronico
	private String correo2; // Correo electronico
	private String nombre; // Nombre de la persona 100
	private String apellido1; // Primer apellido 100
	private String apellido2; // Segundo apellido 100
	private Integer edad;// Edad de la persona
	private Date fechaNacimiento; // Fecha de nacimiento
	private String telefono1; // Telefono del usuario
	private String telefono2; // Segundo telefono de contacto
	private Date fecRegistro; // Fecha de Inicio de acceso a la aplicacion
	private Date fecActualizacion; // Fecha de fin de acceso a la aplicacion
	private Integer estatus; // Estado del usuario
	private Set<UsuarioRol> usuariosRoles;

	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdUsuario() {
		return idUsuario;
	}

	@Column(name = "usuario_vc_apodo", length = 40, unique = true)
	@NotNull
	public String getApodo() {
		return apodo;
	}

	@Column(name = "usuario_vc_correo1", length = 80)
	@NotNull
	public String getCorreo1() {
		return correo1;
	}

	@Column(name = "usuario_vc_correo2", length = 80)
	public String getCorreo2() {
		return correo2;
	}

	@Column(name = "usuario_vc_nombre", length = 50)
	@NotNull
	public String getNombre() {
		return nombre;
	}

	@Column(name = "usuario_vc_apellido1", length = 50)
	@NotNull
	public String getApellido1() {
		return apellido1;
	}

	@Column(name = "usuario_vc_apellido2", length = 50)
	@NotNull
	public String getApellido2() {
		return apellido2;
	}

	@Column(name = "usuario_ti_edad")
	@NotNull
	public Integer getEdad() {
		return edad;
	}

	@Column(name = "usuario_d_fec_nacimiento", columnDefinition = "DATE")
	@NotNull
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	@Column(name = "usuario_vc_telefono1", length = 10)
	@NotNull
	public String getTelefono1() {
		return telefono1;
	}

	@Column(name = "usuario_vc_telefono2", length = 10)
	public String getTelefono2() {
		return telefono2;
	}

	@Column(name = "usuario_dt_fecha_registro", columnDefinition = "DATETIME")
	@NotNull
	public Date getFecRegistro() {
		return fecRegistro;
	}

	@Column(name = "usuario_dt_fecha_actualizacion", columnDefinition = "DATETIME")
	public Date getFecActualizacion() {
		return fecActualizacion;
	}

	@Column(name = "usuario_si_estatus")
	@NotNull
	public Integer getEstatus() {
		return estatus;
	}

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	public Set<UsuarioRol> getUsuariosRoles() {
		return usuariosRoles;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public void setCorreo1(String correo1) {
		this.correo1 = correo1;
	}

	public void setCorreo2(String correo2) {
		this.correo2 = correo2;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	public void setFecRegistro(Date fecRegistro) {
		this.fecRegistro = fecRegistro;
	}

	public void setFecActualizacion(Date fecActualizacion) {
		this.fecActualizacion = fecActualizacion;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public void setUsuariosRoles(Set<UsuarioRol> usuariosRoles) {
		this.usuariosRoles = usuariosRoles;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", apodo=" + apodo + ", correo1=" + correo1 + ", correo2=" + correo2
				+ ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
				+ ", fechaNacimiento=" + fechaNacimiento + ", telefono1=" + telefono1 + ", telefono2=" + telefono2
				+ ", fecRegistro=" + fecRegistro + ", fecActualizacion=" + fecActualizacion + ", estatus=" + estatus
				+ ", usuariosRoles=" + usuariosRoles + "]";
	}

}
