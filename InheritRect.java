public class RectangleCalculator
{
    public static void main(String[] args)
    {
        Rectangle ak1 = new Rectangle();
        Rectangle ak2 = new Rectangle();

        ak1.insert(6,4);
        ak2.insert(3,9);

        ak1.calcArea();
        ak2.calcArea();

    }
}

class InheritRect
    {
        int length;
        int breadth;
    }
    class Rectangle extends InheritRect
    {
        void insert(int l,int w)
        {
            length=l;
            breadth=w;
        }
        void calcArea()
        {
            System.out.println(length*breadth);
        }
    }
