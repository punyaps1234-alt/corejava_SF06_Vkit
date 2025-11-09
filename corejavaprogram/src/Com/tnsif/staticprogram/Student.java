package Com.tnsif.staticprogram;
//demo for static method

public class Student {
	int rollno;
	String name;
	static String college="Reva";
	
	// static method change value

	static void change() {
		college="vkit";
	
	}
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void displsy() {
		System.out.println(rollno+" "+name+" "+college);
	}
	
	public static void main(String[] args) {
		Student.change();
		Student s1=new Student(1,"punya");
		Student s2=new Student(2,"sahana");
		Student s4=new Student(3,"ranjitha");
		s1.displsy();
		s2.displsy();
		s4.displsy();
	}

}
