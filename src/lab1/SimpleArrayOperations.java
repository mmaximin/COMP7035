package lab1;

import java.util.Random;

public class SimpleArrayOperations {
    private int A[];

    public SimpleArrayOperations(int n, int min, int max)
    {
        A = new Random(42).ints(n, min, max).toArray();
    }

    public void print()
    {
        for (int i=0; i<A.length; i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public int get(int i)
    {
        // Task 5.A
        return A[i];
    }

    public int find(int v)
    {
        // Task 5.B
        int i;
        for (i = 0; i < A.length; i++){
            if (A[i] == v) break;
        }
        return i;
    }

    public void swap(int i, int j)
    {
        // Task 5.C
        int aux;
        aux = A[i];
        A[i] = A[j];
        A[j] = aux;
    }

    public static void main(String[] args) {
        SimpleArrayOperations A = new SimpleArrayOperations(10, 0, 100);
        A.print();
        int v = A.get(6);
        System.out.println("A[6] = " + v);
        int i=A.find(v);
        System.out.println("A[" + i + "] = " + v);
        A.swap(3, 4);
        A.print();
    }
}
