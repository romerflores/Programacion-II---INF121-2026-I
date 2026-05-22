package ministerio;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ae[]=new int[100];
		ResServidor<Usuario> rp[]=new ResServidor[10];
		
		Cliente xd=new Cliente();
		
		//inciso
		rp[0].mostrar();
		rp[0]=new ResServidor<Usuario>(50,xd);
			
		//inciso c
		System.out.println(rp[0].dato.getClass().getName());
		
	}
	
	
	
	

}
