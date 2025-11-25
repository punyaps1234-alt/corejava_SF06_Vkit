package Com.tnsif.exceptionhadnlingprograms;
//no exception
public class Test1 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("punya");
		}
	}

}
