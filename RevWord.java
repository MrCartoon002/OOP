public class RevWord {
    public static void main(String[] args) {
        System.out.println(StringRev.reverseWord("my name is akash"));
        System.out.println(StringRev.reverseWord("I am also known as ak"));
    }
}

public class StringRev {
    public static String reverseWord(String str){
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }
}

