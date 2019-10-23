import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long a=1,b=2,c,sum=2;
            while(true)
            {
                c=a+b;
                a=b;
                b=c;
                if(c>=n)
                    break;
                if(c%2==0)
                    sum+=c;
            }
            System.out.println(sum);
            
        }
    }
}