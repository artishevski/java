package artik.by;

public class arguments {
    public arguments() {
        MyClass myClass = new MyClass(24);
        f1(myClass);
        System.out.println(myClass.val);
    }
    class MyClass{
        public MyClass(int val) {
            this.val = val;
        }

        int val;
    }
    void f1(MyClass obj){
        obj.val = 177;
        obj = new MyClass(10);
    }
}
