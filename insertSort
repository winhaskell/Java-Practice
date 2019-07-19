https://www.geeksforgeeks.org/insertion-sort/
https://blog.csdn.net/jianyuerensheng/article/details/51254415


public class InsertSort {
    public static void insertSort(int[] a) {
    int i,j,k;
    for(i=1;i<a.length;i++)
    {
     k = a[i];
     j = i-1;
     while(j>=0 && k<a[j])
     {
      a[j+1] = a[j];
      j--;
     }
     a[j+1] = k;
    }
 }

    public static void main(String[] args) {
        int a[] = {2,3,5,7,8,9,1,4,6,0,-1};
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }
} 
