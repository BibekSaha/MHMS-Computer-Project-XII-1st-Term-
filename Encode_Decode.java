/*
 * Encoded Text:- 10665771011153266797868
 * Decoded Text:- James Bond
 * 
 * Encoded Text:- 78487367421013232321156589
 * Decoded Text:- Nice Say
 */
import java.util.Scanner;
class Encode_Decode // Class declared
{
    public static void main () // Void main starts
    {
        Scanner sc = new Scanner (System.in) ; // Scanner Class intialized
        System.out.println ("Enter the encoded text:-") ; 
        String encodedText = sc.nextLine() ; // The encoded text is intialized
        int p = 0 , q = 2 , space = 0 ; // Variables declared
        String finalString = "" , s = "" , strS = "" , restLetter = "" , totalString = ""  ; // Variables declared
        int ch = 0 ; // Variables declared
        char charCh = '\u0000' , firstLetter = '\u0000' ; // Variables declared
        for ( int i = 0 ; i < encodedText.length() ; i++ )
        {
            if ( q > encodedText.length()) // If q (end point) exceeds the length od the text then the loop breaks
            {
                break ;
            }
            ch = Integer.parseInt(encodedText.substring(p,q)) ; // The first two character are extracted out from the string
            if ( (ch >= 10) && (ch <=12) ) // If ch is 10 or 11 or 12 and ch is not at last then 3 characters are picked up
            {
                if ( (q == encodedText.length() ) && ( (ch == 10) || (ch == 11) || (ch == 12) ) )
                {
                    break ;
                }
                s = encodedText.substring(p,q+1) ;
                finalString = finalString + Character.toString((char)(Integer.parseInt(s))) ;
                p = p + 3 ; // Front pointer Increased
                q = q + 3 ; // End pointer Increased
                space = 0 ; // To avoid continous 32 spaces
            }
            else if ( (ch == 32) && (space == 0) ) // Space checking
            {
                finalString = finalString + " " ;
                if ( (ch == 32) && (Integer.parseInt(encodedText.substring(p+2,q+2))) == 32 )
                {
                    space++ ;
                }
                p = p + 2 ;
                q = q + 2 ;
            }
            else if ( ((ch>=65)&&(ch<=90)) || ((ch>= 97) && (ch <=99)) ) // form A - z and a - b
            {
                s = encodedText.substring(p,q) ;
                finalString = finalString + Character.toString((char)(Integer.parseInt(s))) ;
                p = p + 2 ;
                q = q + 2 ;
                space = 0 ;
            }
            else
            {
                p = p + 2 ; // Front pointer increased
                q = q + 2 ; // End pointer increased
            }
        }
        finalString = finalString + " " ;
        System.out.println () ;
        System.out.println ("The decoded text is:-") ; 
        for ( int i = 0 ; i < finalString.length() ; i++ ) // The decoded string is arranged with the first letter of each word in capital and the rest in small letter
        {
            charCh = finalString.charAt(i) ;
            if (charCh != ' ')
            {
                strS = strS + charCh ;
            }
            else
            {
                firstLetter = Character.toUpperCase(strS.charAt(0)) ;
                restLetter = (strS.substring(1)).toLowerCase() ;
                totalString = firstLetter + restLetter ;
                System.out.print (totalString + " ") ;
                strS = "" ;
                totalString = "" ;
            }
        }
    }
}