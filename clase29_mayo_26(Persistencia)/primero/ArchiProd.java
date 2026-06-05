package primero;
import java.util.*;
import java.io.*;
public class ArchiProd {
	private String nomP;
	
	public ArchiProd(String n)
	{
		nomP=n;
	}
	public void crear() throws ClassNotFoundException, IOException
    {
        Scanner sc=new Scanner(System.in);
        FileOutputStream archi=new FileOutputStream(nomP);
        ObjectOutputStream sal=null;
        try{
            if(new File(nomP).exists()){
                System.out.println("El archivo ya existe...!! Desea eliminar s/n");
                String resp=sc.next();
                if(resp.equals("s"))
                    sal = new ObjectOutputStream(archi);
            }
            else
                sal = new ObjectOutputStream(archi);
        }
       catch(Exception e)
       {
           System.out.println("error de archivo");
       }
       finally{
           sal.close();
           archi.close();
       }
    }
	public void adicionar() throws ClassNotFoundException, IOException
    {
       Scanner sc=new Scanner(System.in);
       String resp;
       FileOutputStream archi=new FileOutputStream(nomP,true);
       ObjectOutputStream sal=null;
       try{
           if(new File(nomP).exists())
           {    
               sal = new AddObjectOutputStream(archi);
               do{
                    Producto x=new Producto();
                    x.leer();
                    sal.writeObject(x);
                    System.out.println("Desea continuar s/n");
                    resp=sc.next();
               }while(resp.equals("s"));
           }
           else
               System.out.println("No existe el archivo.... debe crear!!!");
        }
       catch(Exception e){
           System.out.println("error de archivo");
       }
       finally{
           sal.close();
           archi.close();
       }
    }
	public void listado()throws IOException, ClassNotFoundException
    {
        FileInputStream archi=new FileInputStream(nomP);
        ObjectInputStream ent=null;
        try{
            ent=new ObjectInputStream(archi);
            while(true){
                    Producto x=(Producto)ent.readObject();
                    x.mostrar();
                }
        }    
        catch(Exception e){
              System.out.println("Fin listado!!!");      
        }
        finally{
            ent.close();
            archi.close();
        }
        
    }
	public int menor()throws IOException, ClassNotFoundException
    {
        FileInputStream archi=new FileInputStream(nomP);
        ObjectInputStream ent=null;
        int men=100;
        try{
            ent=new ObjectInputStream(archi);
            while(true){
                    Producto x=(Producto)ent.readObject();
                    if(x.getPrecio()<men)
                    	men=x.getPrecio();
                }
        }    
        catch(Exception e){
              System.out.println("Fin listado!!!");      
        }
        finally{
            ent.close();
            archi.close();
        }
        return men;
    }
	public void baratos(int p)throws IOException, ClassNotFoundException
    {
        FileInputStream archi=new FileInputStream(nomP);
        ObjectInputStream ent=null;
        try{
            ent=new ObjectInputStream(archi);
            while(true){
                    Producto x=(Producto)ent.readObject();
                    if(x.getPrecio()==p)
                    	x.mostrar();
                }
        }    
        catch(Exception e){
              System.out.println("Fin listado!!!");      
        }
        finally{
            ent.close();
            archi.close();
        }
        
    }


}
