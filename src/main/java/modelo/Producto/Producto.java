package modelo.Producto;
public class Producto implements IProducto{
    private String nombre;
    private String descripcion;
    private double precioBase;
    private String imagen;
    private int id;
    public static final double IVA=0.21;
    
    
    
	public Producto(int id,String nombre, String descripcion, double precio, String imagen) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioBase = precio;
		this.imagen = imagen;
		this.id=id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precio) {
		this.precioBase = precio;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public double getPrecioFinal() {
		return 0;//TODO Este metodo debe devolver el precio final del producto, el cual es 
		//su precio base, mas la suma del porcentaje de IVA.
	}
	public int getId() {
		return id;
	}

    
    
    
}