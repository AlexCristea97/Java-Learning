
public class Main {
    public static void main(String[] args) {
//
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//     //   one.instanceNumber = 4;
//        System.out.println(Math.PI);
//      //  Math m = new Math();
//
//        int pw = 674321;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(123);
//        password.letMeIn(523542);
//        password.letMeIn(-1);
//        password.letMeIn(674321);

        System.out.println("main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("owner is " +SIBTest.owner);
    }
}