const fs = require('fs');
const input = fs.readFileSync('1712.text').toString().trim().split(" ");

// 고정비용
let A = +input[0];
// 가변비용
let B = +input[1];
// 노트북 판매가격
let C = +input[2];
// 마진
let margin = A/(C-B);


if( C <= B ) {
    console.log(-1);
} else {
    console.log(Math.floor(margin)+1);
		// 마진에 내림을 하여 +1해야 함.
}