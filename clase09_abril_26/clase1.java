class ExploradorArchivos
{
    private:
        string archivos[3,30];
        int cantArchivos;
    public:
    ExploradorArchivos(int na)
    {
        for i=0 to na-1
        {
            print("ingrese nombre archivo")
            read(archivos[0,i])
            print("ingrese directorio")
            read(archivos[1,i])
            print("ingrese nro disco")
            read(archivos[2,i])
        }
        cantArchivos=na;
    }

    mostrar()
    {
        print("cant archivos:",cantArchivos)
        for i=0 to cantArchivos-1
            print(archivos[0,i],archivos[1,i],archivos[2,i])
        
    }

    adicionar(int x)
    {
        string nombreAr,directorio;
        print("igrese nombre y directorio")
        read(nombreAr,directorio)
        archivos[0,cantArchivos]=nombreAr
        archivos[1,cantArchivos]=directorio
        archivos[2,cantArchivos]=(string)x
        cantArchivos=cantArchivos+1
    }

    adicionar(string d,int x)
    {
        string nombreAr;
        print("igrese nombre arch")
        read(nombreAr)
        archivos[0,cantArchivos]=nombreAr
        archivos[1,cantArchivos]=d
        archivos[2,cantArchivos]=(string)x
        cantArchivos=cantArchivos+1
    }


    //borrar el archivo x

    borrar(string x)
    {   
        int i=0
        while i<=cantArchivos-1
        {
            if archivos[0,i]==x
            {
                for j=i to cantArchivos-2
                {
                    archivos[0,j]=archivos[0,j+1]
                    archivos[1,j]=archivos[1,j+1]
                    archivos[2,j]=archivos[2,j+1]
                }
                cantArchivos=cantArchivos-1
                i=i-1
            }
            i=i+1
        }
    }

    //borrar todos los archivos del disco x
    borrar(int x)
    {   
        int i=0
        while i<=cantArchivos-1
        {
            if archivos[2,i]==(string)x
            {
                for j=i to cantArchivos-2
                {
                    archivos[0,j]=archivos[0,j+1]
                    archivos[1,j]=archivos[1,j+1]
                    archivos[2,j]=archivos[2,j+1]
                }
                cantArchivos=cantArchivos-1
                i=i-1
            }
            i=i+1
        }
    }


    +(string a)
    {
        int i=0
        while i<=cantArchivos-1
        {
            if archivos[0,i]==a
            {
                for j=i to cantArchivos-2
                {
                    archivos[0,j]=archivos[0,j+1]
                    archivos[1,j]=archivos[1,j+1]
                    archivos[2,j]=archivos[2,j+1]
                }
                cantArchivos=cantArchivos-1
                i=i-1
            }
            i=i+1
        }
        return this;
    }


    -(int x)
    {
        if cantArchivos>0
            archivos[2,0]=(string)x
        
        return this
    }



    -(string a)
    {
        for i=0 to cantArchivos-1
        {
            if archivos[0,i]==a
                return true
        }
        return false
    }


    !()
    {
        string directorio;
        print("ingrese un directorio a borrar")
        read(directorio)

        for i=0 to cantArchivos-1
        {
            if archivos[1,i]==directorio
            {
                print(archivos[0,i],archivos[1,i],archivos[2,i])
            }
        }

        return this

    }





}