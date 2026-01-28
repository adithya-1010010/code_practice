import java.util.Scanner;

public class pattern3 {
    public static void main(){

        //taking input from the user
        int len;
        int coln;
        int row;

         Scanner input =new Scanner(System.in);
         System.out.print("enter max star num:");
         len=input.nextInt();


         //loop for row
        for(row=1;row<len*2;row++){
            if (row<=len)
                coln=row;

            else
                coln=len-(row-len);

            for(int inner=1;inner<=coln;inner++){
                System.out.print("* ");
            }
            System.out.println();



        }







    }
}
