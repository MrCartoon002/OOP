class info {
    public static void main(String[] args) {
        Ryver ak1 = new Ryver();
        Ryver ak2 = new Ryver();

        ak1.insertRecord(1001, "Jothis", "Trichy", 12, 50000);
        ak2.insertRecord(1002, "Rajaram", "Chennai", 12, 12000);

        ak1.displayInformation();
        ak2.displayInformation();

        empsalary s = new empsalary();

        s.salary(12, 50000);
        s.salary(12, 12000);
    }
}

class Ryver {
    int empid;
    String name;
    String branch;
    int months;
    int daycost;

    void insertRecord(int r, String n, String b, int m, int d) {
        empid = r;
        name = n;
        branch = b;
        months = m;
        daycost = d;
    }

    void displayInformation() {
        System.out.println(empid + "," + name + "," + branch);
    }
}

class empsalary extends Ryver
{
    int salary;
    void salary(int m,int d)
    {
        salary=(int)((m*d));
        System.out.println("Salary : "+salary);
    }
}