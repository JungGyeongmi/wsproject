const input = require('fs').readFileSync('3052.text').toString().trim().split(" ");

// parseInt(input[0]) => 값 추출 
// 추출한 값을 42로 나눠주면 된다
// 예제는 10개 

// 빈 배열, 전역 변수로 둬야~ 값 변경 가능
var arr = [];

console.log(input);

for (i=0; i < input.length; i++) {
  // 텍스트 값 받아오기
  let temp = parseInt(input[i]);
  arr.push(temp % 42);  
}

console.log(arr);

/*for(j = 1; j < arr.length; j++) {
  for(k = 1; k < arr.length-1; k++) {
    console.log(j, k);
  }
}*/

// var counter = 0;
// for(j = 0; j < arr.length; j++) {
//   for(k = 0; k < arr.length; k++) {
//     if (arr[j] == arr[k]) {
//       console.log(`arr[j] ${arr[j]} / arr[k] ${arr[k]}`);
//       counter ++;
//       console.log(`counter : ${counter}`)
//     } 
//   }
// }
let counter = 1;
for(i=0; i<arr.length; i++) {

  for(j=1; j<arr.length; j++) {
    if(arr[i]!=arr[j]) {
      counter++;
    }
  }
}
console.log(counter);