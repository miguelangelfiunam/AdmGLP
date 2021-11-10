package admglp.interfaces;

import java.util.List;

import admglp.entidades.Cliente;

public interface ClienteInterface {
	
    public Cliente obtenerCliente();

    public List<Cliente> obtenerClientes();
    
    public boolean actualizarCliente();
    
    public boolean actualizarEstadoCliente();

    public int insertarCliente() ;

    public boolean borrarCliente();

}
