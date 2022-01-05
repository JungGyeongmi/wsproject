const input = require('fs').readFileSync('1100.text').toString().split(/\s/);

let count = 0;
for (let i=0; i<8; i++) {
    for (let j=0; j<8; j++) {
      (i+j) % 2 === 0 && input[i][j] === "F"? count++:false;
    }
}
console.log(count);

// let temp;
// let count;
// for(i=0; i < 64; i++) {
//   let temp = input[i].trim().split("");
//   // console.log(temp)
//   for(j=0; j < 8; j++) {
//     if(i % 2 == 0) {
//       console.log(temp[j])
//       return temp[j]=="F"&&j%2==0?count++:false;
//     } else {
//       console.log(temp[j])
//       return temp[j]=="F"&&j%2!=0?count++:false;
//     }
//  }  
// }

// console.log(count);