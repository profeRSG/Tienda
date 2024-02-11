package dao;
import java.util.ArrayList;
import java.util.List;

import modelo.Producto.IProducto;
import modelo.Producto.Producto;

public class DAOProducto {
	private List<IProducto> productos;
	
	public DAOProducto() {
		productos = new ArrayList<>();
        productos.add(new Producto(1,"Cámara de Coche WiFi GKU Dashcam Full HD 2.5K 1600P y Super Visión Nocturna", "en Sistemas de cámara con sop…", 69.9, "https://m.media-amazon.com/images/I/61+kv4d9BXL._AC_AA360_.jpg"));
        productos.add(new Producto(2,"Blukar Soporte Móvil Coche, 2024 Upgraded Ajustable Soporte con Ventosa", "Equipado con una base de ventosa extra fuerte mejorada, Blukar soporte móvil coche…", 11.9, "https://m.media-amazon.com/images/I/81jKWnJypKL._AC_AA360_.jpg"));
        productos.add(new Producto(3,"PLAMECA Vitamina D3 + K2 Huesos Fuertes y Sanos, con Vitamina D3 y K2, 60 Cápsulas Vegetales", "Vitaminas…", 7.9, "https://m.media-amazon.com/images/I/71wjokBAINL._AC_AA360_.jpg"));
        productos.add(new Producto(4,"Dreame L20 Ultra Robot Aspirador y friegasuelos con MopExtend, Retirada de mopas Robot Aspirador", "Robot aspìrador…", 1199.9, "https://m.media-amazon.com/images/I/71sIYPeY8OL._AC_SL1500_.jpg"));
        productos.add(new Producto(5,"Spiderman. Universo Spiderman (MARVEL MUST HAVE)", "en Sistemas de cámara con sop…", 17.5, "https://m.media-amazon.com/images/I/81RwspgAKSL._AC_AA360_.jpg"));
        productos.add(new Producto(6,"VARLION - Pala de Pádel Profesional Maxima Summum Prisma Radio S 2023/24", "Pala de padel,uso profesional…", 450.9, "https://m.media-amazon.com/images/I/61XXrqTpZyL._AC_AA360_.jpg"));
        productos.add(new Producto(7,"Cámara de Coche WiFi GKU Dashcam Full HD 2.5K 1600P y Super Visión Nocturna", "en Sistemas de cámara con sop…", 69.9, "https://m.media-amazon.com/images/I/61+kv4d9BXL._AC_AA360_.jpg"));
        productos.add(new Producto(8,"Hasbro Gaming Avalon Hill - Sistema de Juego HeroQuest - Juego de Aventuras", "Juego de mesa mítico…", 119.9, "https://m.media-amazon.com/images/I/91SwjPfLuIL._AC_SL1500_.jpg"));
        	}
	
    public  List<IProducto> getProductos() {
        return productos;
    }

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