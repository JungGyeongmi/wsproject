const input = require("fs").readFileSync("9935.text").toString().trim().split("\n");

const str = input[0];
const bomb = input[1];
const bombLen = bomb.length;
const stack = [];
let index = 0;

const checkBomb = () => {
  if(index < bombLen) return;
  let check = true;
  let j = 1
  for(let i=bombLen-1 ; i>=0 ; i--){
    if(bomb[i] === stack[index-j]){
      j++;
      continue;
    }
    check = false;
    break;
  }
  return check;
}

for(let i=0 ; i<str.length ; i++){
  stack[index++] = str[i];
  if(checkBomb()){
    index -= bombLen;
    continue;
  }
}

let result = stack.slice(0, index).join("");
console.log(result === '' ? 'FRULA' : result);