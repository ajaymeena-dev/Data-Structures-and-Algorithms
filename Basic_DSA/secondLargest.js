const findSecondLargest = (arr, largest, secondLargest) => {
  if (arr[0] > arr[1]) {
    largest = arr[0];
    secondLargest = arr[1];
  } else {
    secondLargest = arr[0];
    largest = arr[1];
  }

  for (let i = 3; i < arr.length; i++) {
    if (arr[i] > largest) {
      secondLargest = largest;
      largest = arr[i];
    } else if (arr[i] > secondLargest) {
      secondLargest = arr[i];
    }
  }
  return secondLargest;
};

let arr = [1, 2, 3, 14, 55, 16, 77, 8, 19];
let largest;
let secondLargest;
const result = findSecondLargest(arr, largest, secondLargest);
console.log("Second largest number is: ", result);
