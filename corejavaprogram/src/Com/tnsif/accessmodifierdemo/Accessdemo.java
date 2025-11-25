package Com.tnsif.accessmodifierdemo;
//demo for access modifier


//public
//private
//protected
//default

public class Accessdemo {
	
	// public 
		  private int a=9;
		private String s="guru";
		
		 public void display() { 
			System.out.println("welcome to java");
		}
		
		public static void main(String[] args) {
			Accessdemo obj=new Accessdemo();
			System.out.println(obj.getA());
			System.out.println(obj.getS());
			
			obj.display();
		}

		public String getS() {
			return s;
		}

		public void setS(String s) {
			this.s = s;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

}
