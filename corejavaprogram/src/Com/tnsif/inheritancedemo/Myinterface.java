package Com.tnsif.inheritancedemo;
//demo for nested interface

public interface Myinterface {
	
void caluculatearea();
	
	// nested interface
	interface Myinnerinterface{
		int id=70;
		void print();
	}

}
