class RespServidor<D>
{
    private:
        int codigo;
        D dato;

    public:
        RespServidor(int c,D d)
        {
            codigo=c;
            dato=d;
        }

        mostrar()
        {
            print(codigo);
        }

}


class Cliente
{
    private:
        string nombre;
        int ci;
    
    public:

        Cliente(string n,int c)
        {
            nombre=n;
            ci=c;
        }

        mostrar()
        {
            print(nombre,ci);
        }

}


Begin

    RespServidor<Cliente> rp[100];



End

