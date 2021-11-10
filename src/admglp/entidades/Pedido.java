package admglp.entidades;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Clase Pedido
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 07/10/2021
 */
public class Pedido {

    /**
     * Numero del pedido
     */
    private int numPedido;
    /**
     * Fehca en que se realiza el pedido
     */
    private Date fechaPedido;
    /**
     * Fecha en que se entrega el pedido
     */
    private Date fechaEntrega;
    /**
     * Forma de pago
     */
    private String tipoPago;
    /**
     * Fecha de registro
     */
    private Date fechaRegistro;
    /**
     * Fecha de actualizacion
     */
    private Date fechaActualizacion;
    /**
     * Cliente que realiza el pedido
     */
    private Cliente cliente;
    /**
     * Trabajador involucrado en el pedido
     */
    private Trabajador trabajador;
    /**
     * Lista de tanques solicitados en el pedido
     */
    private List<Tanque> tanques;
    /**
     * Estado del pedido
     */
    private int estadoPedido;

    public Pedido() {
    }

    public Pedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Pedido(int numPedido, Date fechaPedido, Date fechaEntrega, String tipoPago, Date fechaRegistro, Date fechaActualizacion, Cliente cliente, Trabajador trabajador, List<Tanque> tanques, int estadoPedido) {
        this.numPedido = numPedido;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.tipoPago = tipoPago;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizacion = fechaActualizacion;
        this.cliente = cliente;
        this.trabajador = trabajador;
        this.tanques = tanques;
        this.estadoPedido = estadoPedido;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        if (numPedido > 0) {
            this.numPedido = numPedido;
        }
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
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

    public List<Tanque> getTanques() {
        return tanques;
    }

    public void setTanques(List<Tanque> tanques) {
        if (tanques != null) {
            if (tanques.size() > 0) {
                this.tanques = tanques;
            }
        }
    }

    public int getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(int estadoPedido) {
        if (estadoPedido >= 0) {
            this.estadoPedido = estadoPedido;
        }
    }

    /**
     * Metodo para obtener un pedido
     *
     * @return Bean con la informacion
     */
    public Pedido obtenerPedido() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener de un cliente
     *
     * @return Bean con la informacion
     */
    public Pedido obtenerPedidoCliente() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener de un trabajador
     *
     * @return Bean con la informacion
     */
    public Pedido obtenerPedidoTrabajador() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de pedidos del cliente
     *
     * @return Lista con la informacion
     */
    public static List<Pedido> obtenerPedidosCliente() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de pedidos del trabajador
     *
     * @return Lista con la informacion
     */
    public static List<Pedido> obtenerPedidosTrabajador() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de pedidos del historial del cliente
     *
     * @return Lista con la informacion
     */
    public static List<Pedido> obtenerPedidosHistorialCliente() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para obtener una lista de pedidos del historial del trabajador
     *
     * @return Lista con la informacion
     */
    public static List<Pedido> obtenerPedidosHistorialTrabajador() {
        // TODO: implement
        return null;
    }

    /**
     * Metodo para actualizar un pedido
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean actualizarPedido() {
        // TODO: implement
        return false;
    }

    /**
     * Metodo para insertar un pedido
     *
     * @return Identificador de la insercion
     */
    public int insertarPedido() {
        // TODO: implement
        return 0;
    }

    /**
     * Metodo para borrar un pedido
     *
     * @return TRUE-EXITO FALSE-FRACASO
     */
    public boolean borrarPedido() {
        // TODO: implement
        return false;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numPedido=" + numPedido + ", fechaPedido=" + fechaPedido + ", fechaEntrega=" + fechaEntrega + ", tipoPago=" + tipoPago + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion=" + fechaActualizacion + ", cliente=" + cliente + ", trabajador=" + trabajador + ", tanques=" + tanques + ", estadoPedido=" + estadoPedido + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.numPedido;
        hash = 89 * hash + Objects.hashCode(this.fechaPedido);
        hash = 89 * hash + Objects.hashCode(this.fechaEntrega);
        hash = 89 * hash + Objects.hashCode(this.tipoPago);
        hash = 89 * hash + Objects.hashCode(this.fechaRegistro);
        hash = 89 * hash + Objects.hashCode(this.fechaActualizacion);
        hash = 89 * hash + Objects.hashCode(this.cliente);
        hash = 89 * hash + Objects.hashCode(this.trabajador);
        hash = 89 * hash + Objects.hashCode(this.tanques);
        hash = 89 * hash + this.estadoPedido;
        return hash;
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
        final Pedido other = (Pedido) obj;
        if (this.numPedido != other.numPedido) {
            return false;
        }
        if (this.estadoPedido != other.estadoPedido) {
            return false;
        }
        if (!Objects.equals(this.tipoPago, other.tipoPago)) {
            return false;
        }
        if (!Objects.equals(this.fechaPedido, other.fechaPedido)) {
            return false;
        }
        if (!Objects.equals(this.fechaEntrega, other.fechaEntrega)) {
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
        if (!Objects.equals(this.tanques, other.tanques)) {
            return false;
        }
        return true;
    }

}
