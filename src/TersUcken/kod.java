package TersUcken;

import java.util.Scanner;

public class kod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int star, x = 1, minus, tool;

        System.out.print("Basamak sayısını giriniz : ");
        star = sc.nextInt();

        minus = star + 1;
        tool = star;

        if (star < 0){

            System.out.println("Pozitif bir değer girmelisiniz lütfen yenileyip tekrar deneyin.");

        }

        for (int i = 0; i <= star;){

            for (int z = minus; z <= star; ) {

                System.out.print(" ");

                z++;

            }

            for (int c = 1; c <= (2 * tool - 1);){

                System.out.print("*");

                c++;

            }

            System.out.println();
            minus--;
            tool--;
            i++;

        }

    }
}
