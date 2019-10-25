//Task 1 
//If a - even, return a * b, else return a + b

/* let a = 6;
let b = 5;
let result = (a % 2 == 0) ?  console.log(a*b) : console.log(a+b); */


//Task 2
//Determine to which quarter belongs to the point with coordinates (x, y)

/* let x = 5;
let y = 5;
 if (x > 0 && y > 0){
	console.log("Point belongs to the first quarter.");
}else if (x < 0 && y > 0){
	console.log("Point belongs to the second quarter.");
}else if (x < 0 && y < 0){
	console.log("Point belongs to the third quarter.");
}else if (x > 0 && y < 0){
	console.log("Point belongs to the fourth quarter.");
}else if (x === 0 && y !== 0){
	console.log("Point lies on the x axis.");
}else if (y === 0 && x !== 0){
	console.log("Point lies on the y axis.");
}else if (x === 0 && y === 0){
	console.log("Point lies at zero position.");
} */


//Task 3
//Determine the sums of only positive from three numbers

/* let a = -5;
let b = 1;
let c = 5;
if(a > 0 && b > 0 && c > 0){
	console.log(a + b + c);
}else if(a > 0 && b > 0 && c <= 0){
	console.log(a + b);
}else if(a > 0 && c > 0 && b <= 0){
	console.log(a + c);
}else if(b > 0 && c > 0 && a <= 0){
	console.log(b + c);
}else if(a > 0 && b <= 0 && c <= 0){
	console.log(a);
}else if(a <= 0 && b > 0 && c <= 0){
	console.log(b);
}else if(a <= 0 && b <= 0 && c > 0){
	console.log(c);
}  */


//Task 4
//Count expression max((a * b * c),(a + b + c)) + 3

/* let a = 1;
let b = 2;
let c = 0;

let sum = a + b + c;
let multi = a * b * c;
let result = 0;

if(sum > multi){
	console.log(result = sum + 3);
}else{
	console.log(result = multi + 3);
} */


//Task 5
//Determining grade by rating

/* let rating = 100;
switch(true){
    case rating >= 0 && rating <= 19:
		console.log("F");
		break;
	case rating >= 20 && rating <= 39:
		console.log("E");
		break;	
	case rating >= 40 && rating <= 59:
		console.log("D");
		break;
	case rating >= 60 && rating <= 74:
		console.log("C");
		break;
	case rating >= 75 && rating <= 89:
		console.log("B");
		break;
	case rating >= 90 && rating <= 100:
		console.log("A");
}  */
