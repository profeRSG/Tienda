package modelo.Producto;

import java.time.LocalDate;

import modelo.usuario.Cliente;
import modelo.usuario.Usuario;

public class Pedido {

	private IProducto producto;
	private Cliente cliente;
	private LocalDate fechaDeCompra;
	
	
	public Pedido(IProducto producto, Cliente cliente, LocalDate fechaDeCompra) {
		super();
		this.producto = producto;
		this.cliente = cliente;
		this.fechaDeCompra = fechaDeCompra;
	}


	public IProducto getProducto() {
		return producto;
	}


	public void setProducto(IProducto producto) {
		this.producto = producto;
	}


	public Usuario getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public LocalDate getFechaDeCompra() {
		return fechaDeCompra;
	}


	public void setFechaDeCompra(LocalDate fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}
	
	/**
	 * El metodo devuelve la fecha de entrega del pedido
	 * Esta dependera de si el cliente comprador es prime o no.
	 * La fecha de entrega de los usuario prime sera un dia despues de la
	 * de compra. Para el resto de usuario es 15 dias despues de la fecha de compra.
	 * @return la fecha de entrega del pedido.
	 */
	public LocalDate getFechaEntrega() {
		return LocalDate.of(2021, 1, 1);//TODO calcular la fecha de entrega en funcion
		// de si el usuario es prime o no, y la fecha de compra. Actualmente la fecha es
		//siempre la misma.
	}
	
}
