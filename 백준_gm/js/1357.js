const input = require('fs').readFileSync('1357.text').toString().trim().split(" ");

// Rev(Rev(X) + Rev(Y))

function Rev (num) {
  let x = reverseText(num[0]);
  let y = reverseText(num[1]);
  let sum = (+x + +y)+"";
  // console.log(sum);
  console.log(reverseText(sum));  
}

function reverseText (str) {
  let temp = '';
  for(i = (str.length-1); i>=0; i--) {
    temp += str[i];
  }
  str = +temp;
  return str;
}

// reverseText(322);
Rev(input);