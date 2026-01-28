import java.util.Scanner;

public class pattern5 {
    static void main(String[] args) {


        //declaration of variables
        int row;
        int len;
        int innerF;
        int innerL;
        int space;

        //user input
        Scanner input = new Scanner(System.in);
        System.out.print("enter max star num:");
        len = input.nextInt();



        //loop for row
        for(row=1;row<=len;row++){
            //for space
            for(space=1;space<=(len-row);space++)
                System.out.print("  ");


            //for firstHalf
            for(innerF=row;innerF>=1;innerF--)
                System.out.print(innerF + " ");


            //for lastHalf
            for(innerL=2;innerL<=row;innerL++)
                System.out.print(innerL + " ");


            System.out.println();


        }

    }
}
