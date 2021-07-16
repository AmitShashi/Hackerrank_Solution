import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b)
     {
        // Complete the function //
        boolean flag=true;
        if(a.length()!=b.length())
        {
            flag = false;
        }
        else
        {
            a=a.toLowerCase();
            b=b.toLowerCase();
            int[] arr = new int[256];
            for(char c : a.toCharArray())
            {
                arr[c]++;
            }
            for(char c : b.toCharArray())
            {
                arr[c]--;
            }
            for(int i : arr)
            {
                if(i!=0)
                {
                    flag=false;
                    break;
                }
            }
        } 
            return flag;
    }


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}