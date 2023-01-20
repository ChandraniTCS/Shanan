package Method_overloding1;

public class Overloding3 {
public static void main(String[] args) {
	A.add(10,20);
	A.add(10, 20, 30);
}
class A{
	public static void add(int i ,int j) {
		System.out.println(i+j);
	
	}
	public static void add(int i, int j,int k) {
		System.out.println(i+j+k);
	}
}
}
