package modelo.Producto;

public class ProductoElectronico extends Producto{

	public ProductoElectronico(int id, String nombre, String descripcion, double precio, String imagen) {
		super(id, nombre, descripcion, precio, imagen);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getPrecioFinal() {
		// TODO Los productos electronicos, tienen un descuento del 20% enMarzo
		//y del 50% en el blackfriday (cuarto viernes de Noviembre)
		return 99.9;
	}

}
