public class FormPoly {
    public static void main(String[] args) {
        System.out.println(area.sq(4));
        System.out.println(area.rec(4,6));
        System.out.println(area.add(4.3,6.4, 10.0));
        System.out.println(area.sub(69.3,4.34, 45.0));
    }
}
class area{
    static int sq(int x){return x*x;}
    static int rec(int x, int y){return x*y;}
    static double add(double x, double y, double z){return x+y+z;}
    static double sub(double x, double y, double z){return x-y-z;}
}
