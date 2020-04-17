
public class solution {
  //  private static String(String input,startIndex){
    //    if(startIndex>=input.length)
     //       return 
    //}//

	// Return the changed string
	public static String removeX(String input){
        if(input.length()==0)
            return "";
        String ans="";
        if(input.charAt(0)!='x'){
            ans=ans +input.charAt(0);
        }
            
        String myans=removeX(input.substring(1));
            return ans+myans;
		// Write your code here

	}
}
