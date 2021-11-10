import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int[] ar = new int[k];

        for (int i = 0; i < k; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> people = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            people.add(i + 1);
        }

        int ptr = 0;

        for (int i = 0; i < k; i++) {
            int times = ar[i];
            ptr = (ptr + times) % people.size();
            sb.append(people.get(ptr)).append(" ");
            people.remove(ptr);
            if (ptr == people.size() + 1) {
                ptr = 0;
            }
        }

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