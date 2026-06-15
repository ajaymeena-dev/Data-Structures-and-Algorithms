function largestNumber(arr, largest) {
  for (let elm of arr) {
    if (elm < largest) {
      largest = elm;
    }
  }
  return largest;
}
const arr = [1, 11, 22, 2, 41, 5, 0, -1];
let largest = arr[0];
let result = largestNumber(arr, largest);
console.log(result);
