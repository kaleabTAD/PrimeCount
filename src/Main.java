public class Main {
    public static void main(String[] args)

    {
        System.out.println(primeCount(-10,6));
    }

    public static int primeCount(int start, int end) {
        int primeCount = 0;

        for (int number = start; number <= end; number++) {
            if (number>1){
            boolean isPrime = true;
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeCount++;
            }
        }

    }
        return primeCount;
    }
}