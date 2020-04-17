
public class solution {
    static int count=0;
	public static int multiplyTwoIntegers(int m, int n){
       if(count>=m)
           return 0;
        count++;
        int myans=n+multiplyTwoIntegers(m,n);
        return myans;
		// Write your code here
	
	}
}
