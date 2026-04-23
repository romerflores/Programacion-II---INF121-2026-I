class Artista
{
    protected:
        string nombre,nacionalidad;
        int edad,nroPremios;
        string premios[2,100];
    public:
        Artista(string n,string nac,int e,int np)
        {
            nombre=n;
            nacionalidad=nac;
            edad=e;
            nroPremios=np;
            for i=0 to nroPremios-1
            {
                print("INgrese premio")
                read(premios[0,i],premios[1,i])
            }
        }

        mostrar()
        {
            print(nombre,nacionalidad,edad,nroPremios);
            for i=0 to nroPremios-1
            {
                print(premios[0,i],premios[1,i])
            }
        }
        mostrarPremiosAnioX(int x)
        {
            int c=0;
            for i=0 to nroPremios-1
            {
                if((int)premios[0,i]==x)
                {
                    c=c+1;
                }
            }
            print("el Artista",nombre," gano ",c," premios el anio ",x)
        }
}



class Cantante:Artista
{
    private:
        string genero,disquera;
    public:
        Cantante(string n,string nac,int e,int np,string g,string dis)
        {
            Artista(n,nac,e,np);
            genero=g;
            disquera=dis;
        }

        mostrar()
        {
            Artista.mostrar();
            print(genero,disquera);
        }
        mostrarMasPremios(Cantante otro)
        {
            if(otro.nroPremios==nroPremios)
            {
                mostrar();
                otro.mostrar();
            }
            else
            {
                if(otro.nroPremios<nroPremios)
                {
                    mostrar();
                }
                else
                {
                    otro.mostrar();
                }
            }
        }
}


class Actor:Artista
{
    private:
        int anioDebut;
        bool retirado;
    public:
        Cantante(string n,string nac,int e,int np,string ad,string r)
        {
            Artista(n,nac,e,np);
            anioDebut=ad;
            retirado=r;
        }

        mostrar()
        {
            Artista.mostrar();
            print(anioDebut,retirado);
        }

}

Begin

    a1=new Actor("A","BO",37,3,2002,false);
    a2=new Actor("B","AR",50,1,1993,true);

    a1.mostrar();
    a2.mostrar();

    a1.mostrarPremiosAnioX(2005);
    a2.mostrarPremiosAnioX(2005);

    c1=new Cantante("C","BO",56,10,"Salsa","DC");
    c2=new Cantante("D","CL",76,25,"Cumbia","Solid");

    c1.mostrar();
    c2.mostrar();

    c1.mostrarPremiosAnioX(2009);
    c2.mostrarPremiosAnioX(2010);

    c1.mostrarMasPremios(c2);

End