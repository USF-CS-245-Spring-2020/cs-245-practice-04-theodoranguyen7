public class MergeSort implements SortingAlgorithm {
    @java.lang.Override
    public void sort(int[] a) {
            //return(); //add the parameters later
        MergeSort(a, 0, a.length - 1);
    }

    public void MergeSort(int[] a, int left, int right){
        if(left < right)
        {
            int middle = (left + right) / 2; //gets the middle index of the array. Use this index to split array into two

            MergeSort(a, left, middle);
            MergeSort(a,middle + 1, right);

            merge(a, left, middle, right);
        }

    }

    private void merge(int[] a, int left, int middle, int right){
        int leftArray[] = new int[middle - left + 1]; //splits the main array from the first index until middle
        int rightArray[] = new int[right - middle]; //splits the main array from middle until end

        //appends numbers to temp array
        for(int i = 0; i <(middle - left + 1); ++i)
        {
            leftArray[i] = a[left + i];
        }
        //appends number to temp array
        for (int j = 0; j < (right - middle); ++j)
        {
            rightArray[j] = a[middle + 1 + j];
        }

        int i = 0;
        int j = 0;

        int k = left;
        while (i < (middle - left + 1) && j < (right - middle))
        {

            if (leftArray[i] <= rightArray[j])
            {
                a[k] = leftArray[i];
                i++;
            }

            else
            {
                a[k] = rightArray[j];
                j++;
            }
            k++;
        }

        //Copies array from the left array to the main array
        while (i < (middle - left + 1))
        {
            a[k] = leftArray[i];
            i++;
            k++;
        }

        //Copies array from the right array to the main array
        while (j < (right - middle))
        {
            a[k] = rightArray[j];
            j++;
            k++;
        }

    }

}
