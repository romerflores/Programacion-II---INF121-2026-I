package primero;
import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		// TODO Auto-generated method stub
        boolean sw=true;
        Scanner sc=new Scanner(System.in);
        ArchiProd miArch=new ArchiProd("misProductos.dat");
        while(sw)
        {
            System.out.println("1. Crear");
            System.out.println("2. Adicionar");
            System.out.println("3. Listar");
            System.out.println("4. Menor Precio");
            System.out.println("5. Baratos");
            System.out.println("0. Salir ");
            System.out.println("Elegir una opcion: ");
            String resp=sc.next();
            switch(resp){
                case "1": miArch.crear();break;
                case "2": miArch.adicionar();break;
                case "3": miArch.listado();break;
                case "4": System.out.println(miArch.menor());break;
                case "5": miArch.baratos(miArch.menor());break;
                default: sw=false;
            }
        }

	}

}
