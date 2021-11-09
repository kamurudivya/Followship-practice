package org;

public class Commandline4 {
    public static void main (String as[])
    {
        int n, cnt=0, sum=0;
        for(int i=0;i<as.length;i++)
        {
            try
            {
                n=Integer.parseInt(as[i]);
                sum= sum+n;
            }
            catch (NumberFormatException e)
            {
                cnt++;
            }
        }
        System.out.println("Sum of only valid integers is= "+sum) ;
        System.out.println("Invalid integers are: "+cnt) ;
    }
}
