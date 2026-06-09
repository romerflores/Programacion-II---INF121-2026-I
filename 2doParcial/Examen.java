class Vestimenta
{
    private:
        string color,tipo;

    /**
     * Asumir que los getters y setters ya estan implementados
     */
}

class Musico
{
    private:
        string nom,instrumento;
        int aniosExperiencia;

}


class Danzarin
{
    private:
        string nom;
        int edad;
        string rol;
        int nroVes;
        Vestimenta v[50];

    ordernar()
    {
        for i=0 to nroVes-1
        {
            for j=i+1 to nroVes-1
            {
                if v[i].getColor()==v[j].getColor()
                {
                    if(v[i].getTipo()>v[j].getTipo())
                    {
                        //swap
                    }
                }
                else
                {
                    if(v[i].getColor()>v[j].getColor())
                    {
                        //swap
                    }
                }
            }
        }
    }

    comparar(Danzarin otro)
    {
        if this.nom!=otro.nom or this.edad==otro.edad //con rol y nroVest
        {
            return false;
        }

        //ordenar los 2 vectores
        //this.ordenar()
        //otro.ordenar()

        for i=0 to nroVes-1
        {
            if (this.v[i].getColor()!=otro.v[i].getColor() or this.v[i].getTipo()!=otro.v[i].getTipo())
            {
                return false;
            }
        } 

        return true;
    }
}

class Fraternidad
{
    private:
        string nom,danza;
        int anioFundacion;
        int nroDan,nroMus;
        Danzarin d[50];
        Musico m[50];
}

class EntradaFolclorica
{
    private:
        string nom,zona;
        int nroFra;
        Fraternidad f[50];
    
    //inciso a)
    mostrarFraternidades()
    {
        for i=0 to nroFra-1
        {
            bool sw=false;
            for j=0 to f[i].getNroDan()-1
            {
                for k=0 to f[i].getD()[j].getNroVes()-1
                {
                    if(f[i].getD()[j].getV()[k].getColor()=='blanco' and f[i].getD()[j].getV()[k].getTipo()=='chaqueta')
                    {
                        sw=true;
                        // break;
                    }
                }
                // if(sw)break;
            }
            if(sw)
            {
                f[i].mostrar();
            }
            // else
            // {
            //     print("En esta fraternidad no hay un danzarin con chaqueta blanca");
            // }
        }
    }

    //inciso b
    mostrarFraternidadYDanza(Danzarin d)
    {
        
        for i=0 to nroFra-1
        {
            for j=0 to f[i].getNroDan()-1
            {
                if(f[i].getD()[j].comparar(d))
                {
                    print(f[i].getNom(),f[i].getDanza());
                }
            }
        }
    }

    //inciso C
    maxAniosExp()
    {   
        int mx=-1;
        for i=0 to nroFra-1
        {
            for j=0 to f[i].getNroMus()-1
            {
                if(f[i].getM()[j].getAniosDeExperiencia()>mx)
                {
                    mx=f[i].getM()[j].getAniosDeExperiencia();
                }
            }
        }
        return mx;
    }


    contarMusicos()
    {
        int mx=maxAniosExp();
        int c=0;
        for i=0 to nroFra-1
        {
            bool sw=false;
            for j=0 to f[i].getNroMus()-1
            {
                if(f[i].getM()[j].getAniosDeExperiencia()==mx)
                {
                    sw=true;
                    break;
                }
            }

            if(sw)
            {
                c=c+1;
            }
        }

        // return c;
        print("El numero de fraternidades que tienen al o los musicos con mas anios de Exp es ",c)
    }
}


//main
Begin

    ef=new EntradaFolclorica();
    ef.mostrarFraternidades();

    d=new Danzarin();
    ef.mostrarFraternidadYDanza(d);

    // print(ef.contarMusicos());
    ef.contarMusicos();
End