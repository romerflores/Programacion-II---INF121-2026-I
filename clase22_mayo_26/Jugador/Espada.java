package Jugador;

public class Espada {
	
	private int danio;
	private String material;
	
	public Espada(int d,String m)
	{
		danio=d;
		material=m;
	}

	public int getDanio() {
		return danio;
	}

	public void setDanio(int danio) {
		this.danio = danio;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}
