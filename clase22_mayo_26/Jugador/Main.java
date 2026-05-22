package Jugador;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Espada esp1=new Espada(120,"Diamanete");
		Escudo esc1=new Escudo("Ojalata",10);
		
		Slot<Object> slot1=new Slot<Object>(); 
		
		Scanner lec=new Scanner(System.in);
		int tecla;
		do {
			
			
			System.out.println("Ingrese Tecla:");
			System.out.println("1)Continuar Juego");
			System.out.println("2)Finalizar Juego");
			
			tecla=lec.nextInt();
			if(tecla==2)
			{
				System.out.println("Saliendo del juego...");
				break;
			}
			
			if (slot1.getItem()==null)
			{
				System.out.println("1)Equiparse con espada");
				System.out.println("2)Equiparse con Escudo");
				tecla=lec.nextInt();
				if(tecla==1)
				{
					System.out.println("Equipando una espada...");
					slot1.equipar(esp1);
				}
				else
				{
					System.out.println("Equipando un escudo...");
					slot1.equipar(esc1);
				}
				
			}
			else if(slot1.getItem().getClass().getName().equals("Jugador.Espada"))
			{
				System.out.println("1)Atacar");
				System.out.println("2)Desequipar");
				tecla=lec.nextInt();
				
				if(tecla==1)
				{
					System.out.println("Estoy atacando con una espada de"+esp1.getMaterial()+" con un danio de "+esp1.getDanio());
				}
				else
				{
					System.out.println("DEsequipando...");
					slot1.desequipar();
				}
				
				
			}
			else if(slot1.getItem().getClass().getName().equals("Jugador.Escudo"))
			{
				System.out.println("1)Defenderse");
				System.out.println("2)Desequipar");
				tecla=lec.nextInt();
				
				if(tecla==1)
				{
					System.out.println("Me estoy defendiendo");
				}
				else
				{
					System.out.println("DEsequipando...");
					slot1.desequipar();
				}
			}
		} while (true);
		
	}

}
