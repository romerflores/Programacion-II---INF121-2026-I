package primero;
import java.util.*;
import java.io.Serializable;

public class Producto implements Serializable {
	private String nombre, medida;
	private int precio,stock;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.print("nombre  medida  precio  stock");
		nombre=lee.next();
		medida=lee.next();
		precio=lee.nextInt();
		stock=lee.nextInt();
	}
	public void mostrar()
	{
		System.out.println(nombre+"\t"+medida+"\t"+precio+" "+stock);
	}
	
	

}
