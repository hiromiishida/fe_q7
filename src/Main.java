public class Main {
    public static void main(String[] args) {
        int[] A = new int[]{100, 0, 15, 22, 69, 985, 47};
        int i, j;
        int tmp1 = 1;
        int tmp2;

        for (i = 0; i <= A.length - 1 - 1; i++) {
            /* もっとも小さい値の要素番号を取得する */
            for (j = i + 1; j <= A.length - 1; j++) {
                if (A[j] < A[tmp1]) {
                    tmp1 = j;
                }
            }

            if (A[tmp1] < A[i]) {
                /* 値を入れ替える */
                tmp2 = A[tmp1];
                A[tmp1] = A[i];
                A[i] = tmp2;
            }
        }

        for (i = 0; i <= A.length - 1; i++) {
            System.out.println(A[i]);
        }
    }
}