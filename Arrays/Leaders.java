package Arrays;

public class Leaders {
    public static void main (String[] args){

        int a[] = {1,5,3,1,2,0};
        leader(a);

    }

    public static void leader(int a[]){

        int n = a.length;
        System.out.print(a[n-1]+" ");
        int current_leader = a[n-1];
        for(int i=n-2; i>=0; i--){
            if (a[i]>current_leader) {
                System.out.print(a[i] + " ");
                current_leader=a[i];
            }

        }

    }
}
