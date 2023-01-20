package Array;

public class Revese_array {
public static void main(String[] args) {
	int ar[] =  new int [] {1,2,3,4,5};
	
	System.out.println("origanal array:");
	
	for(int i= 0;i< ar.length;i++) {
		System.out.println(ar[i]+" ");
	}
	//revese Array
	System.out.println("revese arrray:");
	
	for(int i= ar.length-1;i>=0;i--) {
		System.out.println(ar[i]+ " ");
		
	}
	
}
}
