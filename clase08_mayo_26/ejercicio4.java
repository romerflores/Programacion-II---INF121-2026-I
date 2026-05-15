
class Mueble
{
    private:
        string tipo,material;
    public:
    Mueble()
    {
        tipo="De oficina";
        material="Madera";
    }
    Mueble(string t,string m)
    {
        tipo=t;
        material=m;
    }

    mostrar()
    {
        print("Tipo:",tipo)
        print("MAteria",material)
    }
}


class Parqueo
{
    private:
        int capacidad,canAutos;
        string parqueo[100];//placas
        double precioH;
    public:
    Parqueo(int cap,int ca,double ph)
    {
        // if ca>cap
        // {
        //     throw new Error("La cantidad de autos no puede ser mayor que la capacidad")
        // }
        capacidad=cap;
        canAutos=ca;
        for i=0 to canAutos-1
        {
            print("Ingrese placa de un auto")
            read(parqueo[i])
        }
        precioH=ph
    }

    mostrar()
    {
        print("Parqueo")
        print(capacidad,canAutos)

        for i=0 to canAutos-1
        {
            print(parqueo[i])
        }
        print(precioH)

    }

}


class Habitacion
{
    private:
        string nombre;
        double tamanio;
        int cantMuebles;
        Mueble muebles[100];
    public:

    Habitacion()
    {
        print("Ingrese Habitacion:")
        read(nombre,tamanio)
        cantMuebles=2
        muebles[0]=new Mueble();
        muebles[1]=new Mueble();
        // for i=cantMuebles to 99
        // {
        //     muebles[i]=new Mueble();
        // }
    }
    mostrar()
    {
        print("Habitacion:")
        print(nombre,tamanio,cantMuebles)
        for i=0 to cantMuebles-1
        {
            muebles[i].mostrar();
        }
    }

    agregarMueble(Mueble m)
    {
        muebles[cantMuebles]=m;
        cantMuebles=cantMuebles+1;
    }
}


class Departamento
{
    private:
        int nroPuerta,nroHab,nroPiso;
        Habitacion hab[100];

    public:
        Departamento()
        {
            print("Ingrese departamento")
            read(nroPuerta,nroPiso,nroHab)
            for i=0 to nroHab-1
            {
                hab[i]=new Habitacion();
            }
        }
        mostrar()
        {
            print(nroPuerta,nroPiso,nroHab)
            for i=0 to nroHab-1
            {
                hab[i].mostrar();
            }
        }

        totalMuebles()
        {
            int c=0;
            for i=0 to nroHab-1
            {
                c=c+hab[i].getCantMuebles();
            }
            return c;
        }


        nombreHabMasMueblesZ()
        {
            int maxi=-1
            for i=0 to nroHab-1
            {
                if(hab[i].getCantMuebles()>maxi)
                {
                    maxi=hab[i].getCantMuebles();
                }
            }
            for i=0 to nroHab-1
            {
                if(hab[i].getCantMuebles()==maxi)
                {
                    print(hab[i].getNombre());
                }
            }
        }
        //asumimos que lso getters y setters ya estan implementados
}


class Edificio
{
    private:
        string nombre;
        double superficie;
        int cantDep;
        Departamento deps[100];
        int cantPar;
        Parqueo parqueos[100];

    public:

        Edificio(string nom,double sup,int cd)
        {
            nombre=nom;
            superficie=sup;
            cantDep=cd;
            for i=0 to cd-1
            {
                deps[i]=new Departamento();// el se encarga de leer
            }
            cantPar=0;
        }

        mostrar()
        {
            print(nombre,superficie,cantDep)
            for i=0 to cantDep-1
            {
                deps[i].mostrar();
            }
            print(cantPar)
            for i=0 to cantPar-1
            {
                parqueos[i].mostrar();
            }
        }

        agregarParqueo(Parqueo p)
        {
            parqueos[cantPar]=p;
            cantPar=cantPar+1;
        }

        masHabPisoY(int y)
        {
            int maxi=-1;
            for i=0 to cantDep-1
            {
                if deps[i].getPiso()==y
                {
                    if(deps[i].getNroHab()>maxi)
                    {
                        maxi=deps[i].getNroHab();
                    }
                }
            }

            if maxi==-1
            {
                print("No existe habitaciones en el piso",y)
                
            }
            else
            {
                for i=0 to cantDep-1
                {
                    if deps[i].getPiso()==y and deps[i].getNroHab()==maxi
                    {
                        deps[i].mostrar();
                    }
                }
            }
        }


        //incisico C
        agregarMueblePuertaZ(int puertaz,int pisox,Mueble m)
        {
            boolean sw=false;
            for i=0 to cantDep-1
            {
                if deps[i].getNroPuerta()==puertaz and deps[i].getNroPiso()==pisox
                {
                    sw=true;
                    for j=0 to deps[i].getNroHab()-1
                    {
                        deps[i].getHabitaciones()[j].agregarMueble(m);
                    }
                    
                }
            }

            // if sw==false 
            if !sw 
            {
                print("NO se encontro el departamento con esas carctersiticas")
            }
        }


        //inciso D

        depMasMuebles()
        {
            int maxi=-1;
            for i=0 to cantDep-1
            {
                if deps[i].totalMuebles()>maxi
                {
                    maxi=deps[i].totalMuebles();
                }
            }

            for i=0 to cantDep-1
            {
                if deps[i].totalMuebles()==maxi
                {
                    maxi=deps[i].mostrar();
                }
            }
        }

        nombreHabMasMueblesZ(int pisoz)
        {
            for i=0 to cantDep-1
            {
                if deps[i].getNroPiso()==pisoz
                {
                    deps[i].nombreHabMasMueblesZ(pisoz);

                }
            }
        }

        //inciso f
        eliminarPrimos()
        {
            int i=0;
            while i<cantDep
            {
                int num=deps[i].getNroHab();

                int cd=0;
                for d=1 to num
                {
                    if num%d
                    {
                        cd=cd+1
                    }
                }
                if cd==2
                {
                    //eliminar

                    for j=i to cantDep-2
                    {
                        deps[j]=deps[j+1]
                    }
                    cantDep=cantDep-1
                    deps[cantDep]=null;
                } 
                else
                {
                    i=i+1;
                }

            }
        }
}


Begin

    p1=new Parqueo(50,10,9.99);
    p2=new Parqueo(100,6,10.99);
    p3=new Parqueo(10,10,16.99);

    //inciso A)
    e1= new Edificio("Edificio Hoy",500.50,40);
    e1.mostrar();

    e1.agregarParqueo(p1);
    e1.agregarParqueo(p2);

    e1.mostrar();

    //inciso b
    e1.masHabPisoY(5);

    //inciso c
    m1=new Mueble("De cocina","Aluminio");
    e1.agregarMueblePuertaZ(10,5,m1);
    e1.mostrar();

    //inciso d
    e1.depMasMuebles();

    //inciso e
    e1.nombreHabMasMueblesZ(2);

    // inciso f
    e1.eliminarPrimos();
    e1.mostrar();





End