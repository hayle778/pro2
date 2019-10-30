import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Arrayprog2 {
    public static void main(String[] args) {

        int[] num1 = {1, 2, 3, 4, 5, 6};
        int[] num2 = {7, 8, 9, 10, 11, 12};

        // pick the random index
        Random r = new Random();
        int w = r.nextInt(6);  // picks the index
        int x = r.nextInt(6);
        int y = r.nextInt(6);
        int z = r.nextInt(6);
//store it in third array
        int  [] num3 = {num1 [w], num1[x] , num2[y], num2[z]};

        //print array
        for(int a: num3) {

            System.out.println(a);


        }

    }
}


