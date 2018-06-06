package zxa;

class AA {
	static void methd1()
	{
		System.out.println("AA method1");
	}
	final int methd2()
	{
		return 0;
	}
	private int methd3()
	{
		return 0;
	}
}
class BB extends AA {
	private int methd3()
	{
		return 0;
	}
}
public class Test {
	
	public static void main(String []argv)
	{
		String color = "green";  
		   
		 switch (color) {  
		 case "red":  
		   System.out.println("Color is Red");  
		   break;  
		case "green":  
		  System.out.println("Color is Green");  
		   break;  
		 default:  
		     System.out.println("Color not found");  
		 }      }
}
