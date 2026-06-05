class Conductor
{
    private:
        int ci;
        string nombre;
        string categoria;

    /**
     * Asumimos que los constructorues, mostrar, los getters y setters ya estan implementados
     *
     * */  
}

class Sobre
{
    private:
        string remitente,fecha,destinatario;

        /**
     * Asumimos que los constructorues, mostrar, los getters y setters ya estan implementados
     *
     * */  
}


class Caja
{
    private:
        int nroSobres;
        Sobre s[10];

    /**
     * Asumimos que los constructorues, mostrar, los getters y setters ya estan implementados
     *
     * */  
}

class Vehiculo
{
    private:
        string placa;
        Conductor co;
        int nroCajas;
        Caja cajas[50];

    public:
    /**
     * Asumimos que los constructorues, mostrar, los getters y setters ya estan implementados
     *
     * */  

        agregarCaja(Caja c)
        {
            cajas[nroCajas]=c;
            nroCajas=nroCajas+1;
        }

}

class EmpresaCorreo
{
    private:
        string nombre;
        int nroVehiculos;
        Vehiculo vs[30];

    public:
    /**
     * Asumimos que los constructorues, mostrar, los getters y setters ya estan implementados
     *
     * */  

        mostrarCantCajas(string nombrex)
        {
            for i=0 to nroVehiculos-1
            {
                if(vs[i].getCo().getNombre()==nombrex)
                {
                    print("El conductor ",nombrex," tiene ",vs[i].getNroCajas()," cajas");
                }
            }
        }

        menorNroCajas()
        {
            int mn=vs[0].getNroCajas();

            for i=0 to nroVehiculos-1
            {
                if(vs[i].getNroCajas()<mn)
                {
                    mn=vs[i].getNroCajas();
                }
            }
            return mn;
        }

        agregarCaja(Caja c)
        {
            int mn=menorNroCajas();

            for i=0 to nroVehiculosvs[i].getCajas()[j]-1
            {
                if(vs[i].getNroCajas()==mn)
                {
                    vs[i].agregarCaja(c);
                    print("Agregando caja...")
                    break;
                }
            }

        }

        determinar(string r,string d)
        {
            for i=0 to nroVehiculos-1
            {
                for j=0 to vs[i].getNroCajas()-1
                {
                    for k=0 to vs[i].getCajas()[j].getNroSobres()-1
                    {
                        Sobre s=vs[i].getCajas()[j].getSobres()[k];

                        if(s.getRemitente()==r and s.getDestinatario()==d)
                        {
                            print(vs[i].getPlaca(),vs[i].getCo().getNombre());
                        }
                    }
                }
            }
        }
    

}

Begin

    //1
    ec1=new EmpresaCorreo()
    ec1.mostrarCantCajas("Raul");

    //2
    Caja c1=new Caja();
    ec1.agregarCaja(c1);

    //3
    ec1.determinar();

End