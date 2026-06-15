const name = "ajay";
const vowels = ["a", "e", "o", "i", "u"];
let count = 0;
for (let i = 0; i < name.length; i++) {
  if (vowels.includes(name[i])) {
    count++;
  }
}

console.log("vowels is: ", count);
