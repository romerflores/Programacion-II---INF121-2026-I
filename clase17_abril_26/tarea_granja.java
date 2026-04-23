class Granja
{

    //el constructor
    //el mostrar
    //ya esta todo implementado


    //inciso C
    int contarTipoAve()
    {
        int c=0;
        for(int i=0;i<this.nroAnimales;i++)
        {
            if(a[i].getTipo().equals("ave"))c++;
        }
        return c;
    }



    void agregarKAnimales(int k,String x)
    {
        // Scanner lec=new Scanner(System.in);
        // int k=lec.nextInt();
        for(int i=0;i<nroAnimales;i++)
        {
            if(a[i].getNombre().equals(x) and a[i].getTipo().equals("ave"))
            {
                a[i].setCantidad(a[i].getCantidad()+k);
            }
        }
    } 

    //inciso d, segunda forma
    boolean verificarSiExiste(String nom,String t)
    {
        for(int i=0;i<nroAnimales;i++)
        {
            if(a[i].getNombre().equals(nom) && a[i].getTipo().equals(t))
            {
                return true;
            }
        }
        return false;
    }

    void agregarK(int k)
    {
        Scanner lec=new Scanner(System.in);
        for(int i=0;i<k;i++)
        {
            System.out.println("Ingrese nombre animal");
            String x=lec.next();
            String tipo="Ave";
            System.out.println("Ingrese cant animal");
            int c=lec.nextInt();
            if(!verificarSiExiste(x,tipo))
            {
                a[nroAnimales]=new Animal(x,tipo,c);
                nroAnimales=nroAnimales+1;
            }
            else
            {
                System.out.println("Ya existe, entonces no se añade");
            }
        }
    }


}