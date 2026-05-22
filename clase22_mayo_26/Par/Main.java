package par;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Par<String, Integer> ne=new Par<String,Integer>("Romer",23);
		
		Par<Integer, Boolean> x=new Par<Integer, Boolean>(25,true);
		
		
		Vector<Integer,Boolean> v=new Vector<Integer,Boolean>();
		
		System.out.println(v.getPar());
		
//		v.setPar(ne);
		
	}

}
