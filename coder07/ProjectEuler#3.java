import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    

    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            long n = in.nextLong();
            long pf=0,root,root2,loop,q,f;
            root=(long)Math.sqrt(n);
            for(long i=1;i<=n/2;i++)
            {
                f=0;
                if(n%i==0)
                {  
                    q=n/i;
                    root2 = (long)Math.sqrt(q);
                    for(loop=2; loop<=root2;loop++)
                    {
                        if(q%loop==0)
                            f=1;
                    }
                    if(f==0)
                    {
                        System.out.println(q);
                        break;
                    }
                }
                
            }
            
              
      }     
  }
}