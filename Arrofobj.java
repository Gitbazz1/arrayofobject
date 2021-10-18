package Practise;

public class Arrofobj {
	
	String name;
	String version;
	int year;
	int ram;
	{
	System.out.println("constructer evoked");
	}
public 	Arrofobj(String name, String version, int year,int ram) {
    this.name=name;
    this.version=version;
    this.year=year;
    this.ram=ram;
    
}
    
    
    public void open(){
    	System.out.println("laptop opened");
    }

    public void paint() {
    	System.out.println("start painting");

    }
}
	


