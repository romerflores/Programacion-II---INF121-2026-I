class Producto
{
    protected:
        string nombre,id,fechaVen;
        int stock,costo;
    public:

    Producto(string nom)
    {
        // this.nombre=nombrel;
        nombre=nom;
        read(id,fechaVen,stock,costo);
    }

    mostrar()
    {
        print("Producto")
        print(nombre,id,fechaVen,stock,costo);
    }
    //se asume que los getters y settes ya estan implementados
}


class Refresco:Producto
{
    private:
        string marcaRefresco;
        bool contieneAzucar;
    public:

    Refresco(string nom,string marca,bool azucar)
    {
        Producto(nom);
        marcaRefresco=marca;
        contieneAzucar=azucar;
    }

    mostrar()
    {
        Producto.mostrar();
        print(marcaRefresco,contieneAzucar);
    }


    //se asume que los getters y setters ya estan implementados

}



class Pan:Producto
{

    private:
        string marcaPan;
        bool integral,conQueso;
    public:
    
    Pan(string nom,string mar,bool inte,bool cq)
    {
        Producto(nom);
        marcaPan=mar;
        integral=inte;
        conQueso=cq;
    }

    mostrar()
    {
        Producto.mostrar();
        print(marcaPan,integral,conQueso);
    }


    
}





class MiniMarket
{

    private:
        string nombre;
        int cantRefrescos,cantPan;
        Refresco refrescos[100];
        Pan panes[100];
    public:


    MiniMarket(string nom,int cr,int cp)
    {
        nombre=nom;
        cantRefrescos=cr;
        cantPan=cp;

        for i=0 to cantRefrescos-1
        {
            print("ingrese nombre prodcuto")
            string nom;read(nom);
            print("Ingrese Marca Refresco")
            string mar;read(mar);
            bool az;
            print("Ingrese si tiene azucar")
            read(az);
            refrescos[i]=new Refresco(nom,mar,az);
        }

        for i=0 to cantPan-1
        {
            print("ingrese nombre prodcuto")
            string nom;read(nom);
            print("Ingrese Marca pan")
            bool inte;
            print("ingre si el pan es intregral");
            read(inte);
            string mar;read(mar);
            bool cq;
            print("Ingrese si tiene queso")
            read(cq);
            panes[i]=new Pan(nom,mar,inte,cq);
        }
    }


    mostrar()
    {
        print(nombre);
        print(cantRefrescos);

        for i=0 to cantRefrescos-1
        {
            refrescos[i].mostrar();
        }
        print(cantPan)
        for i=0 to cantPan-1
        {
            panes[i].mostrar();
        }
    }

    //insciso b
    eliminarIntegrales()
    {
        int i=0;
        while i<cantPan
        {
            if panes[i].getIntegral()==true
            {
                for j=i to cantPan-2
                {
                    panes[j]=panes[j+1];
                }
                cantPan=cantPan-1;
                panes[cantPan]=null;
            }
            else
            {
                i=i+1;
            }
        }
    }


    eliminarSinAzucar()
    {
        int i=0;
        while i<cantRefrescos
        {
            if  refrescos[i].getContieneAzucar()==false
            {
                for j=i to cantRefrescos-2
                {
                    refrescos[j]=refrescos[j+1];
                }
                cantRefrescos=cantRefrescos-1;
                refrescos[cantRefrescos]=null;
            }
            else
            {
                i=i+1;
            }
        }
    }


    espot2(int x)//retorn booleano
    {
        int c=0;
        int encendidos=0;
        while x>0
        {
            if x%2==1
            {
                encendidos=encendidos+1;
            }
            c=c+1
            x/=2
        }
        // if encendidos==1
        // {
        //     return true
        // }
        // return false;
        return encendidos==1
    }

    // espot2(int x)//retorna booleano
    // {
    //     int pot=contar(x);
    // }

    eliminarPot2()
    {
        int i=0;
        while i<cantRefrescos
        {
            if  this.espot2(refrescos[i].getStock())==true
            {
                for j=i to cantRefrescos-2
                {
                    refrescos[j]=refrescos[j+1];
                }
                cantRefrescos=cantRefrescos-1;
                refrescos[cantRefrescos]=null;
            }
            else
            {
                i=i+1;
            }
        }
        i=0;
        while i<cantPan
        {
            if this.espot2(panes[i].getStock())
            {
                for j=i to cantPan-2
                {
                    panes[j]=panes[j+1];
                }
                cantPan=cantPan-1;
                panes[cantPan]=null;
            }
            else
            {
                i=i+1;
            }
        }
    }


    reabastecer()
    {
        int costoTotal=0;
        for i=0 to cantRefrescos-1
        {
            if refrescos[i].getStock()<=4 //reabastecer
            {
                int falta=10-refrescos[i].getStock();
                int costo=refrescos[i].getCostoUnidad()*falta;
                // costoTotal+=costo;
                costoTotal=costoTotal+costo;
                refrescos[i].setStock(10);
            }
        }
        for i=0 to cantPan-1
        {
            if panes[i].getStock()<=4 //reabastecer
            {
                int falta=10-panes[i].getStock();
                int costo=panes[i].getCostoUnidad()*falta;
                // costoTotal+=costo;
                costoTotal=costoTotal+costo;
                panes[i].setStock(10);
            }
        }

        print("MINIMARKET reabastecido!!!!")
        return costoTotal;
    }


}


Begin

    //inciso a
    m1=new MiniMarket("Bodega Aurreda",5,6);
    m2=new MiniMarket("Tu barrio",10,11);
    m1.mostrar();
    m2.mostrar();
    //inciso b

    m1.eliminarIntegrales();
    m2.eliminarSinAzucar();

    m1.mostrar();
    m2.mostrar();

    //inciso c
    m1.eliminarPot2();
    m2.eliminarPot2();

    m1.mostrar();
    m2.mostrar();

    //inciso D
    int costoTotal=m1.reabastecer();
    print("El costo total de reabastecer el minimarket",m1.getNombre()," fue ",costoTotal);
    m1.mostrar();

    costoTotal=m2.reabastecer();
    print("El costo total de reabastecer el minimarket",m2.getNombre()," fue ",costoTotal);
    m2.mostrar();

End