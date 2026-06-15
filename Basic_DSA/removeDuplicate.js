// function removeDuplicate(arr) {
//   for (let i = 0; i < arr.length; i++) {
//     for (let j = i + 1; j < arr.length; j++) {
//       if (arr[i] === arr[j]) {
//         arr[i] = -1;
//       }
//     }
//     if (arr[i] != -1) {
//       console.log(arr[i]);
//     }
//   }
// }
const arr = [1, 2, 3, 4, 5, 6, 7, 8, 8, 32, 2, 1];
// removeDuplicate(arr);

const setResult = [...new Set(arr)];
console.log(setResult);
