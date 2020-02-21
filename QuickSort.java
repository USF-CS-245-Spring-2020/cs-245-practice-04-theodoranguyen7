public class QuickSort implements SortingAlgorithm{
    @java.lang.Override
    public void sort(int[] a) {
            QuickSort(a, 0, (a.length - 1));
    }

    public void QuickSort(int[] a,int start, int end) {
        if (start < end) {
            int pIndex = partition(a, start, end);
            QuickSort(a, start, pIndex - 1);
            QuickSort(a, pIndex + 1, end);

        }
    }

    private int partition(int[] a, int start, int end)
    {
        int pivot = a[end]; //sets the pivot
        int pIndex = start - 1;
        for (int i = start; i < end; i++)
        {
            if(a[i] < pivot)  //if value is less than the pivot, increment index and swap
            {
                pIndex++;
                swap(a, i, pIndex);
            }
        }
        swap(a, pIndex + 1,end);
        return pIndex + 1;


    }

    private void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
