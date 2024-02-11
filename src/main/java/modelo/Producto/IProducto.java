package modelo.Producto;

public interface IProducto {
	
	public String getNombre();
	public void setNombre(String nombre) ;
	public String getDescripcion() ;
	public void setDescripcion(String descripcion) ;
	public double getPrecioBase();
	public void setPrecioBase(double precio) ;
	public String getImagen() ;
	public void setImagen(String imagen) ;
	public double getPrecioFinal();
	public int getId();

}
