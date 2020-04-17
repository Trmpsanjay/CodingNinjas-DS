
public class solution {

	public static int convertStringToInt(String input){
        if(input.length()==0)
            return 0;
        double ans=0;
        if(input.length()==1)
            return (input.charAt(0) -'0');
        ans=convertStringToInt(input.substring(1));
        double  x=(input.charAt(0) - '0');
        ans=ans+x*Math.pow(10,input.length()-1);
        //ans=convertStringToInt(input.substring(1));
        return (int)ans;
        
        
        
		// Write your code here

	}
}
