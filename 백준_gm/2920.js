const input = require('fs').readFileSync('2920.text').toString().split(" ");

let asc = 0;
let desc = 0;

for (let i = 0; i <input.length-1; i++) {
  if(input[i] - input[i+1] < 0) {
    asc++;
  } else if (input[i] - input[i+1] > 0) {
    desc++;
  }
}

if(asc == 7) {
  console.log("ascending");
} else if(desc == 7) {
  console.log("descending");
} else {
  console.log("mixed")
}
 