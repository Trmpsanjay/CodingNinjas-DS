
public class Solution {
    private static int firstIndex(int input[],int index, int x){
        if(index>=input.length-1)
            return -1;
        if(input[index]==x)
            return index;
        int ans=firstIndex(input,index+1,x);
        return ans;
    }

	public static int firstIndex(int input[], int x) {
        return firstIndex(input,0,x);
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
	}
	
}