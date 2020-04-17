
public class Solution {
    static int position=-1;
    private static void lastIndex(int input[] , int x, int index){
        if(index>input.length-1)
            return ;
        if(input[index]==x)
            position=index;
      lastIndex(input,x,index+1);
        
    }
    public static int lastIndex(int input[], int x ){
        lastIndex(input,x,0);
        return position;
        

	
		
	}
	
}