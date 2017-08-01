/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.ArrayList;
import java.util.*;


class TestClass 
{
    public static void main(String args[] ) throws Exception {
        long max=0,ekaurvar=0,dusravar;
        int i;
        long mod=1000000007,product=1;
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        ArrayList<Long> list=new <Long>ArrayList();
        list.add((long)2);
        while(N-->0)
        {
            int t=s.nextInt();
            ekaurvar=t;
            if(t>max)
              {
               
                
                dusravar=max;
              for(i=(int)dusravar+1;i<t+1;i++)
              {
                  product*=list.get(i-1);
                  product=product%mod;
                  list.add(product+1);
              }
              
              max=ekaurvar;
              }
              for(i=0;i<(int)ekaurvar;i++)
              System.out.print(list.get(i)+" ");
              System.out.println();
              
            }
            
        }

    }


