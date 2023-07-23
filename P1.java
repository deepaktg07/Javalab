import java.util.Scanner;

public class Msum {
	 public static void main(String args[])
	   {
	       int i, j;
	       int mat1[][] = new int[3][3];
	       int mat2[][] = new int[3][3];
	       int mat3[][] = new int[3][3];
	       Scanner sc = new Scanner(System.in);
		   
	       System.out.println("Enter Matrix 1 Elements : ");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               mat1[i][j] = sc.nextInt();
	           }
	       }
		   
	       System.out.println("Enter Matrix 2 Elements : ");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               mat2[i][j] = sc.nextInt();
	           }
	       }
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               mat3[i][j] = mat1[i][j] + mat2[i][j];
	           }
	       }
		   
	       System.out.println("Sum of matrices:");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               System.out.print(mat3[i][j]+ " ");
	           }
	           System.out.println();
	       }
	   }
}
