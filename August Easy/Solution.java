import java.util.*;

class TestClass 
{
    public static void main(String args[] ) throws Exception {
        int max=0,temp=0,temp1;
        int i;
        long mod=1000000007,product=1;
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        ArrayList<Long> list=new <Long>ArrayList();
        list.add((long)2);
        while(N-->0)
        {
            int t=s.nextInt();
            temp=t;
            if(t>max)
            {
                temp1=max;
                for(i=temp1+1;i<t+1;i++)
                {
                     product*=list.get(i-1);
                     product=product%mod;
                     list.add(product+1);
                }
                max=temp;
            }
            for(i=0;i<temp;i++)
            System.out.print(list.get(i)+" ");
            System.out.println();
              
        }        
    }
}
