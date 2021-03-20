import com.mchange.v1.util.ArrayUtils;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("原数组：{5,4,3,2,1}");
        int a[] = new int[]{5,4,3,2,1};
        int n = a.length;


        //冒泡排序:
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j+1])
                {
                    int buf = a[j];
                    a[j] = a[j+1];
                    a[j+1] = buf;
                }
            }
        }
        System.out.print("冒泡排序结果：");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();


        //插入排序：
        for (int i = 1; i < n; i++) {
            int num = a[i];
            int j;
            for (j = i - 1; j >= 0; j++) {
                if (num < a[j]){
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            if (num != a[i]){
                a[j + 1] = num;
            }
        }
        System.out.print("插入排序结果：");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();


        //快速排序
        quickSort(a,0,n - 1);
        System.out.print("快速排序结果：");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();


        //合并排序：
        merSort(a,0, n - 1);
        System.out.print("归并排序结果：");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();


        //堆排序：(没看懂网上的写法，等待答疑)
        System.out.println("网上堆排序不懂，等待答疑");
    }

    public static void quickSort(int a[],int left, int right) {
        int i = left, j = right;
        if (i > j) {
            return;
        }
        int temp = a[i];
        while (i != j) {
            while (a[j] > temp && i < j) {
                j--;
            }
            while (a[i] < temp && i < j) {
                i++;
            }
            if (i < j){
                int temp1 = a[i];
                a[i] = a[j];
                a[j] = temp1;
            }
        }
        a[i] = a[left];
        a[left] = temp;
        quickSort(a,left,i - 1);
        quickSort(a,i + 1, right);
    }



    public static void merSort(int[] arr,int left,int right){

        if(left<right){
            int mid = (left+right)/2;
            merSort(arr,left,mid);
            merSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while(i<=mid&&j<=right){
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=right){
            temp[k++] = arr[j++];
        }
        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[k2 + left] = temp[k2];
        }
    }
}
