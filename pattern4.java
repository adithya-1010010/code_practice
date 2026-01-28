import java.util.Scanner;

public class pattern4 {
    static void main(String[] args) {

        //declaring variables
        int len;
        int coln;
        int row;
        int innerS;
        int spaceBefore;
        int innerC;


        Scanner input = new Scanner(System.in);
        System.out.print("enter max star num:");
        len = input.nextInt();

        //loop for row
        for (row = 1; row < len * 2; row++) {


            //calculating the no of space and star in each row
            if (row <= len) {
                coln = row;
                spaceBefore = len - coln;
            } else {
                coln = 2 * len - row;
                spaceBefore = len - coln;
            }

            //loop for space print
            for (innerS = 1; innerS <= spaceBefore; innerS++)
                System.out.print(" ");

            //loop for star
            for (innerC = 1; innerC <= coln; innerC++)
                System.out.print("* ");

            System.out.println();


        }
    }
}
