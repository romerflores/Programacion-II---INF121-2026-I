package ministerio;



public class ResServidor<D extends Usuario > {
	private int codigo;
	D dato;
	
	public ResServidor(int c,D d)
	{
		codigo=c;
		dato=d;
	}
	
	public void mostrar()
	{
		System.out.println(codigo);
//		System.out.println(dato);
		dato.mostrar();
	}
}







