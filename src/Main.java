import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc1 = new Scanner(System.in);
            System.out.printf("Hallo Intelij  Hier ist Rike.");



            int a = sc1.nextInt();
            int b;

            for (b = 0; b<=a; b++) {
                System.out.printf("%d\n",b);

            if (b % 5 ==0 && b % 7 !=0)
                System.out.println("Fitz");
            }
            sc1.close();

        }
}
