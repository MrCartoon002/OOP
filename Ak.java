public class Ak {
    public static void main(String[] args) {
        match1 b1 = new Batsman();
        match1 b2 = new Bowler();
        match1 b3 = new Allrounder();
        b1.bat();
        b2.bowl();
        b3.both();
    }
}

    interface match1{
        void bat();
        void bowl();
        void both();
    }

    class Batsman implements match1 {
        public void bat(){
            System.out.println("I am BATSMAN");
        }
    }

    class Bowler implements match1 {
        public void bowl(){
            System.out.println("I am BOWLER");
        }
    }

    class Allrounder implements Batsman,Bowler {
        public void both(){
            System.out.println("I am BATSMAN and BOWLER");
        }
    }
