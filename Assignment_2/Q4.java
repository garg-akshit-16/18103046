public class q4
{
    public static void main(String args[])
    {
        int sum=1;
        int n=1,sqr=1;
		
        while(sqr>0)
        {

            if(sqr==sum)
            {
                System.out.println(n);
            }
	
	        n++;		
            sum=sum+n;
            sqr=n*n;
        }
    }
}
