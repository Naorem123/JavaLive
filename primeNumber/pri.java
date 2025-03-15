public class pri {
        public static void main(String[] args) {
            int num = 29; 
            System.out.println(isPrime(num) ? num + " is prime." : num + " is not prime.");
        }
    
        public static boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }
