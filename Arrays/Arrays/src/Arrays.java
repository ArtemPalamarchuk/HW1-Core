import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arrays {

    public static void main(String[] args) {

        //Task 1
        //Min element of array

              /*int[] array = { -7611, -6, 8, 0, -1, -2251 };
              int tmp = 0;
              for (int i = 0; i < array.length - 1; i++){
                  if (array[i] < array[i + 1]){
                      tmp = array[i];
                      array[i] = array[i + 1];
                      array[i + 1] = tmp;
                  }else{
                      continue;
                  }
              }
              tmp = array[array.length - 1];
        System.out.println("Min element of array: " + tmp);*/


        //Task 2
        //Max element of array
             /* int[] array = { -7611, -6, 8, 0, -1, -2251 };
              int tmp = 0;
              for (int i = 0; i < array.length - 1; i++){
                  if (array[i] > array[i + 1]){
                      tmp = array[i];
                      array[i] = array[i + 1];
                      array[i + 1] = tmp;
                  }else{
                      continue;
                  }
              }
              tmp = array[array.length - 1];
        System.out.println("Max element of array: " + tmp);*/


        //Task 1, 2
        //Max and Min Elements of array

            /*int[] array = { -761, -6, 8, 0, -1, -2251 };
              int min = array[0];
              int max = min;
              for (int i = 1; i < array.length; ++i){
                  if (array[i] > max) max = array[i];
                  if (array[i] < min) min = array[i];
              }
        System.out.println("Min element of array : " + min);
        System.out.println("Max element of array : " + max);*/


        //Task 3 - 4
        //Indexes of max and min elements

           /* int [] array = { -761, -6, 8, 0, -1, -2251 };
                int x = 0;
                int y = 0;
                int min = array[0];
                int max = min;
                for (int i = 1; i < array.length; ++i){
                    if (array[i] > max) {
                        max = array[i];
                        x = i;
                    }
                    if (array[i] > max){
                        min = array[i];
                        y = i;
                    }
                }
            System.out.println("Index of min array element: " + x);
            System.out.println("Index of max array element: " + y);*/



        //Task 5
        //Sum of elements with odd indexes

            /*int [] array = {-761, -6, 8, 0, -1, -2251};
                int sum = 0;
                for (int i = 1; i < array.length; i += 2){
                    sum += array[i];
                }
            System.out.println(sum);*/


        //Task 6
        //Array Reverse

            /*int [] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                int tmp;
                for(int i = 0, j = array.length - 1; i < (array.length / 2); i++, j--){
                   tmp = array[i];
                   array[i] = array[j];
                   array[j] = tmp;
                }
                for (int i = 0; i < array.length; i++){
                    System.out.print(array[i] + " ");
                }*/


        //Task 7
        //Quantity of odd elements.
        //Option 1

            /*int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
                int quantity = 0;
                for(int i = 0; i < array.length; i+=2){
                    quantity++;
                }
            System.out.println(quantity);*/

        //Option 2

               /* int [] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                int quantity = (int)(Math.ceil(array.length / 2.0));
                System.out.println(quantity);*/


        //Task 8 Half and half array reverse.

            /*int[] array = {1,2,3,4,5,6,7,8,9 };
            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < array.length; i++) {
                list.add(array[i]);
            }

            for (int i = 0, j = 0; j < array.length / 2.0; i = 0, j++){
                 list.add(list.get(i));
                 list.remove(i);
            }

            System.out.println(list);*/



        //Task 9
        //Bubble, Insert, Select
        //BubbleSort

            /*int tmp;
                int [] array = { 7, 4, 8, 3, 6, 1, 2, 5, 9 };
                for (int i = 0, endI = array.length - 1; i < endI; i++){
                    boolean isSwap = false;
                    for (int j = 0, endJ = endI - i; j < endJ; j++){
                        if (array[j] > array[j + 1]){
                            tmp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = tmp;
                            isSwap = true;
                        }
                    }
                    if (!isSwap){
                        break;
                    }
                }

            for (int item : array) {
                System.out.print(item + " ");
            }*/



        //SelectSort

            /*int [] array = { 7, 4, 8, 3, 6, 1, 2, 5, 9 };
                int tmp;
                for (int i = 0; i < array.length - 1; i++){
                    int min = i;
                    for (int j = i + 1; j < array.length; j++){
                        if (array[j] < array[min]){
                            min = j;
                        }
                    }
                    tmp = array[i];
                    array[i] = array[min];
                    array[min] = tmp;
                }
            for (int item : array) {
                System.out.print(item + " ");
            }*/


        //SortInsert

            /*int [] array = { 7, 4, 8, 3, 6, 1, 2, 5, 9 };
                for (int i = 1; i < array.length; i++){
                    int current = array[i];
                    int j = i;
                    while (j > 0 && array[j - 1] > current){
                        array[j] = array[j - 1];
                        j--;
                    }
                    array[j] = current;
                }
            for (int item : array) {
                System.out.print(item + " ");
            }*/


        //Task 10
        //ShellSort, HeapSort, QuickSort, MergeSort

        //ShellSort
            /*int [] array = { 7, 4, 8, 3, 6, 1, 2, 5, 9 };
                int n = array.length;
                int i = (int)(Math.round(n / 2.0));
                while (i > 0) {
                    for (int j = 0; j < n; j++) {
                        int k = j, t = array[j];
                        while (k >= i && array[k - i] > t){
                            array[k] = array[k - i]; k -= i;
                        }
                        array[k] = t;
                    }
                    i = (i == 2) ? 1 : (i * 5 / 11);
                }

            for (int item : array) {
                System.out.print(item + " ");
            }*/


        //HeapSort
              /*int [] array = { 7, 4, 8, 3, 6, 1, 2, 5, 9 };
              int n = array.length;
              int i = (int)(Math.floor(n / 2.0));
              int j, k, t;
              while (true){
                  if (i > 0){
                      t = array[--i];
                  }
                  else{
                      n--;
                      if (n == 0){
                          for (int item : array) {
                              System.out.print(item + " ");
                          }
                          break;
                      }
                      t = array[n]; array[n] = array[0];
                  }
                  j = i; k = j * 2 + 1;
                  while (k < n){
                      if (k + 1 < n && array[k + 1] > array[k]){
                          k++;
                      }
                      if (array[k] > t){
                          array[j] = array[k]; j = k; k = j * 2 + 1;
                      }
                      else break;
                  }
                  array[j] = t;
              }*/


        //QuickSort

       /* int [] sortedArray = quickSort(items, 0, items.length - 1);

        for (int item : sortedArray) {
            System.out.print(item + " ");
        }*/


        //Merge

             /* List<Integer> unsorted = new ArrayList<Integer>();
              List<Integer> sorted;

              Random random = new Random();

              for (int i = 0; i < 10; i++){
                  unsorted.add((int) Math.floor(Math.random()*100));
                  System.out.println(unsorted.get(i) + " ");
              }
              System.out.println();

              sorted = MergeSort(unsorted);

              for (int x : sorted){
              System.out.println(x + " ");
              }
        System.out.println("\n");
        }


        private static List<Integer> MergeSort(List<Integer> unsorted){
            if (unsorted.size() <= 1)
                return unsorted;

            List<Integer> left = new ArrayList<Integer>();
            List<Integer> right = new ArrayList<Integer>();

            int middle = unsorted.size() / 2;
            for (int i = 0; i < middle; i++){//Dividing the unsorted list
                left.add(unsorted.get(i));
            }
            for (int i = middle; i < unsorted.size(); i++){
                right.add(unsorted.get(i));
            }

            left = MergeSort(left);
            right = MergeSort(right);
            return Merge(left, right);
        }

        private static List<Integer> Merge(List<Integer> left, List<Integer> right){
            List<Integer> result = new ArrayList<Integer>();

            while (left.size() > 0 || right.size() > 0){
                if (left.size() > 0 && right.size() > 0){
                    if (left.get(0) <= right.get(0)){  //Comparing First two elements to see which is smaller
                        result.add(left.get(0));
                        left.remove(left.get(0));      //Rest of the list minus the first element
                    }
                    else{
                        result.add(right.get(0));
                        right.remove(right.get(0));
                    }
                }
                else if (left.size() > 0){
                    result.add(left.get(0));
                    left.remove(left.get(0));
                }
                else if (right.size() > 0){
                    result.add(right.get(0));
                    right.remove(right.get(0));
                }
            }
            return result;*/


    }
    //QuickSort

    /*public static int [] items = { 7, 4, 8, 3, 6, 1, 2, 5, 9 };

    public static void swap( int [] item, int leftIndex, int rightIndex){
        int temp = items[leftIndex];
        item[leftIndex] = item[rightIndex];
        item[rightIndex] = temp;
    }

    public static int partition(int []item, int left, int right) {
        int q = (int)(Math.floor((right + left) / 2.0));
        int pivot = items[q], //middle element
                i = left, //left pointer
                j = right; //right pointer
        while (i <= j) {
            while (items[i] < pivot) {
                i++;
            }

            while (items[j] > pivot) {
                j--;
            }
            if (i <= j){
                swap(items, i, j); //swapping two elements
                i++;
                j--;
            }
        }
        return i;
    }

   public static int [] quickSort(int [] item, int left, int right) {
        int index;
        if (item.length > 1) {
            index = partition(item, left, right); //index returned from partition
            if (left < index - 1) { //more elements on the left side of the pivot
                quickSort(item, left, index - 1);
            }
            if (index < right) { //more elements on the right side of the pivot
                quickSort(item, index, right);
            }
        }
        return items;
    }*/



}
