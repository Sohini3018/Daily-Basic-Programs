// Either we can extend Thread class else implement Runnable class
class A extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println("Run A");
        }   
    }
}
// this extends Thread class which has run and start methods
// here we are actually overriding the run method from parent class
class B extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println("Run B");
        }
    }
}

class C implements Runnable{
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println("Run C");
        }   
    }
}

class D implements Runnable{
    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println("Run D");
        }
    }
}

public class ThreadConcept {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // start() method is present is Thread class class A, B are now 
        // sub/child class of Thread
        // So we can use this method
        a.start();
        b.start();

        C c = new C();
        D d = new D();

        // we can not create obj of Runnable as it is interface
        // Thread class also implements Runnable which has implementation of all methods
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(d);

        t1.start();
        t2.start();

    }   
}
