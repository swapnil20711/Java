/*      1
        12
        123
        1234
        12345
 To print the pattern like this
 */
package src.com.swapnil;

import java.util.Scanner;

public class StarPattern1 {
    public static void main(String[]args)
    {
        int r;
        System.out.println("Enter the number of rows:");
        Scanner star= new Scanner(System.in);
        r = star.nextInt();
        StarPattern(r);
        star.close();
    }
    public static void StarPattern(int rows)
    {   int i,j;
        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}