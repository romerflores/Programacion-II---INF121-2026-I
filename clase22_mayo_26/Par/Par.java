package par;

public class Par<X,Y> {
	
	private X valor1;
	private Y valor2;
	
	public Par(X v1,Y v2)
	{
		valor1=v1;
		valor2=v2;
	}
	
	
	public void mostrar()
	{
		System.out.println(valor1+""+valor2);
	}
	
	
	public void setValor1(X nv)
	{
		valor1=nv;
	}
}
