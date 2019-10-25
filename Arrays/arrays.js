//Task 1
//Min element of array

/* let array = [ -7611, -6, 8, 0, -1, -2251];
for(let i = 0; i < array.length; i++){
	if(array[i] < array[i + 1]){
		tmp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = tmp;		
	}else{
		continue;
	}
}
tmp = array[array.length - 1];
console.log(`Min element of array: ${tmp}`); */ 


//Task 2
//Min element of array

/* let array = [ -7611, -6, 8, 0, -1, -2251];
for(let i = 0; i < array.length; i++){
	if(array[i] > array[i + 1]){
		tmp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = tmp;		
	}else{
		continue;
	}
}
tmp = array[array.length - 1];
console.log(`Max element of array: ${tmp}`); */


//Task 1,2
//Max and Min elements of array

/*  let array = [ -7611, -6, 8, 0, -1, -2251]; 
min = array[0];
max = min;
for (let i = 0; i < array.length; ++i) {
  if (array[i] > max) max = array[i];
  if (array[i] < min) min = array[i];
}
 console.log(`Min element of array: ${min}`);
 console.log(`Max element of array: ${max}`);  */

 
//Task 3-4
//Indexes of max and min elements


/* let array = [ -7611, -6, 8, 0, -1, -2251]; 
let x = 0;
let y = 0;
min = array[0];
max = min;
for (let i = 0; i < array.length; ++i) {
    if (array[i] > max){
	    max = array[i];
	    x = i;
    }
	if (array[i] < min){
		min = array[i];
		y = i;
	}
}
 console.log(`Index of max element: ${x}`);
 console.log(`Index of min element: ${y}`); */


//Task 5
//Sum of elements with odd indexes

/* let array = [ -7611, -6, 8, 0, -1, -2251]; 
let sum = 0; 
for(let i = 1; i < array.length; i+=2){
	sum+=array[i];
}
console.log(`Sum of elements with odd indexes: ${sum}`); */ 


//Task 6
//Array Reverse

/* let array = [ 1, 2, 3, 4, 5, 6, 7, 8, 9 ];
let tmp;
for(let i = 0, j = array.length - 1; i < (array.length - 1)/2; i++, j--){
	tmp = array[i];
	array[i] = array[j];
	array[j] = tmp;
}
console.log(array);  */


//Task 7
//Quantity of odd elements

  //Option 1
/* let array = [ 1, 2, 3, 4, 5, 6, 7, 8, 9 ];
let quantity = 0;
for(let i = 0; i < array.length; i += 2){
	quantity++;
}
console.log(`Quantity of odd elements: ${quantity}`); */

  //Option 2
/*  let array = [ 1, 2, 3, 4, 5, 6, 7, 8, 9 ];
let quantity = Math.round(array.length / 2);
console.log(`Quantity of odd elements: ${quantity}`);  */


//Task 8
//Half and half array reverse

/*  let array = [ 1, 2, 3, 4, 5, 6, 7, 8, 9 ];
for(let i = 0, j = 0; j < array.length / 2; i=0, j++){
	array.push(array[i]);
	array.shift();
}
console.log(array); */


//Task 9
//Bubble, Insert, Select

//BubbleSort
/* let array = [ 7, 4, 8, 3, 6, 1, 2, 5, 9 ];
for(let i = 0, endI = array.length - 1; i < endI; i++){
	let isSwap = false;
	for(let j = 0, endJ = endI - i; j < endJ; j++){
		if(array[j] > array[j + 1]){
			[array[j], array[j + 1]] = [array[j + 1], array[j]];
			isSwap = true;
		}
	}
	if (!isSwap){break;}
}
console.log(array); */

//SelectSort
/* let array = [ 7, 4, 8, 3, 6, 1, 2, 5, 9 ];
for(let i = 0; i < array.length - 1; i++){
	let min = i;
	for(let j = i + 1; j < array.length; j++){
		if(array[j] < array[min]){
			min = j;
		}
	}
	[array[i], array[min]] = [array[min], array[i]]
}
console.log(array); */

