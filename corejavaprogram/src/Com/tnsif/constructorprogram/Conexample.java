package Com.tnsif.constructorprogram;
//demo for constructor 

public class Conexample {
	Conexample(int i){
		System.out.println("constructor with 1 parameter");
	}
	
	Conexample(int i,int j){
		System.out.println("constructor with 2 parameter");
	}
	Conexample(int i, String g , int w){
		System.out.println("constructor with 3 parameter");
	}
	public static void main(String[] args) {
		//Conexample c=new Conexample(9,"hello");
		Conexample c1=new Conexample(7,9);
		Conexample c2=new Conexample(5);
		Conexample c3=new Conexample(7,"punya",(int) 9.7f);
		
	}

}
