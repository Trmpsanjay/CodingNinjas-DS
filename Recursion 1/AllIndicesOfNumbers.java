
public class Solution {
    private static int[] allIndexes(int input[], int x, int index){
        if(index>=input.length){
            int temp[]=new int[0];
            return temp;
        }
        int ans[]=allIndexes(input,x,index+1);
        if(input[index]==x){
            int tempans[]=new int[ans.length+1];
            tempans[0]=index;
            for(int i=0;i<ans.length;i++)
                tempans[i+1]=ans[i];
            return tempans;
        }
        else
        return ans;
    }

	public static int[] allIndexes(int input[], int x) {
        return allIndexes(input,x,0);
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
	}
	
}