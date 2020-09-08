public class ArrayMerger {
    void getIndexes (int[]a, int[] b, int n, int m){
        int j = 0;
        for (int i = 0; i < m; ++i){
            if (j < n){
                while (b[i] >= a[j] && j < n - 1){
                    ++j;
                }
                if (j == n - 1 && b[i] >= a[j]){
                    ++j;
                }
            }
            System.out.println("b[" + i + "] - " + j);
        }
    }
}
