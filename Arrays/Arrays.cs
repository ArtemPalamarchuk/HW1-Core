using System;
using System.Collections.Generic;
using System.Linq;

namespace Arrays
{
    class Program
    {
        static void Main(string[] args)
        {
            //Task 1
            //Min element of array

            /*int[] array = { -7611, -6, 8, 0, -1, -2251 };
              int tmp = 0;
              for (int i = 0; i < array.Length - 1; i++){
                  if (array[i] < array[i + 1]){
                      tmp = array[i];
                      array[i] = array[i + 1];
                      array[i + 1] = tmp;
                  }else{
                      continue;
                  }
              }
              tmp = array[array.Length - 1];
              Console.WriteLine($"Min element of array: {tmp}");*/


            //Task 2
            //Max element of array
            /*int[] array = { -7611, -6, 8, 0, -1, -2251 };
              int tmp = 0;
              for (int i = 0; i < array.Length - 1; i++){
                  if (array[i] > array[i + 1]){
                      tmp = array[i];
                      array[i] = array[i + 1];
                      array[i + 1] = tmp;
                  }else{
                      continue;
                  }
              }
              tmp = array[array.Length - 1];
              Console.WriteLine($"Max element of array: {tmp}");*/


            //Task 1, 2
            //Max and Min Elements of array

            /*int[] array = { -761, -6, 8, 0, -1, -2251 };
              int min = array[0];
              int max = min;
              for (int i = 1; i < array.Length; ++i){
                  if (array[i] > max) max = array[i];
                  if (array[i] < min) min = array[i];
              }
              Console.WriteLine($"Min element of array : {min}");
              Console.WriteLine($"Max element of array : {max}");*/


            //Task 3 - 4
            //Indexes of max and min elements

            /*int [] array = { -761, -6, 8, 0, -1, -2251 };
              int x = 0;
              int y = 0;
              int min = array[0];
              int max = min;
              for (int i = 1; i < array.Length; ++i){
                  if (array[i] > max) {
                      max = array[i];
                      x = i;
                  }
                  if (array[i] > max){
                      min = array[i];
                      y = i;
                  }
              }
              Console.WriteLine($"Index of min array element: {x}");
              Console.WriteLine($"Index of max array element: {y}");*/


            //Task 5
            //Sum of elements with odd indexes

            /*int [] array = {-761, -6, 8, 0, -1, -2251};
              int sum = 0;
              for (int i = 1; i < array.Length; i += 2){
                  sum += array[i];
              }
              Console.WriteLine(sum);*/


            //Task 6
            //Array Reverse

            /* int [] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
              int tmp;
              for(int i = 0, j = array.Length - 1; i < array.Length / 2; i++, j--){
                 tmp = array[i];
                 array[i] = array[j];
                 array[j] = tmp;
              }
              foreach (var item in array){
                 Console.Write(item.ToString() + " ");
            } */


            //Task 7 
            //Quantity of odd elements.
            //Option 1

            /*int[] array = {1, 2, 3, 4, 5, 6, 7, 8, };
              int quantity = 0;
              for(int i = 0; i < array.Length; i+=2){
                  quantity++;
              }
              Console.WriteLine(quantity);*/

            //Option 2

            /*int [] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
              int quantity = Convert.ToInt16(Math.Ceiling(array.Length / 2.0));
              Console.WriteLine(quantity);*/


            //Task 8 Half and half array reverse.

            /*int[] array = {1,2,3,4,5,6,7,8,9 }; 
              List<int> list  = new List<int>();
              list .AddRange(array);
            
              for (int i = 0, j = 0; j < array.Length / 2.0; i = 0, j++){
                  list .Add(list [i]);
                  list .RemoveAt(i);
              }

              foreach (int a in list ){
                  Console.Write(a + " ");
              }*/


            //Task 9
            //Bubble, Insert, Select
            //BubbleSort

            /*int tmp;
              int [] array = { 7, 4, 8, 3, 6, 1, 2, 5, 9 };
              for (int i = 0, endI = array.Length - 1; i < endI; i++){
                  bool isSwap = false;
                  for (int j = 0, endJ = endI - i; j < endJ; j++){
                      if (array[j] > array[j + 1]){
                          tmp = array[j];
                          array[j] = array[j + 1];
                          array[j + 1] = tmp;
                          isSwap = true;
                      }
                  }
                  if (!isSwap){break;}
              }

              foreach (int a in array){
                  Console.Write(a + " ");
              }*/


            //SelectSort

            /*int [] array = { 7, 4, 8, 3, 6, 1, 2, 5, 9 };
              int tmp;
              for (int i = 0; i < array.Length - 1; i++){
                  int min = i;
                  for (int j = i + 1; j < array.Length; j++){
                      if (array[j] < array[min]){
                          min = j;
                      }
                  }
                  tmp = array[i];
                  array[i] = array[min];
                  array[min] = tmp;  
              }
              foreach (int a in array){
                  Console.Write(a + " ");
              }*/


            //SortInsert

            /*int [] array = { 7, 4, 8, 3, 6, 1, 2, 5, 9 };
              for (int i = 1; i < array.Length; i++){
                  int current = array[i];
                  int j = i;
                  while (j > 0 && array[j - 1] > current){
                      array[j] = array[j - 1];
                      j--;
                  }
                  array[j] = current;
              }
              foreach (int a in array){
                  Console.Write(a + " ");
              }*/

            //Task 10
            //ShellSort, HeapSort, QuickSort, MergeSort

            //ShellSort
            /*int [] array = { 7, 4, 8, 3, 6, 1, 2, 5, 9 };
              int n = array.Length;
              int i = Convert.ToInt16(Math.Round(n / 2.0));
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

              foreach (int a in array){
                  Console.Write(a + " ");
              }*/


            //HeapSort
            /*int [] array = { 7, 4, 8, 3, 6, 1, 2, 5, 9 };
              int n = array.Length;
              int i = Convert.ToInt16(Math.Floor(n / 2.0));
              int j, k, t;
              while (true){
                  if (i > 0){
                      t = array[--i];
                  }
                  else{
                      n--;
                      if (n == 0){
                          foreach (int a in array){
                              Console.WriteLine(a);
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
            /*int [] items = { 7, 4, 8, 3, 6, 1, 2, 5, 9 };

              void swap(int [] item, int leftIndex, int rightIndex){
                  int temp = items[leftIndex];
                  item[leftIndex] = item[rightIndex];
                  item[rightIndex] = temp;
              }

              int partition(int []item,int left,int right) {
                  int q = Convert.ToInt16(Math.Floor((right + left) / 2.0));
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

              int [] quickSort(int [] item, int left, int right) {
                  int index;
                  if (item.Length > 1) {
                      index = partition(item, left, right); //index returned from partition
                      if (left < index - 1) { //more elements on the left side of the pivot
                          quickSort(item, left, index - 1);
                      }
                      if (index < right) { //more elements on the right side of the pivot
                          quickSort(item, index, right);
                      }
                  }
                  return items;
              }
            // first call to quick sort
              int [] sortedArray = quickSort(items, 0, items.Length - 1);
              foreach (int a in sortedArray){
                  Console.Write(a + " ");
              }*/

            //Merge

            /*List<int> unsorted = new List<int>();
              List<int> sorted;

              Random random = new Random();

              for (int i = 0; i < 10; i++){
                  unsorted.Add(random.Next(0, 100));
                  Console.Write(unsorted[i] + " ");
              }
              Console.WriteLine();

              sorted = MergeSort(unsorted);

              foreach (int x in sorted){
                  Console.Write(x + " ");
              }
              Console.Write("\n");
        }


        private static List<int> MergeSort(List<int> unsorted){
            if (unsorted.Count <= 1)
                return unsorted;

            List<int> left = new List<int>();
            List<int> right = new List<int>();

            int middle = unsorted.Count / 2;
            for (int i = 0; i < middle; i++){//Dividing the unsorted list
                left.Add(unsorted[i]);
            }
            for (int i = middle; i < unsorted.Count; i++){
                right.Add(unsorted[i]);
            }

            left = MergeSort(left);
            right = MergeSort(right);
            return Merge(left, right);
        }

        private static List<int> Merge(List<int> left, List<int> right){
            List<int> result = new List<int>();

            while (left.Count > 0 || right.Count > 0){
                if (left.Count > 0 && right.Count > 0){
                    if (left.First() <= right.First()){  //Comparing First two elements to see which is smaller
                        result.Add(left.First());
                        left.Remove(left.First());      //Rest of the list minus the first element
                    }
                    else{
                        result.Add(right.First());
                        right.Remove(right.First());
                    }
                }
                else if (left.Count > 0){
                    result.Add(left.First());
                    left.Remove(left.First());
                }
                else if (right.Count > 0){
                    result.Add(right.First());
                    right.Remove(right.First());
                }
            }
            return result;*/

        }
    }
}
