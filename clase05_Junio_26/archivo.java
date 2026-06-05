class Anuncio
{


}

class Artista
{


}

class Obra
{
    private:
        string titulo;
        string material;
        Artista a1, a2;
        Anuncio b;
    public:
        Obra(string t,string m)
        {
            titulo=t;
            material=m;
            a1=new Artista("pepito",1234,3);
            a2=new Artista("Raul",4321,1);
            b=null;
        }

        Obra(string t,string m,Anuncio add)
        {
            titulo=t;
            material=m;
            a1=new Artista("pepito",1234,3);
            a2=new Artista("Raul",4321,1);
            b=add;
        }
    
        agregarAnuncio(Anuncio add)
        {
            if(b==null)
            {
                b=add;
            }
            else
            {
                print("Ya existe anuncio!!!");
            }
        }

        mayExp()
        {
            if a1.getAniosExperiencia()>a2.getAniosExperiencia()
            {
                return a1;
            }
            return a2;
        }

        masExp(Pintura otro)
        {
            if this.mayExp().getAniosExperiencia()>otro.mayExp().getAniosExperiencia()
            {
                print(this.mayExp().getNombre());
            }
            else
            {
                print(otro.mayExp().getNombre());
            }
        }

        maxExperiencia(Pintura otro)
        {
            int mx=this.mayExp().getAniosExperiencia();
            if otro.mayExp().getAniosExperiencia()>mx
            {
                mx=otro.mayExp().getAniosExperiencia();
            }
            if(this.a1.getAniosExperiencia()==mx)
            {
                print(a1.getNombre());
            }
            if(this.a2.getAniosExperiencia()==mx)
            {
                print(a2.getNombre());
            }
            if(otro.a1.getAniosExperiencia()==mx)
            {
                print(otro.a1.getNombre());
            }
            if(otro.a2.getAniosExperiencia()==mx)
            {
                print(otro.a2.getNombre());
            }

        }


        total(Pintura otro)//devuelve entero
        {
            return this.b.getPrecio()+otro.b.getPrecio();
        }

        total2(Pintura otro)
        {
            int total=0;
            if(this.b!=null)total=this.b.getPrecio();
            if(otro.b!=null)total=total+otro.b.getPrecio();
            print(total);
        }


        promedio(Pintura otro)
        {
            double suma=this.a1.getAniosExperiencia()+this.a2.getAniosExperiencia()+otro.a1.getAniosExperiencia()+otro.a2.getAniosExperiencia();

            double prom=suma/4;
            print(prom);
        }

        //Esta forma tambiene s valida
        incrementarPrecio()
        {
            int x;
            print("Ingrese precio a sumar")
            read(x);
            string y;
            print("Ingrese nombre")
            read(y);
            if a1.getNombre()==y or a2.getNombre()==y
            {
                b.setPrecio(b.getPrecio()+x);
            }
        }
        //2da forma
        incrementarPrecio(int x,string y)
        {
            if a1.getNombre()==y or a2.getNombre()==y
            {
                b.setPrecio(b.getPrecio()+x);
            }
        }


        

}

class Pintura:Obra
{
    private:
        string genero;

    Pintura(string t,string m, string g)
    {
        Obra(t,m);
        genero=g;
    }

}


Begin

    a1=new Anuncio(1,1500);
    a2=new Anuncio(2,1700);


    p1=new Pintura("La noche estrellada","oleo", "Renacimiento");
    p2=new Pintura("Noche","aceite", "Contemporaneo",a1);

    p1.mostrar();
    p2.mostrar();

    // p1.agregarAnuncio(a1);

    ///2
    //primera forma
    p1.masExp(p2);

    //segunda forma
    p1.masExperiencia(p2);


    //3
    p1.agregarAnuncio(a2);

    print("El total es:",p2.total(p1));

    /**
     * FILA B
     */

    //1

    
    p1=new Pintura("La noche estrellada","oleo", "Renacimiento",a1);
    p2=new Pintura("Noche","aceite", "Contemporaneo",a2);
    // p1.agregarAnuncion(a1);
    // p2.agregarAnuncion(a2);
    //2
    p2.promedio(p1);

    //3
    p1.incrementarPrecio();
    p2.incrementarPrecio(20,"Luis");


    p1.mostrar();
    p2.mostrar();

End