public class InsertionSort implements SortingAlgorithm {
    @java.lang.Override
    public void sort(int[] a) {
        for(int i = 1; i < a.length; i++)
        {
            int temp = a[i];
            int j = i - 1;

            while(j >= 0 && temp < a[j]) //if a value is greater than the temp, move the value right after the temp
            {
                a[j+1] = a[j];
                --j;
            }
            a[j+1] = temp;
        }
    }
}
