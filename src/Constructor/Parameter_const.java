package Constructor;

public class Parameter_const {
int Roll_no;
String Name;
float fees;
Parameter_const(int Roll_no,String Name,float fees)
{
	this.Roll_no=Roll_no;
	this.Name = Name;
	this.fees = fees;
}
void Display()
{
	 System.out.println(Roll_no+" "+Name+" "+fees+" ");
}
public static void main(String[] args) {
	Parameter_const ref1 =new Parameter_const(101,"ashish",1000f);
	Parameter_const ref2 =new Parameter_const(102,"mahesh",1000f);
	ref1.Display();
	ref2.Display();
}
}
