const str1 = "listen";
const str2 = "silent";
if (str1.length !== str2.length) return console.log("Not n anagram string");

const sortS1 = str1.split("").sort().join("");
const sortS2 = str2.split("").sort().join("");

if (sortS1 === sortS2) {
  console.log("this is an anagram string.");
} else {
  console.log("this is not an anagram string.");
}
