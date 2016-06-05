
public class Area {

	private int radius,length, breadth,areaRectangle;
    private final float pi=3.14f, half=0.5f;
    private float base, height, areaCircle,areaTriangle;

    Area()
    {
        radius=0;
        length=0;
        breadth=0;
        base=0.0f;
        height=0.0f;
    }

    void input(int r)
    {
        radius=r;
    }

    void input(int l,int b)
    {
        length=l;
        breadth=b;
    }

    void input(float b,float h)
    {
        base=b;
        height=h;
    }
    
    void AreaCircle()
    {
        areaCircle=pi*radius*radius;
        System.out.println("Area of Circle is "+areaCircle+"cm.square" );
    }

    void AreaTriangle()
    {
        areaTriangle=half*base*height;
        System.out.println("Area of Triangle is "+areaTriangle+"cm.square"   );
    }

    void AreaRectangle()
    {
        areaRectangle=length*breadth;
        System.out.println("Area of Rectangle is "+areaRectangle+"cm.square"   );
  }
}
