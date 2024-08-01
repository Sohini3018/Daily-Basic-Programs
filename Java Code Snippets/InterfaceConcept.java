interface Computer {
    // by default variable in interfaces are FINAL and STATIC
    // as STATIC we can call these directly with interface name
    // so initialization of the variables inside interface is must
    int price = 5000;

    // by default PUBLIC and ABSTRACT --> all methods
    // this interface is made for implementation in different classes only
    // other class must implement this methods
    void compiler();

    // no other method to be used
    // interface is only for the structure layer that is hypothetical
    // other classes implement this interface
    // if we want to use abstract classes with normal classes also --> use abstract classes

    default int getPrice() {
        return price;
    }
    // but we can use default method --> new addition in Java 8! LOL!
}

class Desktop implements Computer{
    public void compiler(){
        System.out.println("Compiling in Desktop.");
    }
}

class Laptop implements Computer{
    public void compiler(){
        System.out.println("Compiling in Laptop.");
    }
}
class Developer {
    public void code(Computer obj) {
        System.out.println("Coding");
        obj.compiler();
    }
}
public class InterfaceConcept {
    public static void main(String[] args) {

        Developer dev1 = new Developer();
        Developer dev2 = new Developer();

        // reference for actual interface but object for class
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        dev1.code(lap);
        dev2.code(desk);

        System.out.println(Computer.price);
    }  
}

// Output
// Coding
// Compiling in Laptop.
// Coding
// Compiling in Desktop.
// 5000
