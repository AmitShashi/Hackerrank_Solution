import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        String s="";
        int a=1;
        while(scan.hasNext())
        {
            s=scan.nextLine();
            System.out.println(a+" "+s);
            a++;
        }  
    }
}
