import java.util.Scanner;

class IsItOdd {
     public static boolean isOdd(int number) {            
            return (number % 2 == 0);
        }

    public static void main(String[] args) {
        System.out.println("Please enter an integer.");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (isOdd(number) == false)
        {
            System.out.println("Wow that's ODD...");
        }
        else
        {
            System.out.println("Looks pretty EVEN to me!");
        }
    } 
}