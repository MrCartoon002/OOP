public class ToTestInt {
    public static void main(String[] args) {
        test b2 = new arithmath();
        b2.square();
    }
}
interface test{
    void square();
}

class arithmath implements test{
    public void square(){
        System.out.println("Square");
    }
}
