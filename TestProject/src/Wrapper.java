
public class Wrapper {

public static void main(String[] args)
{
	byte a=1;
	Byte byteobj=new Byte(a);
	int b=2;
	Integer intobj=new Integer(b);
	boolean c=true;
	Boolean booleanobj=new Boolean(c);
	double d=12.28;
	Double doubleobj=new Double(d);
	System.out.println("Values of the wrapper class:");
	//System.out.println("Byte byteobj= "+ byteobj);//
	System.out.println("Byte byteobj= "+ intobj);
	System.out.println("Byte byteobj= "+ booleanobj);
	System.out.println("Byte byteobj= "+ doubleobj);

}
}
