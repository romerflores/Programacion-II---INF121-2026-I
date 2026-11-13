class Musico
{
    //asumir que la clase ya esta implementa
    //eso incluye, los constructores, los getters y setters, y el mostrar

    comparar(Musico otro)
    {
        return nom==otro.nom and instrumento==otro.instrumento and AniosExperiencia==otro.AniosExperiencia
    }
}


class Vestimenta
{


}


class Danzarin
{

    comparar(Danzarin otro)
    {
        if nombre!=otro.nombre || edad!=otro.edad || rol!=otro.rol || nroVes!=otro.nroVes 
        {
            return false
        }

        for i=0 to otro.nroVes-1 //es para preguntar si todas las vestimientas son iguales
        {
            if v[i].getColor()!=otro.v[i].getColor() || v[i].getTipo()!=otro.v[i].getTipo()
            {
                return false
            }
        }
        return true
    }
}

class Fraternidad
{
    public Bailarin getBailarin(int i)
    {
        return bailarines[i];
    }
}

class EntradaFolclorica
{

    mostrarFraternidades()
    {
        for i=0 to nroFrat-1 //Recorre las fraternidades
        {
            bool todos=true;
            for j=0 to f[i].getNroDan()-1 //Recorre a los danzarines
            {
                Danzarin x=f[i].getDanzarin(j);//guardo el objeto por comodidad
                bool encontrado=false;
                for k=0 to f[i].getDanzarin(j).getNroVes()-1//recorre las vestimentas
                {
                    if x.getVestimenta(k).getColor()=="blanco" &&  x.getVestimenta(k).tipo()=="chaqueta"
                    {
                        encontrado=true;
                    }
                }

                if(encontrado==false)
                {
                    todos=false;
                }
            }

            if(todos==true)
            {
                f[i].mostrar();
            }
        }
    }

    mostrarDanzarin()
    {
        Danzarin d=new Danzarin();
        d.leer();

        for i=0 to nroFrat-1 //recorre cada fraternidad
        {
            for j=0 to f[i].getNroDan()-1 // recorre cada danzarin de la fraternidad i-esima
            {
                if(d.comparar(f[i].getDanzarin(j)))//usamos una funcion para comparar
                {
                    print("El danzarin ",d.getNom()," baila en la fraternidad ",f[i].getNom()," y baila la danza ",f[i].getDanza())
                }
            }
        }
    }

    masAnios()
    {
        int mx=0;
        for i=0 to nroFrat-1//este for recoore cada fraternidad
        {
            for j=0 to f[i].getNroMus()-1//este for recorre cada musico del fratenidad en la posicion i-esima
            {
                if(f[i].getMusico(j).getAniosExperiencia()>mx)
                {
                    mx=f[i].getMusico(j);
                }
            }
        }

        return mx
    }


    contar()
    {
        int mx=masAnios();

        Musico musMasExp[2500];
        int cm=0;

        for i=0 to nroFrat-1//este for recorre cada fraternidad
        {
            for j=0 to f[i].getNroMus()-1//este for recorre cada musico del fratenidad en la posicion i-esima
            {
                if(f[i].getMusico(j).getAniosExperiencia()==mx)
                {
                    musMasExp[cm]=f[i].getMusico(j);
                    cm++;
                }
            }
        }
        int contador=0;
        for i=0 to nroFrat-1//este for recorre cada fraternidad
        {
            bool todos=true;
            for j=0 to cm-1//este for recorre a todos los musicos con mas anios de experiencia
            {
                bool encontrado=false;
                for k=0 to f[i].getNroMus()-1//este for recorre a todos los musicos de la la freaternidad
                {
                    if(musMasExp[j].comparar(f[i].getMusico(k)))
                    {
                        encontrado=true;
                    }
                }
                if(encontrado==false)
                {
                    todos=false;
                }
            }
            if(todos)
            {
                contador=contador+1;
            }
        }
    }

    print("Existen ",contador," fraternidades con los musicos con mas experiencia")
}


Begin
    entrada=new EntradaFolclorica();//es constructor por defecto

    entrada.leer();
    entrada.mostrar();

    entrada.mostrarFraternidades();

    entrada.mostrarDanzarin();
    entrada.contar();

End


