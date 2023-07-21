public class OverloadCalc {
    static void add(int x, long y){System.out.println((x+y) + " <Int taken first>");}//Will not work, when there is int in second space
    static void add(long x, long y){System.out.println((x+y) + " <Long taken first>");}//Will not work, when int is present in the previous same statement
    //static void add(long x, int y){System.out.println((x+y) + " <Long taken first>");} Will not work, when there is int in first space
    static void add(double x, double y, double z){System.out.println(x+y+z);}
    static void sub(long x, long y){System.out.println(x-y);}
    static void sub(double x, double y, double z){System.out.println(x-y-z);}

    public static void main(String[] args) {
        OverloadCalc ak = new OverloadCalc();
        ak.add(39,3);
        ak.add(7.5,6,3.0);
        ak.sub(33,10);
        ak.sub(70.5,6,3.0);
    }
}
