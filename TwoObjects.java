class to1
{
    public static void main(String[] args)
    {
        TwoObjects ak1 = new TwoObjects();
        TwoObjects ak2 = new TwoObjects();

        ak1.insertRecord(001, "Jothis");
        ak2.insertRecord(002, "Rajaram");

        ak1.displayInformation();
        ak2.displayInformation();
    }
}


class TwoObjects {
    int regno;
    String name;

    void insertRecord(int r, String n) {
        regno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(regno + " " + name);
    }
}