//SortInsert
/* let array = [ 7, 4, 8, 3, 6, 1, 2, 5, 9 ];
for(let i = 1; i < array.length; i++){
	let current = array[i];
	let j = i;
	while(j > 0 &&  array[j - 1] > current){
		array[j] = array[j-1];
		j--;
	}
	array[j] = current;
}
 console.log(array); */
 
//Task 10
//ShellSort, HeapSort, QuickSort, MergeSort

//ShellSort 
/* let array = [ 7, 4, 8, 3, 6, 1, 2, 5, 9 ];
let n = array.length, i = Math.round(n/2);
    while (i > 0){
		for(let j = 0; j < n; j++){
			let k = j, t = array[j];
            while (k >= i && array[k-i] > t){
				array[k] = array[k-i]; k -= i; 
			}
            array[k] = t;
        }
        i = (i==2) ? 1 : Math.round(i*5/11);
    }
console.log(array); */

//HeapSort
/* let array = [ 7, 4, 8, 3, 6, 1, 2, 5, 9 ];
if (array.length == 0){
	console.log([]);
} 
let n = array.length, i = Math.floor(n/2), j, k, t;
while (true){
	if (i > 0){ 
		t = array[--i];
	}
	else{ 
		n--;
		if (n == 0){
			console.log(array);
			break;
		}
		t = array[n];  array[n] = array[0];
	}        
	j = i;  k = j*2+1;
	while(k < n){
		if (k+1 < n && array[k+1] > array[k]){
			k++;
		}
		if (array[k] > t){
			array[j] = array[k];  j = k;  k = j*2+1; 
		}
		else break;
	}
	array[j] = t; 
    } 
*/

//QuickSort
/* let items = [ 7, 4, 8, 3, 6, 1, 2, 5, 9 ];
function swap(items, leftIndex, rightIndex){
    let temp = items[leftIndex];
    items[leftIndex] = items[rightIndex];
    items[rightIndex] = temp;
}
function partition(items, left, right) {
    let pivot = items[Math.floor((right + left) / 2)], //middle element
        i = left, //left pointer
        j = right; //right pointer
    while (i <= j) {
        while (items[i] < pivot) {
            i++;
        }
        while (items[j] > pivot) {
            j--;
        }
        if (i <= j) {
            swap(items, i, j); //swapping two elements
            i++;
            j--;
        }
    }
    return i;
}

function quickSort(items, left, right) {
    let index;
    if (items.length > 1) {
        index = partition(items, left, right); //index returned from partition
        if (left < index - 1) { //more elements on the left side of the pivot
            quickSort(items, left, index - 1);
        }
        if (index < right) { //more elements on the right side of the pivot
            quickSort(items, index, right);
        }
    }
    return items;
}
// first call to quick sort
let sortedArray = quickSort(items, 0, items.length - 1);
console.log(sortedArray);  */

//Merge
/* let merge_sort = function(array){ 
    function merge(left, right){
		let result = [];
		let il = 0;
		let ir = 0;
			while (il < left.length && ir < right.length){
				if (left[il] < right[ir]){
					result.push(left[il++]);
				}else{
					result.push(right[ir++]);
				}
			}
		//merge what is left
		return result.concat(left.slice(il)).concat(right.slice(ir));
    }
  
    function merge_sort(items){
    //well it is only 1 element
		if (items.length < 2){
			return items;
		} 
		let middle = Math.floor(items.length / 2);
		//create two arrays
		let left = items.slice(0, middle);
		let right = items.slice(middle);
		return merge(merge_sort(left), merge_sort(right));
	}
	
    return merge_sort(array);
};

let a = merge_sort([ 7, 4, 8, 3, 6, 1, 2, 5, 9 ]);
console.log(a);  */

