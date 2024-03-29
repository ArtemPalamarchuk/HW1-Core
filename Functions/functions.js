//Task 1
//Get day name by day number

/* let days = ["Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"];
function getDay(dayNumber){
	for(let i = 0; i <= days.length; i++){
		if (i == dayNumber) return days[i-1]; 
	}
}
console.log(getDay(7));  */


//Task 4
//Get distance between 2 points on cartesian coordinate system

/* function distance(x1, x2, y1, y2){
	let firstKat = Math.abs(x1 - x2);
	let secondKat = Math.abs(y1 - y2);
	let distance = Math.sqrt(firstKat*firstKat + secondKat*secondKat);
	return distance;
}
console.log(distance(1,5,4,1)); */


//Task 2, 5
//Get number in words by number

/*  function numLetters(k, d) {  // целое число прописью, это основа
	let i = '', e = [
		['', 'тысяч', 'миллион', 'миллиард', 'триллион', 'квадриллион', 'квинтиллион', 'секстиллион', 'септиллион', 'октиллион', 'нониллион', 'дециллион'],
		['а', 'и', '' ],
		['', 'а', 'ов' ]
	];
	
	if (k == '' || k == '0') return ' ноль'; // 0
	k = k.split(/(?=(?:\d{3})+$)/);  // разбить число в массив с трёхзначными числами
	if (k[0].length == 1) k[0] = '00'+k[0];
	if (k[0].length == 2) k[0] = '0'+k[0];
	
	for (let j = (k.length - 1); j >= 0; j--) {  // соединить трёхзначные числа в одно число, добавив названия разрядов с окончаниями
		if (k[j] != '000') {
			i = (((d && j == (k.length - 1)) || j == (k.length - 2)) && (k[j][2] == '1' || k[j][2] == '2') ? t(k[j],1) : t(k[j]))
				 + declOfNum(k[j], e[0][k.length - 1 - j], (j == (k.length - 2) ? e[1] : e[2])) + i;
		}
	}
	
	function t(k, d) {  // преобразовать трёхзначные числа
		let e = [
			['', ' один', ' два', ' три', ' четыре', ' пять', ' шесть', ' семь', ' восемь', ' девять' ],
			[' десять', ' одиннадцать', ' двенадцать', ' тринадцать', ' четырнадцать', ' пятнадцать', ' шестнадцать', ' семнадцать', ' восемнадцать', ' девятнадцать' ],
			['', '', ' двадцать', ' тридцать', ' сорок', ' пятьдесят', ' шестьдесят', ' семьдесят', ' восемьдесят', ' девяносто' ],
			['', ' сто', ' двести', ' триста', ' четыреста', ' пятьсот', ' шестьсот', ' семьсот', ' восемьсот', ' девятьсот' ],
			['', ' одна', ' две' ]
		];
		return e[3][k[0]] + (k[1] == 1 ? e[1][k[2]] : e[2][k[1]] + (d ? e[4][k[2]] : e[0][k[2]]));
	}
	
	return i;
}

function declOfNum(n, t, o) {  // склонение именительных рядом с числительным: число (typeof = string), корень (не пустой), окончание
	let k = [2, 0, 1, 1, 1, 2, 2, 2, 2, 2 ];
	return (t == '' ? '' : ' ' + t + (n[n.length - 2] == "1" ? o[2] : o[k[n[n.length - 1] ]]));
}

function sumLetters(a) {
	a = Number(a).toFixed(2).split('.');  // округлить до сотых и сделать массив двух чисел: до точки и после неё
	return numLetters(a[0]);
}
  
console.log(sumLetters(123456));*/

//Task 3-6
//Get number by words
/* let base = {
	"ноль" : 0, "один" : 1, "одна" : 1,	"два" : 2, "две" : 2, "три" : 3, "четыре" : 4, "пять" : 5, "шесть" : 6, "сем" : 7, "восемь" : 8, "девять" : 9, "десять" : 10, 
	"одинадцать" : 11, "двенадцать" : 12, "тринадцать" : 13, "четырнадцать" : 14, "пятнадцать" : 15, "шестнадцать" : 16, "семнадцать" : 17, "восемнадцать" : 18, "девятнадцать" : 19,
	"двадцать" : 20, "тридцать" : 30, "сорок" : 40, "пятьдесят" : 50, "шестьдесят" : 60, "семдесят" : 70, "восемьдесят" : 80, "девяносто" : 90,
	"сто" : 100, "двесте" : 200, "триста" : 300, "четыреста" : 400, "пятьсот" : 500, "шестьсот" : 600, "семьсот" : 700, "восемьсот" : 800, "девятьсот" : 900,
	"тысяч" : 1000, "тысяча" : 1000, "тысячи" : 1000, "миллион" : 1000000, "миллиона" : 1000000, "миллионов" : 1000000, "миллиард" : 1000000000, "миллиарда" : 1000000000, "миллиардов" : 1000000000
}

function getNumber(str){
	str = str.split(" ");
	let arr = [], sum = 0, sum1 = 0;		
	for(let i = 0; i < str.length; i++){
		arr.push(str[i]);
		if(str[i].indexOf("милли") == 0 || str[i].indexOf("тысяч") == 0){
			for(let k = 0; k < arr.length; k++){
				(arr[k].indexOf("милли") == 0 || arr[k].indexOf("тысяч") == 0 ) ? sum *= base[arr[k]] : sum += base[arr[k]];			
			}
			sum1 += sum;
			sum = 0;
			arr.length = 0;
		}
		if(str[i + 1] == undefined){
			for(let u = 0; u < arr.length; u++){
				sum += base[arr[u]];			
			}
			sum1 += sum;
		}
	}

	return sum1;
}

console.log(getNumber("пять миллиардов сто двадцать один миллион четыреста пятьдесят одна тысяча два")); */




	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
