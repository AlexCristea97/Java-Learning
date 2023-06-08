public class SIBTest {
    public static final String owner;

    static{
        owner = "alex";
        System.out.println("SIBTest static intialization block called");
    }

    public SIBTest(){
        System.out.println("SIB constructor called");
    }

    static{
        System.out.println("2nd intializ block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
