const input = require('fs').readFileSync('1517.text').toString().trim().split("\n"); // 텍스트 불러오기

let totalLen = input[0].trim(); // 공백제거
let numArr = input[1].split(' '); // 배열에 저장
let compareCount = 0;
let temp;

console.log("======== ▼ 버블소트 전 ==========")
console.log("총 길이 : "+ totalLen);
console.log("변경 전 배열 : " + numArr);
console.log("======== ▼ 버블소트 진행 ==========")

for(i = 0; i < totalLen; i++) {
  for(j = 0; j < totalLen-1-i; j++) {
    if(numArr[j]>numArr[j+1]){
      temp = numArr[j];
      numArr[j] = numArr[j+1];
      numArr[j+1] = temp;
      console.log(numArr)
      compareCount ++;
    }
  }
}

console.log("교체 횟수 : "+compareCount);
console.log("변경된 배열 : " + numArr);