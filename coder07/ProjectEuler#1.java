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
            long N = in.nextInt();
            long n=N-1;
            long n3=n/3;
            long s=n3*(3+(n3*3))/2;
            long n5=n/5;
            long s1=n5*(5+(n5*5))/2;
            long n15=n/15;
            long s2=n15*(15+(n15*15))/2;
            System.out.println(s+s1-s2);
        }
    }
}
