begin

    //inciso (a
    e1=new ExploradorArchivos(3)
    e1.mostrar()


    e1.adicionar(2)
    e1.mostrar()

    string dir;
    read(dir);
    e1.adicionar(dir,1)
    e1.mostrar()


    e1.borrar("tarea.txt")
    e1.mostrar()

    //sobrecarga el operador - para verficar si existe o no el archivo a
    if e1-"tareas.txt"
        print("Si existe")
    else
        print("No existe")

    //sobrecargar el operador - con un entero x para cambiar primer disco del primer archivo a x, si es que existe un archivo
    e1=e1-6

    e1.mostrar();

    !e1


end


