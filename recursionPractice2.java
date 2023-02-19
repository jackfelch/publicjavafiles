public class recursionPractice2 {
    public static void main (String[] args){
        System.out.println("5!="+factorial(5));

    }

    private static long factorial(int n ){
        //step 1: two base cases
        if(n==0) return 1;
        if(n==1) return 1;
        long result;
        //step 3 recursive call
        result = factorial(n-1);
        System.out.println("the prior "+n+"! is " + result);
        //action after recursive call
        result = n*result;
        System.out.println("the final "+n+"! is " + result);
        return result;
    }
}
