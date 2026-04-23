import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        // Asumimos que ya todo esta creado
        System.out.println(g1.contarTipoAve());
        System.out.println(g2.contarTipoAve());


        Scanner lec=new Scanner(System.in);

        //incisio d, primera forma
        System.out.println("Ingrese Animal x");
        String x=lec.next();
        System.out.println("Ingrese cantidad k");
        int k=lec.nextInt();

        g1.agregarKAnimales(k,x);
        g1.mostrar();

        //inciso d segunda forma
        g1.agregarK(10);
        g1.mostrar();

        try
        {
            Fraccion f1=new Fraccion(1,0);
        }
        catch(e)
        {
            System.out.println(e);
        }

        //va a seguir   


    }
}