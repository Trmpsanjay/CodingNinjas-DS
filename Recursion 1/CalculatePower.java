public class Solution {

	public static int power(int x, int n) {
        if( n==1)
            return x;
        else if(n==0)
            return 1;
        
        else
            return x *power(x,n-1);
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		
	}
}