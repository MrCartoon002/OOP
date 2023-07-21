import java.util.Scanner;
public class IdAndName1
{
    public static void main(String[] args) {
        IdAndName ak = new IdAndName();
        ak.id = 3725;
        ak.name = "Akash";
        System.out.println("Your ID is : " +ak.id);
        System.out.println("Your Name is : " +ak.name);
    }
}

class IdAndName
{
        int id;
        String name;
}
