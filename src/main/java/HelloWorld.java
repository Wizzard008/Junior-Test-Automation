public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int a = 10;
        int b=10;
        Integer ao=a;
        Integer bo=b;
        System.out.println("a=b: "+(a==b));
        System.out.println("ao=a: "+(ao==a));
        System.out.println("bo=b: "+(bo==b));
        System.out.println("ao=bo: "+(ao==bo));
    }
}
