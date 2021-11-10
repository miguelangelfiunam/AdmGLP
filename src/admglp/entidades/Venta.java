package admglp.entidades;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Clase Venta
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 07/10/2021
 */
public class Venta {

    /**
     * Numero de venta
     */
    private int numeroVenta;
    /**
     * Tipo de venta
     */
    private int tipoVenta;
    /**
     * Monto de la venta
     */
    private double monto;
    /**
     * Fecha en que se relaiza la venta
     */
    private Date fechaCompra;
    /**
     * Tipo de pago
     */
    private int tipoPago;
    /**
     * Fecha de registro
     */
    private Date fechaRegistro;
    /**
     * Fecha de actualizacion
     */
    private Date fechaActualizacion;
    /**
     * Descripcion adicional de la venta
     */
    private String descripcion;
    /**
     * Cliente involucrado en la venta
     */
    private Cliente cliente;
    /**
     * Trabajador involucrado en la venta
     */
    private Trabajador trabajador;
    /**
     * Tanque involucrado en la venta
     */
    private Tanque tanque;
    /**
     * Estado de la venta
     */
    private int estadoVenta;

    public Venta() {
    }

    public Venta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public Venta(int numeroVenta, int tipoVenta, double monto, int tipoTanque, Date fechaCompra, int tipoPago, Date fechaRegistro, Date fechaActualizacion, String descripcion, Cliente cliente, Trabajador trabajador, Tanque tanque, int estadoVenta) {
        this.numeroVenta = numeroVenta;
        this.tipoVenta = tipoVenta;
        this.monto = monto;
        this.fechaCompra = fechaCompra;
        this.tipoPago = tipoPago;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizacion = fechaActualizacion;
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.trabajador = trabajador;
        this.tanque = tanque;
        this.estadoVenta = estadoVenta;
    }

    public int getNumeroVenta() {
        return numeroVenta;

    }

    public void setNumeroVenta(int numeroVenta) {
        if (numeroVenta > 0) {
            this.numeroVenta = numeroVenta;
        }
    }

    public int getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(int tipoVenta) {
        if (tipoVenta > 0) {
            this.tipoVenta = tipoVenta;
        }
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        if (monto > 0) {
            this.monto = monto;
        }
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        if (fechaCompra != null) {
            this.fechaCompra = fechaCompra;
        }
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        if (tipoPago > 0) {
            this.tipoPago = tipoPago;
        }
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        if (fechaRegistro != null) {
            this.fechaRegistro = fechaRegistro;
        }
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        if (fechaActualizacion != null) {
            this.fechaActualizacion = fechaActualizacion;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        }
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        if (trabajador != null) {
            this.trabajador = trabajador;
        }
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        if (tanque != null) {
            this.tanque = tanque;
        }
    }

    public int getEstadoVenta() {
        return estadoVenta;
    }

    public void setEstadoVenta(int estadoVenta) {
        if (estadoVenta >= 0) {
            this.estadoVenta = estadoVenta;
        }
    }

    /**
     * Metodo para obtener una Venta
     *
     * @return
     */
    public Venta obtenerVenta() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una Venta por parte del trabajador
     *
     * @return
     */
    public Venta obtenerVentaTrabajador() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una Venta por parte del cliente
     *
     * @return
     */
    public Venta obtenerVentaCliente() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de Ventas totales
     *
     * @return
     */
    public static List<Venta> obtenerVentasTotales() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de Ventas de un trabajador
     *
     * @return
     */
    public static List<Venta> obtenerVentasTrabajador() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de Ventas
     *
     * @return
     */
    public static List<Venta> obtenerVentasCliente() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para actualizar una Venta
     *
     * @return
     */
    public boolean actualizarVenta() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para insertar una Venta
     *
     * @return
     */
    public boolean insertarVenta() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para borrar una Venta
     *
     * @return
     */
    public boolean borrarVenta() {
        // TODO: implement
        return false;
    }

    @Override
    public String toString() {
        return "Venta{" + "numeroVenta=" + numeroVenta + ", tipoVenta=" + tipoVenta + ", monto=" + monto + ", fechaCompra=" + fechaCompra + ", tipoPago=" + tipoPago + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion=" + fechaActualizacion + ", descripcion=" + descripcion + ", cliente=" + cliente + ", trabajador=" + trabajador + ", tanque=" + tanque + ", estadoVenta=" + estadoVenta + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venta other = (Venta) obj;
        if (this.numeroVenta != other.numeroVenta) {
            return false;
        }
        if (this.tipoVenta != other.tipoVenta) {
            return false;
        }
        if (Double.doubleToLongBits(this.monto) != Double.doubleToLongBits(other.monto)) {
            return false;
        }
        if (this.tipoPago != other.tipoPago) {
            return false;
        }
        if (this.estadoVenta != other.estadoVenta) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.fechaCompra, other.fechaCompra)) {
            return false;
        }
        if (!Objects.equals(this.fechaRegistro, other.fechaRegistro)) {
            return false;
        }
        if (!Objects.equals(this.fechaActualizacion, other.fechaActualizacion)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.trabajador, other.trabajador)) {
            return false;
        }
        if (!Objects.equals(this.tanque, other.tanque)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numeroVenta;
        hash = 89 * hash + this.tipoVenta;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.monto) ^ (Double.doubleToLongBits(this.monto) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.fechaCompra);
        hash = 89 * hash + this.tipoPago;
        hash = 89 * hash + Objects.hashCode(this.fechaRegistro);
        hash = 89 * hash + Objects.hashCode(this.fechaActualizacion);
        hash = 89 * hash + Objects.hashCode(this.descripcion);
        hash = 89 * hash + Objects.hashCode(this.cliente);
        hash = 89 * hash + Objects.hashCode(this.trabajador);
        hash = 89 * hash + Objects.hashCode(this.tanque);
        hash = 89 * hash + this.estadoVenta;
        return hash;
    }

}
