public class Solution {

	public static int sum(int input[]) {
        if(input.length<=1)
            return input[0];
        int temp[]=new int[input.length-1];
        for(int i=1;i<input.length;i++)
            temp[i-1]=temp[i];
        int ans=sum(temp);
        return ans;
        
        
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
	}
}