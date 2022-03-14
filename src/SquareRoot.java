public class SquareRoot {
    static long findSquareRootOfReal(long x){
        long start = 0L;
        long end = x+1;
        while(start <= end){
            long mid = (start + end) / (long)2;
            if(Math.abs((mid * mid) - x) < 0.01){
                return mid;
            } else if((mid * mid) < x){
                start+= 0.001;
            }else {
                end-= 0.001;
            }
        }
        return 0L;
    }
}
