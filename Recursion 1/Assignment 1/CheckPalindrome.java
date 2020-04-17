
public class solution {
    
    public static boolean isStringPalindrome(String input, int start,int last){
        if(start==last)
            return true;
        if(start==last-1){
            if(input.charAt(start)!=input.charAt(last))
            return false;
            else
                return true;
            
        }
        if(input.charAt(start)!=input.charAt(last))
            return false;
        else{
            boolean myans=isStringPalindrome(input,start+1,last-1);
            return myans;
        }
            
      
    }

	public static boolean isStringPalindrome(String input) {
        return isStringPalindrome(input,0,input.length()-1);
		// Write your code here

	}
}
