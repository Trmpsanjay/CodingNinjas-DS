public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
        if(input[0]==x)
            return true;
        else{
            if(input.length<=1){
                if(input[0]==x)
                    return true;
                else
                    return false;
            }
        }
        int temp[]=new int[input.length-1];
        for(int i=1;i<input.length;i++)
            temp[i-1]=input[i];
        boolean ans=checkNumber(temp,x);
        if(!ans)
            return false;
        else
            return true;
       
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
	}
}