package LoveBabar_450_DSA.Matrix;

import java.util.PriorityQueue;

public class _9_Kth_Smallest_Element {
    public static int kthSmallest(int[][] arr, int n, int k)
    {
        // code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pq.add(arr[i][j]);
            }
        }

        int c = 0;
        while (!pq.isEmpty()) {
            int temp = pq.poll();
            c++;

            if (c == k)
                return temp;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 25, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int res = kthSmallest(mat, 4, 7);

        System.out.print("7th smallest element is " + res);
    }
}

/*

public static int kthSmallest(int[][] matrix, int k)
  {

    // n = size of matrix
    int i, j, n = matrix.length;

    // using built-in priority queue which acts as max
    // Heap i.e. largest element will be on top
    // Kth smallest element can also be seen as largest
    // element in a priority queue of size k By this
    // logic we pop elements from priority queue when
    // its size becomes greater than k thus top of
    // priority queue is kth smallest element in matrix

    PriorityQueue<Integer> maxH = new PriorityQueue<>(
      Collections.reverseOrder());
    if (k == 1)
      return matrix[0][0];

    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        maxH.add(matrix[i][j]);
        if (maxH.size() > k)
          maxH.poll();
      }
    }

    return maxH.peek();
  }
 */

/*

public static void main (String[] args) {

    int mat[][] = { { 10, 20, 30, 40 },
                    { 15, 25, 35, 45 },
                    { 25, 29, 37, 48 },
                    { 32, 33, 39, 50 } };
      int res = kthSmallest(mat, 4, 7);

    System.out.print("7th smallest element is "+ res);
    }

   static int kthSmallest(int[][]mat,int n,int k)
    {

       int[] a=new int[n*n];
       int v=0;

       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               a[v]=mat[i][j];
               v++;
           }
       }

        Arrays.sort(a);
        int result=a[k-1];
        return result;
    }

 */
