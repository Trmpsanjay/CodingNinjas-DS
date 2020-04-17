
public class solution {

	// Return the updated string
	public static String addStars(String s) {
        if(s.length()==0)
            return "";
        String ans="";
        if(s.length()==1)
            return s;
        if(s.charAt(0)==s.charAt(1))
            ans=s.charAt(0) +"*";
        if(s.charAt(0)!=s.charAt(1))
            ans=ans+ s.charAt(0);
        String myans=addStars(s.substring(1));
        return ans+myans;
		// Write your code here

	}
}
