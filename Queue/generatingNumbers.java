package Queue;

import java.util.*;

public class generatingNumbers {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("5");
        q.add("6");
        int n = 20;
        int count = 0;
        while (count <= n) {
            String x = q.remove();
            q.add(x+"5");
            q.add(x+"6");
            System.out.print(x+" ");
            count++;
        }
    }
}
