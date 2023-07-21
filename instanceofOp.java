public class instanceofOp {

        public static void main(String args[]) {

            String name = "James";

            // following will return true since name is type of String
            //Syntax :- ( Object reference variable ) instanceof  (class/interface type)
            boolean result = name instanceof String;
            System.out.println( result );
        }
}
