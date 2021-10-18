package Practise;

public class Ttt {

	public static void dislay (Arrofobj objs[] ) {
		System.out.println("laptop info");
		
		for ( int i = 0; i<objs.length ; i++) {
			if( objs[i].ram >= 4) {
				System.out.println(objs[i].name);

				System.out.println(objs[i].version);

				System.out.println(objs[i].year);

				System.out.println(objs[i].ram);

				System.out.println("*****");
				System.out.println("");

			}
	    		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Arrofobj laptop1 = new Arrofobj("acer", "v01", 2014, 2);
		
		Arrofobj laptop2 = new Arrofobj("acerr", "v02", 2015, 3);

		Arrofobj laptop3 = new Arrofobj("toshiba", "v03", 2014, 4);

		Arrofobj laptop4 = new Arrofobj("dell", "v04", 2016, 5);

		Arrofobj laptop5 = new Arrofobj("acer", "v06", 2019, 8);
		
		Arrofobj objs[]= {laptop1,laptop2,laptop3,laptop4,laptop5 };
		

		Ttt.dislay(objs);
	}

}
