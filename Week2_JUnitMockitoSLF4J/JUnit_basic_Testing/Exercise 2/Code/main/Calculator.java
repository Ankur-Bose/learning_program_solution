package exercise2;

public class Calculator {

    public static int addTwoNumbers(int a, int b){
        return a + b;
    }

    public static int subtractTwoNumbers(int a, int b){
        if(a>b){
            return a-b;
        }
        else{
            return b-a;
        }
    }

    public static int multiplyTwoNumbers(int a, int b){
        return a*b;
    }

    public static double divideTwoNumbers(int a, int b){
        if(b!=0){
            return (double)a/b;
        }
        else{
            return (double)b/a;
        }
    }

    public static int addArrayNumbers(int ...numbers){
        int sum=0;
        for(int num : numbers){
            sum+=num;
        }
        return sum;
    }
}
