package par;

public class Vector<X,Y> {
	
	private Par<X,Y> par;
	private X nombre;
	private Y apellido;
	
	
	
	public void setPar(Par<X,Y> x)
	{
		par=x;
		par.mostrar();
	}
	
	public Par getPar()
	{
		return par;
	}
	
}
