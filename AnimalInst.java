public class AnimalInst{
    public static void main(String[] args) {
        ja ak = new ja();
        System.out.println(ak instanceof  Animal);
    }
}
class Animal{}
class ja extends Animal{
    static void method(Animal a){
        if(a instanceof ja){
            ja ak =(ja)a;
            System.out.println("Downcasting Performed");
        }
    }
}
