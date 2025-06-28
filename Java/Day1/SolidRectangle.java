import java.util.*;

public class SolidRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");  
        int cols = sc.nextInt();
        sc.close();
        // Outer loops for rows
        for(int i=1; i<=rows; i++){
            // Inner loop for columns
            for(int j=1; j<=cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}