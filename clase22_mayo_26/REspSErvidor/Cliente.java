package ministerio;

public class Cliente implements Usuario {
	
	private String nombre;
	private int ci;
	@Override
	public void mostrar() {
		
		System.out.print("Hola");
	}
}
