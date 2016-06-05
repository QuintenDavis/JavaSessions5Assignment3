import java.util.Scanner;

public class MainFunOverloaded {

	public static void main(String[] args) {
		
	
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of Circle as integer");
        int r=sc.nextInt();
        System.out.println("Enter the Length and Breadth of Rectangle as integer");
        int len=sc.nextInt();
        int bre=sc.nextInt();
        System.out.println("Enter the Base and height of Triangle as float");
        float b=sc.nextFloat();        
        float h=sc.nextFloat();
        
      
        Area circle =new Area();
        Area rectangle =new Area();
        Area triangle =new Area();
        
       
        circle.input(r);
        rectangle.input(len,bre);
        triangle.input(b,h);
        
        
        circle.AreaCircle();
        rectangle.AreaRectangle();
        triangle.AreaTriangle();

	}

}
