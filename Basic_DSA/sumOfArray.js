function sumOfArray(arr, sum) {
  for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  return sum;
}

const arr = [1, 2, 3, 4, 5];
let sum = 0;
let total = sumOfArray(arr, sum);
console.log(`Total is ${total}`);
