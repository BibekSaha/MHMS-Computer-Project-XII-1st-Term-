import java.util.Scanner; // Scanner class imported
class Matrix // Class is declared
{
    public static void main() // Void main function starts
    {
        Scanner sc = new Scanner (System.in) ; // Scanner class intialized
        System.out.println ("Enter the size of the square matrix:-") ;
        int m = sc.nextInt() ; // The size of the square matric is taken as input
        if ( (m < 2) && (m > 10) ) // If the size of the matrix is less than 2 or greater the 10 then it is not acceptable
        {
            System.out.println ("Sorry! You have to enter the size of the matrix a number between 2 and 10") ;
            System.exit(0) ;
        }
        else
        {
            int[][] arr = new int [m][m] ; // Main matrix
            int[][] arr_2 = new int [m][m] ; // Container Matrix
            int p = 0 , q = 0 , fourCornerAddition = 0 ; // Variables declared
            System.out.println ("Enter the matrix (Rowwise):-") ;
            for ( int i = 0 ; i < m ; i++ )
            {
                for ( int j = 0 ; j < m ; j++ )
                {
                    arr[i][j] = sc.nextInt() ; // Matrix entered
                }
            }
            System.out.println () ;
            System.out.println ("Entered matrix:-") ;
            for ( int i = 0 ; i < m ; i++ )
            {
                for ( int j = 0 ; j < m ; j++ )
                {
                    System.out.print (arr[i][j] + " ") ; // Entered Matrix is printed out
                }
                System.out.println () ;
            }
            for ( int i = m - 1 ; i >= 0 ; i-- )
            {
                for ( int j = 0 ; j < m ; j++ )
                {
                    arr_2[p][q] = arr[i][j] ; // To rotate the matrix in 90 degree direction
                    p++ ;
                }
                q++ ;
                p = 0 ;
            }
            System.out.println () ;
            System.out.println ("Matrix rotated 90 degree in clockwise directtion:-") ;
            for ( int i = 0 ; i < m ; i++ )
            {
                for ( int j = 0 ; j < m ; j++ )
                {
                    System.out.print (arr_2[i][j] + " ") ; // To print rotated the matrix in 90 degree direction
                }
                System.out.println () ;
            }
            System.out.println () ;
            System.out.println ("Addition of 4 corners:-") ;
            fourCornerAddition = arr_2[0][0] + arr_2[0][m-1] + arr_2[m-1][0] + arr_2[m-1][m-1] ; // The four corners are added
            System.out.println (fourCornerAddition) ;
        }
    }
}