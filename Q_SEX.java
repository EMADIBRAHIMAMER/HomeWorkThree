import java.util.Scanner;

public class Q_SEX
{


        public static void main(String[] args)
        {
            double num1,num2,num3;
            Scanner input=new Scanner(System.in);

            System.out.println("Input 1st Number");
            num1=input.nextDouble();
            System.out.println("Input The 2nd number");
            num2=input.nextDouble();
            System.out.println("Input The 3rd number");
            num3=input.nextDouble();

            if (num1<num2&&num2<num3)
            {
                System.out.println("Increasing");
            }
            else if (num1>num2&&num2>num3)
            {
                System.out.println("Decreasing");
            }
            else
            {
                System.out.println("Neither");
            }
        }


}