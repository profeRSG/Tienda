package dao;
import java.util.ArrayList;
import java.util.List;

import modelo.Producto.IProducto;
import modelo.Producto.Producto;
import modelo.Producto.ProductoElectronico;

/**
 * Clase utilizada para obtener informacion de los productos de la base de datos.
 * @implSpec Actualmente la clase es un Mock. No obtienes los datos de una base de datos
 * sino de una lista predefinida de objetos en el constructor.
 * @author Raul SG 
 */
public class DAOProducto {
	private List<IProducto> productos;
	
	/**
	 * Constructor del objeto utilizado para acceder a los datos de la base de datos.
	 * @implNote Actualmente, en lugar de abrir una conexion con la BD
	 * se crear una lista predefinida de objetos.
	 */
	public DAOProducto() {
		productos = new ArrayList<>();
        productos.add(new ProductoElectronico(1,"Camara de Coche WiFi GKU Dashcam Full HD 2.5K 1600P y Super Vision Nocturna", "en Sistemas de camara con sopo", 69.9, "https://m.media-amazon.com/images/I/61+kv4d9BXL._AC_AA360_.jpg"));
        productos.add(new Producto(2,"Blukar Soporte Movil Coche, 2024 Upgraded Ajustable Soporte con Ventosa", "Equipado con una base de ventosa extra fuerte mejorada, Blukar soporte m�vil coche�", 11.9, "https://m.media-amazon.com/images/I/81jKWnJypKL._AC_AA360_.jpg"));
        productos.add(new Producto(3,"PLAMECA Vitamina D3 + K2 Huesos Fuertes y Sanos, con Vitamina D3 y K2, 60 Capsulas Vegetales", "Vitaminas", 7.9, "https://m.media-amazon.com/images/I/71wjokBAINL._AC_AA360_.jpg"));
        productos.add(new Producto(4,"Dreame L20 Ultra Robot Aspirador y friegasuelos con MopExtend, Retirada de mopas Robot Aspirador", "Robot aspirador", 1199.9, "https://m.media-amazon.com/images/I/71sIYPeY8OL._AC_SL1500_.jpg"));
        productos.add(new Producto(5,"Spiderman. Universo Spiderman (MARVEL MUST HAVE)", "en Sistemas de camara con sopo", 17.5, "https://m.media-amazon.com/images/I/81RwspgAKSL._AC_AA360_.jpg"));
        productos.add(new Producto(6,"VARLION - Pala de Padel Profesional Maxima Summum Prisma Radio S 2023/24", "Pala de padel,uso profesional", 450.9, "https://m.media-amazon.com/images/I/61XXrqTpZyL._AC_AA360_.jpg"));
        productos.add(new ProductoElectronico(7,"Camara de Coche WiFi GKU Dashcam Full HD 2.5K 1600P y Super Vision Nocturna", "en Sistemas de camara con sopo", 69.9, "https://m.media-amazon.com/images/I/61+kv4d9BXL._AC_AA360_.jpg"));
        productos.add(new Producto(8,"Hasbro Gaming Avalon Hill - Sistema de Juego HeroQuest - Juego de Aventuras", "Juego de mesa mitico", 119.9, "https://m.media-amazon.com/images/I/91SwjPfLuIL._AC_SL1500_.jpg"));
        	}
	
	/**
	 * Devuelve una lista de Iproductos. Los productos guardados en la BD
	 * @return List<IProducto>
	 * @author Raul SG
	 */
    public  List<IProducto> getProductos() {
        return productos;
    }

    /**
     * Devuelve un IProducto de la BD, cuyo id coindica con el id proporcionado como
     * parametro. En caso de no existir en la Bd, devuelve null.
     * @param idProducto, idetificador del producto que se quiere obtener de la BD
     * @return IProducto cuyo id, coincide con idProducto. Se devuelve null si no existe en la BD
     *@author Raul SG
     */
	public IProducto getProducto(int idProducto) {
		IProducto productoBuscado=null;
		boolean encontrado=false;
		for(int i=0;i<productos.size() && ! encontrado; i++) {
			IProducto p=productos.get(i);
			if(p.getId()==idProducto)
				productoBuscado=p;
		}
		return productoBuscado;
	}
	
	
}