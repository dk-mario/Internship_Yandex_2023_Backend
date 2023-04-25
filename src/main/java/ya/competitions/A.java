package ya.competitions;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author Dmitry Kartsev
 */
class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] alphabet = new int[N];
        for (int i = 0; i < N; i++) {
            alphabet[i] = sc.nextInt();
        }
        int[] rows = new int[N];
        for (int i = 0; i < N; i++) {
            rows[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        int[] string = new int[K];
        for (int i = 0; i < K; i++) {
            string[i] = sc.nextInt();
        }

        Map<Integer, Integer> mapper = new HashMap<>();
        for (int i = 0; i < N; i++) {
            mapper.put(alphabet[i], rows[i]);
        }

        int counter = 0;
        for (int i = 0; i < string.length - 1; i++) {
            if (!Objects.equals(mapper.get(string[i]), mapper.get(string[i + 1]))) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}