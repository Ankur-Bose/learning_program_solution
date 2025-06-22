import java.util.Scanner;

public class index {
    public static double futureValue(double presentValue, double rate, double n) {
        if (n == 0) {
            return presentValue;
        }
        return futureValue(presentValue * (1 + rate), rate, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Present Value ");
        double PV = sc.nextDouble();

        System.out.println("Enter Rate ");
        double r = sc.nextDouble();
        double rateInPercentage = r/100;    //rate converted into percentage

        System.out.println("Enter Time in years ");
        double t = sc.nextDouble();
        
        double FV = futureValue(PV, rateInPercentage, t);
        System.out.println("The Future Value for Present Value " + PV + " with a Rate of " + r + " and time " + t
                + " years will be " + FV);
        sc.close();
    }
}