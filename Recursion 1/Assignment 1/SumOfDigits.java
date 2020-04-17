
public class solution {
    static int sum=0;

	public static int sumOfDigits(int input){
        if(input==0)
            return 0;
       sum=sum+input%10;
       sumOfDigits(input/10);
           return sum;
		// Write your code here

	}
}
