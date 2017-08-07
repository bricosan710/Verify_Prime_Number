import java.util.Scanner;
public class Primo1
{
    public static void main(String[] args )
    {
         Scanner scanner = new Scanner(System.in);
         int num = scanner.nextInt();
         int num2 = num-1;
         while((num%num2) != 0) {
             num2--;
            }
            if(num2 == 1) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
}
}
    