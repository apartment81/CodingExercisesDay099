package ro.mirodone;


public class GapInPrimes {

    private boolean isPrime( int number){

        if(number == 2) return true;
        if(number %2 !=0) {
            // check only to the half of number
            for (int i =2; i<= number/2; i++){
                if(number % i ==0) {
                    return false;
                }
            }return true;
        }
        return false;
    }

    public long[] gap ( int g, long m, long n){
        long lastPrim = 0;
        long [] result =new long[2];

        //when gap found, return the result, no need to check all value to >n
        for (int i = (int) m; i <n ; i++){
            if(isPrime(i)) {
                if(lastPrim == 0){
                    lastPrim =i;
                }else if (i -lastPrim == g){
                    result[0]=lastPrim;
                    result[1]=i;
                    return result;
                }else {
                    lastPrim =i;
                }
            }
        }return null;
    }

}
