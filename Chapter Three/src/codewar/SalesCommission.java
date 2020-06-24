package codewar;

public class SalesCommission
{
    public static void main (String args [])
    {
        // intializer list specifies the integers amount
        double salary [] = { 0, 200, 300, 400, 500, 500, 700, 800, 900, 1000, 1100, 1200};
        int value []= new int [11];
        System.out.printf( "%s:%20s:\n", "Index", " Value"); // column heading
       
        for (int index = 0; index < (salary.length); index++)
        {
        	int x = (int)Math.floor(((salary[index] * (.9) + 200) * .01));
           if (10 <= x) {
               ++value[10];
        	//System.out.println(x);
           }   
            else {
               ++value[(int)Math.floor(((salary [index]* (.09)+200)))];
            }}
           
        for (int index1 =2; index1<value.length-1; index1++)
           System.out.printf("$%5d-%5d: %10d\n",
           index1 *100,index1 * 100 + 99, value[index1]);     
       

        // output each salary element's value.
        for (int index2 =11; index2<= value.length; index2++ )
             System.out.printf( "$%5d%5s: 20d\n", index2*100-100, "& more", value[10]);

    } // end main
} // end class Salary