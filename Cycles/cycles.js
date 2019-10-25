//Task 1
//Find sum of even numbers and their quantity in the range from 1 to 99

/* let evenSum = 0;
let quantity = 0;
for(let i = 2; i < 100; i++){
	if(i % 2 == 0){
		evenSum += i;
		quantity++;
	}
}
console.log(`Sum - ${evenSum}, Quantity of numbers - ${quantity}.`); */ 


//Task 2
//Verify number if prime
  //Option 1.

/* let n = 97;
let i = 2;
let a = 0;
let b = 0;
while(i < n){
	if(n % i != 0){
		a++;
	 }else if(n % i == 0){
		b++;
	}
	i++;
}
(b == 0) ? console.log(`Number ${n} is simple`) : console.log(`Number ${n} is compound.`); */

  //Option 2. Find all simple numbers from 2 to n.

/* let n = 3;
nextPrime:
for (let i = 2; i <= n; i++) {
    for (let j = 2; j < i; j++) {
        if (i % j == 0) continue nextPrime;
    }
  console.log(i);
} */


//Task 3
//Find the sqrt of a natural number up to an integer

/* let x = 8;
let num = 1;
let rez = 0;
while(x > 0){
	x -= num;
	num += 2;
	rez += (x < 0) ? 0 : 1;
}
console.log(`Nearby integer to radix is ${rez}.`); */


//Task 4
//Calculate factorial of a number

/* let n = 5;
let result = 1;
for(let i =1; i <= n; i++){
	result =  result*i;
}
console.log(`Factorial of number ${n} is ${result}.`); */


//Task 5
//Calculate sum of digits of given number

/* let n = 1234; 
let sum = 0;
let tmp;
while(n){
	tmp = n % 10;
	n = (n - tmp) / 10;
	sum += tmp;
}
console.log(`Sum of digits is ${sum}`);  */ 


//Task 6
//Reverse number
/* let n = 1234;
let k = n;
let reverse = "";
let tmp;
while(n){
	tmp = n % 10;
	n = (n - tmp) / 10;
	reverse += tmp;
}
reverse = Number(reverse);
console.log(`Reverse of ${k} is ${reverse}`);*/