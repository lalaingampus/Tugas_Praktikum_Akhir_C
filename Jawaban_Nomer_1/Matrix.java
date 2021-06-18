public class Matrix {

   
    public static void main(String[] args) {
    int i, j;
    int A[][] = {{1,2,3}, {4,5,0}, {7,9,7}};
    int B[][] = {{2,5,1},{4,1,2},{8,3,2}};
    int C[][] = new int[3][3];
    
    System.out.println("Matrix A");
    for(i=0;i<3;i++) 
    {
        System.out.print("|");
        for(j=0;j<3;j++) {
            System.out.print(" " + A[i][j]);
        }
        System.out.print("|");
        System.out.println();
    }
    System.out.println();
    System.out.println("Matrix B");
    for(i=0;i<3;i++) 
    {
        System.out.print("|");
        for(j=0;j<3;j++)
        {
            System.out.print(" " + B[i][j]);
        }
        System.out.print("|");
        System.out.println();    
    }
    System.out.println();
    System.out.println("Hasil penjumlahan matrix A dan B");
    for(i=0;i<3;i++)
    {
        System.out.print("|");
        for(j=0;j<3;j++)
        {
            C[i][j] = A[i][j] + B[i][j];
            System.out.print(" " + C[i][j]);
        }
        System.out.print("|");
        System.out.println();
    }
    System.out.println();
    System.out.println("Diagonal 1 & Diagonal 2 menjadi Bintang(*)");
    for(i = 0; i < 3; i++)
    {
     System.out.print("|");
     for(j = 0; j < 3; j++)
     {
      if(i == j || (i + j + 1) == 3)
      {
	if(C[i][j] != 0) {
		System.out.print(" *");
	}
	else {
       		System.out.print(" " + C[i][j]);
	}
      }
      else {
       C[i][j] = A[i][j] + B[i][j];
       System.out.print(" " + C[i][j]);
      }
     }
     System.out.print("|");
     System.out.println();
    }
    }
    
}
