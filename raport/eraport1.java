
package raport;
import java.util.Scanner;

public class eraport1 {
        public void nama(){
        Scanner gua = new Scanner(System.in);
        System.out.println("YOUR SCORE");
        int a;
        System.out.print("MATH:");
        int nilai1 = gua.nextInt();
        if (nilai1 < 101 && nilai1 >= 95) {
            System.out.println("* * GRADE A * *");
        } else if (nilai1 <= 94 && nilai1 >= 90) {
            System.out.println("* *GRADE B * *");
        } else if (nilai1 <= 89 && nilai1 >= 85) {
            System.out.println("* * GRADE C * *");
        } else if (nilai1 <= 84 && nilai1 >= 80) {
            System.out.println("* * GRADE D * *");
        } else if (nilai1 <= 79 && nilai1 >= 0) {
            System.out.println("nilai apaan nih segini amat !");
        }
         System.out.println("===================================");
        System.out.print("PE :");
        int nilai2 = gua.nextInt();
         if (nilai2 < 101 && nilai2 >= 95) {
            System.out.println("* * GRADE A * *");
        } else if (nilai2 <= 94 && nilai2 >= 90) {
            System.out.println("* * GRADE B * *");
        } else if (nilai2 <= 89 && nilai2 >= 85) {
            System.out.println("* * GRADE C * *");
        } else if (nilai2 <= 84 && nilai2 >= 80) {
            System.out.println("* * GRADE D * *");
        } else if (nilai2 <= 79 && nilai2 >= 0) {
            System.out.println("AH ELAH GINI AMAT, Blajaryang bener dung !");
        }
        System.out.println("===================================");
        System.out.print("SOCIAL:");
        int nilai3 = gua.nextInt();
         if (nilai3 < 101 && nilai3 >= 95) {
            System.out.println("* * GRADE A * *");
        } else if (nilai3 <= 94 && nilai3 >= 90) {
            System.out.println("* * GRADE B * *");
        } else if (nilai3 <= 89 && nilai3 >= 85) {
            System.out.println("* * GRADE C * *");
        } else if (nilai3 <= 84 && nilai3 >= 80) {
            System.out.println("* * GRADE D * *");
        } else if (nilai3 <= 79 && nilai3 >= 0) {
            System.out.println("AH ELAH GINI AMAT, Blajar yang bener dung !");
        }
         System.out.println("===================================");
        System.out.print("ENGLISH :");
        int nilai4 = gua.nextInt();
        if (nilai4 < 101 && nilai4 >= 95) {
            System.out.println("* * GRADE A * *");
        } else if (nilai4 <= 94 && nilai4 >= 90) {
            System.out.println("* *GRADE B * *");
        } else if (nilai4 <= 89 && nilai4 >= 85) {
            System.out.println("* * GRADE C * *");
        } else if (nilai4 <= 84 && nilai4 >= 80) {
            System.out.println("* * GRADE D * *");
        } else if (nilai4 <= 79 && nilai4 >= 0) {
            System.out.println("Gila nilai apaan nih, gini amat");
        }
         System.out.println("===================================");
        System.out.print("BIOLOGY:");
        int nilai5 = gua.nextInt();
        if (nilai5 < 101 && nilai5 >= 95) {
            System.out.println("* * Nilai Anda A * *");
        } else if (nilai5 <= 94 && nilai5 >= 90) {
            System.out.println("* * Nilai Anda B * *");
        } else if (nilai5 <= 89 && nilai5 >= 85) {
            System.out.println("* * Nilai Anda C * *");
        } else if (nilai5 <= 84 && nilai5 >= 80) {
            System.out.println("* * Nilai Anda D * *");
        } else if (nilai5 <= 79 && nilai5 >= 0) {
            System.out.println("Blajar yang bener makannya");
        }
            }    
}
