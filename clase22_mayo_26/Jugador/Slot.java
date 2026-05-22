package Jugador;

public class Slot<T> {
	private T item;
	
	public void equipar(T nuevoItem)
	{
		if(item==null)
		{
			item=nuevoItem;
		}
	}
	
	public void desequipar()
	{
		item=null;
	}
	
	public T getItem()
	{
		return item;
	}
	
}
