import java.util.Scanner; // Scanner class imported
class Date // Class declared
{
    public static void main() // Void main function starts
    {
        Scanner sc = new Scanner (System.in) ; // Scanner class 
        System.out.println ( "Enter the date in digit format(DDMMYYYY):-" ) ;
        int date = sc.nextInt() ; // The date is taken as input
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31} ; // Month day array for reference
        String[] month_name = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"} ; // Month name for reference
        int year = date % 10000 ; // Year extraction 
        if ( year % 4 == 0 ) // Leap year checking
        {
            month[1] = 29 ;
        }
        int given_month = (date/10000) % 100 ; // Month extraction
        if ( given_month > 12 ) // Month validation
        {
            System.out.println ( "INVALID DATE" ) ;
            System.exit(0) ;
        }
        int month_day = month[given_month-1] ; // How many days in that month
        String month_name_current = month_name[given_month-1] ; // Name of the month
        int day = date / 1000000 ; // Day extraction
        int day_last = (date / 1000000) % 10 ;
        if ( day > month_day )
        {
            System.out.println ( "INVALID DATE" ) ;
            System.exit(0) ;
        }
        if (day_last == 1) // Printing
        {
            System.out.println ( day + "st " + month_name_current + " " + year ) ;
        }
        else if (day_last == 2) // Printing
        {
            System.out.println ( day + "nd " + month_name_current + " " + year ) ;
        }
        else if (day_last == 3) // Printing
        {
            System.out.println ( day + "rd " + month_name_current + " " + year ) ;
        }
        else
        {
            System.out.println ( day + "th " + month_name_current + " " + year ) ;
        }
    }
}
        