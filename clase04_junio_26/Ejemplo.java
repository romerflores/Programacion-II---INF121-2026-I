class Organizacion
{
    private:
        string maximaAutoridad;

    protected   :
        Organizacion(string autoridad)
        {
            maximaAutoridad=autoridad;
        }

        mostrar()
        {
            print(maximaAutoridad);
        }
        /**
        * Se asume que los getter y setters ya estan implementados
        */
    
}


class Empresa:Organizacion
{
    private: 
        string nombre;
        string direccion;
        int nroEmpleados;
        string empleados[30,2];//col1: nombre//col2: cargo

    protected:

    Empresa(string n,string d,int ne)
    {
        string ma;
        print("Ingrese nombre maxima autoridad:");
        read(ma);
        Organizacion(ma);

        nombre=n;
        direccion=d;
        nroEmpleados=ne;

        for i=0 to ne-1
        {
            print("Ingrese nombre y cargo");
            read(empleado[i][0],empleado[i][1]);
        }
    }

    mostrar()
    {
        Organizacion.mostrar();
        print(nombre,direccion,nro,nroEmpleados);
        for i=0 to nroEmpleados-1
        {
            print(empleado[i][0],empleado[i][1]);
        }
    }

            /**
        * Se asume que los getter y setters ya estan implementados
        */
}


class ColegioPrivado:Empresa
{
    private:
        string turno;
        int ne;
        string estudiantes[30,2]//col1: nombre //col2:curso
    
    public:

        ColegioPrivado(string nom)
        {
            string dir;
            int nemp;
            print("direccion");
            read(dir);
            print("Ingrese numero de empleados");
            read(nemp);
            Empresa(nom,dir,nemp);

            print("Igrese turno");
            read(turno);
            print("Ingrese numero de estudiatnes");
            read(ne);

            for i=0 to ne-1
            {
                print("Ingrese nombre y curso");
                read(estudiates[i][0],estudiates[i][1]);
            }
        }

        mostrar()
        {
            Empresa.mostrar();

            print(turno);
            print(ne);
            for i=0 to ne-1
            {
                print(estudiates[i][0],estudiates[i][1]);
            }
        }

        ordenarEstudiantes()
        {
            for i=0 to ne-1
            {
                for j=i+1 to ne-1
                {
                    if(estudiantes[i][0]==estudiantes[j][0])
                    {
                        if(estudiantes[i][1]>(estudiantes[j][1]))
                        {
                            string aux=estudiantes[i][0];
                            estudiantes[i][0]=estudiantes[j][0];
                            estudiantes[j][0]=aux;
                            aux=estudiantes[i][1];
                            estudiantes[i][1]=estudiantes[j][1];
                            estudiantes[j][1]=aux;
                        }
                    }
                    else
                    {
                        if(estudiantes[i][0]>(estudiantes[j][0]))
                        {
                            string aux=estudiantes[i][0];
                            estudiantes[i][0]=estudiantes[j][0];
                            estudiantes[j][0]=aux;
                            aux=estudiantes[i][1];
                            estudiantes[i][1]=estudiantes[j][1];
                            estudiantes[j][1]=aux;
                        }
                    }
                }
            }
        }

        mismosEstudiantes(ColegioPrivado otro)
        {
            this.ordenarEstudiantes();
            otro.ordenarEstudiantes();
            if(this.nombre==otro.getNombre() and this.maximaAutoridad==otro.getMaximaAutoriad())
            {
                if(this.ne==otro.ne)
                {
                    bool ok=true;
                    for i=0 to this.ne-1
                    {
                        if((this.getEstudiantes[i][0]!=otro.getEstudiantes[i][0] or this.getEstudiantes[i][1]!=otro.getEstudiantes[i][1]))
                        {
                            ok=false;
                            break;
                        }
                    }

                    if(ok)
                    {
                        print("Si tiene los mismos estudiantes");
                    }
                    else
                    {
                        print("Tiene estudiates diferentes");
                    }


                }
                else
                {
                    print("No son iguales por que tienen diferente cantidad de estudiantes")
                }
            }
            else
            {
                print("No tienen el mismo nombre o la misma maxima autoridad")
            }
        }

        /**
        * Se asume que los getter y setters ya estan implementados
        */
}




class MedioDeComunicacion:Empresa
{
    private:
        string alcance;
        string tipo;
    
    public:

        MedioDeComunicacion(string nom)
        {
            string dir;
            int nemp;
            print("direccion");
            read(dir);
            print("Ingrese numero de empleados");
            read(nemp);
            Empresa(nom,dir,nemp);

            print("Ingrese alcance y tipo");
            read(alcance, tipo);
        }

        mostrar()
        {
            Empresa.mostrar();
            print(alcance, tipo);
        }

    /**
    * Se asume que los getter y setters ya estan implementados
    */
}


class MinisterioDeTrabajo
{
    private:
        string director;
        //1ra Forma
        int ne;
        Empresa empresas[100];

        //2da forma
        int ncp;
        ColegioPrivado cols[100];
        int nmdc;
        MedioDeComunicacion meds[100];

    public:

    //1ra forma
    agregarEmpresa(Empresa e)
    {
        empresas[ne]=e;
        ne=ne+1;
    }

    //2daforma
    agregarColegioPrivado(ColegioPrivado col)
    {
        bool noseencuntra=true;
        for i=0 to ncp-1
        {
            if(cols[i]==col)
            if(cols[i].getMaximaAutoridad()!=col.getMaximaAutoridad() )
            {
                noseencuntra=false;
                break;
            }
        }

        if(nosecuentra)
        {
            print("No existe la empresa, aniadiendo....");
            cols[ncp]=col;
            ncp=ncp+1;
        }
        else
        {
            print("Si se encuentra la empresa, entonces no hago nada");
        }
    }
    //..lo mismo para Medio de comunciacion

}

begin

    c1=new ColegioPrivado("La salle");

    //asumir que tenemos un constructor por defecto que no inicializa nada
    c2=new ColegioPrivado();
    
    c2.setMaximaAutoridad(c1.getMaximaAutoridad());
    c2.setDireccion(c1.getDireccion());
    //... asi todos los atributos;

    for i=0 to c2.getNroEmpleados()-1
    {
        // c2.setEmpleado(i,j,c1.getEmpleados()[i]);

        c2.getEmpleado()[i][0]=c1.getEmpleado()[i][0];
        c2.getEmpleado()[i][1]=c1.getEmpleado()[i][1];

    }
    ///asi con todos los atributos

    //inciso b
    c3=new ColegioPrivado("Don Bosco");

    c1.mismosEstudiantes(c3);


    //inciso c
    mc1=new MedioDeComunicacion();
    mc1.setMaximaAutoridad("Raul Gonzalez");


    mdt=new MinisterioDeTrabajo();
    mtd.(c3);
    mtd.(mc1);

end