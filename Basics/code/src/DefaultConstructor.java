class Test {
    public Test(){
        System.out.println("Test constructor called");
    }

    public void print(){
        System.out.println("Hello World");
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Test t = new Test();
        t.print();
    }
}
