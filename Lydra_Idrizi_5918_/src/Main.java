public class Test {
    private String s;


    public Test(String s) {
        this.s = s;
    }


    public Test() {
        this.s = "Programming Languages";
    }


    public void method1() {
        System.out.println(s);
    }


    public void method2(int n) {
        System.out.println(n);
    }


    private void method() {
        System.out.println("Private method is invoked");
    }


    public static void main(String[] args) {
        Test test = new Test();
        test.method1();
        test.method2(10);

    }
}