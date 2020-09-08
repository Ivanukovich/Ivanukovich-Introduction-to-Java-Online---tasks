public class NumberQualities {
    boolean primeNumber (int i){
        boolean prime = true;
        if (i == 1){
            prime = false;
        }
        else {
            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    prime = false;
                }
            }
        }
        return prime;
    }
}
