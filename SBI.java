public class BOI extends Bank{
    int getRateofInterest(){
        return 7;
    }
}

class IOB extends Bank{
    int getRateofInterest(){
        return 8;
    }
}

class SBI{
    public static void main(String[] args) {
        Bank b = new BOI();
        System.out.println("RoI :" + b.getRateofInterest() + "%");
        Bank b = new IOB();
        System.out.println("RoI :" + b.getRateofInterest() + "%");
    }
}

abstract class Bank{
    abstract int getRateofInterest;
}