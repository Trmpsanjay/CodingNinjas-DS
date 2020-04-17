public class solution {

	// Return the changed string
	public static String replace(String input){
        if(input.length()==0)
            return "";
        if(input.length()==1)
            return input;
        String ans="";
        if(input.charAt(0)=='p' && input.charAt(1)=='i')
            ans=ans + "3.14";
        if(input.charAt(0)!='p' || input.charAt(1)!='i')
            ans = ans + input.charAt(0);
        String myans="";
        if(input.charAt(0)=='p' && input.charAt(1)=='i'){
            myans= replace(input.substring(2));
            return ans +myans;
        }
        myans = replace(input.substring(1));
        return ans +myans;
        
		// Write your code here

	}
}
