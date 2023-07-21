class Abstract extends CTS {
    @Override
    void run() {
        System.out.println("Employed");
    }

    public static void main(String[] args) {
        CTS obj = new Abstract();
        obj.run();
    }
}

abstract class CTS{
    abstract void run();
}