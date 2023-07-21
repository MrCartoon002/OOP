class ARectangle
{
    public static void main(String[] args) {
        Rectangle ak1 = new Rectangle();
        Rectangle ak2 = new Rectangle();

        ak1.insert(7,34);
        ak2.insert(2,9);

        ak1.calcArea();
        ak2.calcArea();
    }
}
class Rectangle
{
    int length;
    int width;
    void insert(int l,int w)
    {
        length=l;
        width=w;
    }
        void calcArea()
        {
            System.out.println(length*width);
        }
}