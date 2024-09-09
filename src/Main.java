/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int a, b;
        a = 6;
        b = 9;
        System.out.println(add(a,b));
        int c,d,e,f;
        c = 10;
        d = 2;
        e = 4;
        f = 3;
        System.out.println(add(c,d,e,f));
        String name = "Toby Fox";
        System.out.println(morningGreeting(name));
        String afternoon = "Mac Miller";
        System.out.println(afternoonGreeting(afternoon));
        String result = triple("oohbaby");
        System.out.println(result);
        double result1 = half(6);
        double result2 = half(8);
        System.out.println(result1);
        System.out.println(result2);
        int result3 = roundPositiveValueToNearestInteger(8.5);
        int result4= roundPositiveValueToNearestInteger(8.49);
        System.out.println(result3);
        System.out.println(result4);
        int negative1 = roundNegativeValueToNearestInteger(-8.6);
        int negative2 = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(negative1);
        System.out.println(negative2);




    }

    // 1. add
     public static int add(int a, int b) {
        return a + b;
    }




    // 2. add
    public static int add(int c, int d, int e, int f) {


        return add(add(c,d),add(e,f));
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "Good morning, " + name;
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String afternoon) {
        return "Good afternoon, " + afternoon;
    }


    // 5. triple
    public static String triple(String triple) {
        return triple + triple + triple;
    }

    // 6. half
    public static double half(int num) {
        return num/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double value) {
        return (int) Math.round(value);

    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double value1) {
        return (int) Math.round(value1);
    }

}
