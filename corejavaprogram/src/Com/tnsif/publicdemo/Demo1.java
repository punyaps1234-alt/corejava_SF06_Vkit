package Com.tnsif.publicdemo;

import Com.tnsif.accessmodifierdemo.Accessdemo;

public class Demo1 {
public static void main(String[] args) {
		Accessdemo obj=new Accessdemo();
		System.out.println(obj.getA());
		System.out.println(obj.getS());
		
		obj.display();
}

}
