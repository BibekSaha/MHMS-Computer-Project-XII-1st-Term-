import java.util.Scanner; // Scanner class is imported
class Keith_Number // Class is declared
{
    public static void main() // void main function starts
    {
        Scanner sc = new Scanner(System.in) ; // Scanner object insialised
        System.out.println ("Enter the number:-") ;
        int n = sc.nextInt() ; // The number is taken as user input
        int kopy = n , sumOfDigits = 0 ; // VAriables dcelared
        int length = Integer.valueOf(n).toString().length() ; // The length of the number is found out
        if ( length == 1 ) // If the number is of single digit then it is not a keith number
        {
            System.out.println () ;
            System.out.println ( n + " is not a keith number." ) ;
            System.exit(0);
        }
        int[] digits = new int[length] ; // Array to keep the digits
        for ( int i = length - 1 ; i >= 0 ; i-- )
        {
            digits[i] = kopy % 10 ; // Digits are kept in array
            kopy = kopy / 10 ;
        }
        while ( sumOfDigits != n )
        {
            if ( sumOfDigits > n ) // break point
            {
                break ;
            }
            sumOfDigits = 0 ; 
            for ( int i = 0 ; i < length ; i++ )
            {
                sumOfDigits = sumOfDigits + digits[i] ; // Calculation of Keith number is performed
            }
            for ( int j = 0 ; j < length - 1 ; j++ )
            {
                digits[j] = digits[j+1] ; // Value shifts
            }
            digits[length-1] = sumOfDigits ; // Value shifts
        }
        System.out.println () ;
        if ( sumOfDigits == n ) // Checking is done
        {
            System.out.println ( n + " is a Keith number." ) ; // Printing is done
        }
        else
        {
            System.out.println ( n + " is not a keith number." ) ;
        }
    }
}