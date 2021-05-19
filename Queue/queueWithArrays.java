package Queue;

public class queueWithArrays {
    static class queue {
        int cap, front, rear, size;
        int[] a;

        queue(int n) {
            cap = n;
            front = 0;
            rear = cap-1;
            size = 0;
            a = new int[cap];
        }

        void add(int x) {
            rear = (rear+1) % cap;
            a[rear] = x;
            size++;
        }

        int remove() {
            int z = a[front];
            front = (front+1) % cap;
            size--;
            return z;
        }

        void display() {
            for (int i = front; i < front+size; i++) {
                System.out.print(a[i % cap]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queue q = new queue(10);
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        q.remove();
        q.display();
    }
}
