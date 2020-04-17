
public class solution {
    static double a=1;
   // static int count=0;

	//public static double findGeometricSum(int k ,int count){
       // if(k==0)
        //  return 1;
       //if(k<0){
        	//double l=a*2;
        //	return 1/l + findGeometricSum(k-1,count+1);
        //}
       //else return 0;
		 //Write your code here
    public static double findGeometricSum(int k){
        if(k==0)
            return 1;
    	a=a*2;
        double myans= 1/a + findGeometricSum(k-1);
        return myans;
    }
}
