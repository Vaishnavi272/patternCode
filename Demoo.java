import java.util.Scanner;

public class Demoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       for (int i = 1; i <= n; i++) {
          if (i % 3 == 0 && i % 5 != 0) {
            System.out.println("Ms.");
            }
           if(i%5==0 && i%3!=0)
           {
                System.out.println("Dhoni");
            }
           if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("Ms.Dhoni");
            }
            if(i% 3!=0 && i% 5!=0)
            {
               System.out.println(i);
            }
      }

    }
}
