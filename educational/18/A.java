import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        ArrayList<Long> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(Long.parseLong(st.nextToken()));
        }

        Collections.sort(ar);

        long minNum = Long.MAX_VALUE;
        long minCount = 0;
        for (int i = 1; i < n; i++) {
            if (Math.abs(ar.get(i) - ar.get(i - 1)) < minNum) {
                minNum = Math.abs(ar.get(i) - ar.get(i - 1));
                minCount = 1L;
            } else if (Math.abs(ar.get(i) - ar.get(i - 1)) == minNum) {
                minCount++;
            }
        }
        sb.append(minNum + " " + minCount);
        System.out.println(sb);
    }

    public static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}