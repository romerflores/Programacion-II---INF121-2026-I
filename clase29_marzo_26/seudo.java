//ejercicio 8 Seccion 2

class Playlist
{
    private:
        string nombre;
        double espacio;
        int nroCanciones;
        string canciones[100,3];
    
    public:
        Playlist(string nombre,double espacio,int nc)
        {
            this.nombre=nombre;
            this.espacio=espacio;
            this.nroCanciones=nc;
            for i=0 to nc-1 //[0,nc-1]
            {
                read(canciones[i,0]);//nombre
                read(canciones[i,1]);//artista
                read(peso[i,2]);//artista
            }
        }

        mostrar()
        {
            print(this.nombre);
            print(this.espacio);
            print(this.nroCanciones);
            for i=0 to nroCanciones-1
            {
                print(canciones[i,0],canciones[i,1],canciones[i,2]);
            }
        }


        borrar(string x)//borrar cancion x
        {
            int i=0;

            while i<nroCanciones
            {
                if(canciones[i,0]==x)
                {
                    //recorrer
                    for j=i to nroCanciones-2
                    {
                        canciones[j,0]=canciones[j+1,0];
                        canciones[j,1]=canciones[j+1,1];
                        canciones[j,2]=canciones[j+1,2];
                    }
                    nroCanciones=nroCanciones-1;
                    i=i-1;
                }
                i=i+1
            }
        }

        borrar(string nom,string ar)//borrar cancion x
        {
            int i=0;
            while i<nroCanciones
            {
                if(canciones[i,1]==ar and  canciones[i,0]=nom)
                {
                    //recorrer
                    for j=i to nroCanciones-2
                    {
                        canciones[j,0]=canciones[j+1,0];
                        canciones[j,1]=canciones[j+1,1];
                        canciones[j,2]=canciones[j+1,2];
                    }
                    nroCanciones=nroCanciones-1;
                    i=i-1;
                }
                i=i+1
            }
        }

        borrar(double x)//borrar cancion x
        {
            int i=0;
            while i<nroCanciones
            {
                if((double)canciones[i,2]==x)
                {
                    //recorrer
                    for j=i to nroCanciones-2
                    {
                        canciones[j,0]=canciones[j+1,0];
                        canciones[j,1]=canciones[j+1,1];
                        canciones[j,2]=canciones[j+1,2];
                    }
                    nroCanciones=nroCanciones-1;
                    i=i-1;
                }
                i=i+1
            }
        }

        espacioDisponible()
        {
            double total_usado=0;
            for i=0 to nroCanciones-1
            {
                total_usado=total_usado+(double)canciones[i,2];
            }
            return espacio-total_usado;
        }

        //operador binario
        operator+(string nom)
        {
            double peso;
            string artista;
            print("Ingrese artista");
            read(artista);
            print("ingrese peso");
            read(peso);


            double espacio_libre=espacioDisponible();

            if(espacio_libre>=peso)
            {
                canciones[nroCanciones,0]=nom;
                canciones[nroCanciones,1]=artista;
                canciones[nroCanciones,2]=(string)peso;
                nroCanciones=nroCanciones+1;
            }
            else
            {
                print("No hay espacio suficiente");
            }
        }
}


begin

    Playlist p1=new Playlist("Clasicos",256.0,5);
    p1.mostrar();

    p1.borrar("Rojo y negro");
    p1.mostrar();

    p1.borrar("Rojo y negro","George");
    p1.mostrar();

    p1.borrar(4.5);
    p1.mostrar();

    p1+"Billie Jean";
    p1.mostrar();

    print(p1.espacioDisponible());

end

