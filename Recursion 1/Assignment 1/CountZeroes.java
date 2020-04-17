
public class solution {
    static int count=0 ;

    public static int countZerosRec(int input){
        if(input<10)
            if(input==0)
                return 1;
        	else
            	return 0;
        float rem=input%10;
        if(rem==0)
            count++;
        int myans= count + countZerosRec(input/10);
        return count;
        // Write your code here
    }
}
