import java.util.Scanner; // Scanner class imported
class Paragraph // Class starts
{
    public static void main () // Void function starts
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.println ( "Enter the paragraph:-" ) ;
        String str = sc.nextLine() ; // The paragraph is taken as user input
        str = " " + str ; // Space is added to the string in front
        String[] strArr = new String [10] ; 
        int[] strLen = new int [10] ;
        int len = str.length() ;
        String s = "" , temp = "" ; // Variable declared
        char ch = '\u0000' , cch = '\u0000' ; // Variable declared
        int p = 0 , numberOfWords = 0 ; // Variable declared
        // Extracting the sentences along with the exclamation and with a space in front to strAdd
        for ( int i = 0 ; i < len ; i++ )
        {
            ch = str.charAt(i) ;
            if ( (ch != '.') && (ch != '!') && (ch!= '?') )
            {
                s = s + ch ;
            }
            else
            {
                strArr[p] = s + ch ;
                p++ ;
                s = "" ;
            }
        }
        // Extracting the number of words each sentences have and store it in strLen
        for ( int i = 0 ; i < p ; i++ )
        {
            for ( int j = 0 ; j < strArr[i].length() ; j++ )
            {
                cch = strArr[i].charAt(j) ;
                if ( cch == ' ' )
                {
                    numberOfWords = numberOfWords + 1 ;
                }
            }
            strLen[i] = numberOfWords ;
            numberOfWords = 0 ;
        }
        // Sort (Bubble Sort)
        for ( int i = 0 ; i < p - 1 ; i++ )
        {
            for ( int j = 0 ; j < p - 1 - i ; j++ )
            {
                if ( strLen[j] > strLen[j+1] )
                {
                    temp = strArr[j] ;
                    strArr[j] = strArr[j+1] ;
                    strArr[j+1] = temp ;
                }
            }
        }
        strArr[0] = strArr[0].replaceFirst(" " , "") ;
        System.out.println () ;
        System.out.println ( "The paragraph arraged according to the increasing order of words:-" ) ;
        //Printing
        for ( int i = 0 ; i < p ; i++ )
        {
            System.out.print ( strArr[i] ) ;
        }
    }
}