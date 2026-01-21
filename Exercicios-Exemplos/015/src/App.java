class OuterClass {
    int x = 10;

    // class InnerClass {
    //     int y = 5;
    // }

    // private class InnerClass {
    // int y = 5;
    // }

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        //OuterClass.InnerClass myInner = new OuterClass.InnerClass();

        System.out.println(myInner.myInnerMethod());
    }
}
