class MathOperations {
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        return max;
    }
    public static int calculateSquare(int d) {
        return d*d;
    }
    public  static boolean isPrime(int num){
        int sum = 0;
        for(int i = 1 ; i<=num; i++){
            if ( num % i == 0){
                sum = sum + 1;
            }
        }
        if (sum == 2 ){
        return true;
        }
        return false;
    }
}
public class Laaab {
    public static void main(String[] args) {

        System.out.println("Maximum of 10, 25 , 15 : " + MathOperations.findMax(10, 25, 15));
        System.out.println("Square of 7: " + MathOperations.calculateSquare(7));
        System.out.println("Is 17 Prime? " + MathOperations.isPrime(17));
        System.out.println("Is 20 Prime? " + MathOperations.isPrime(20));
    }
}