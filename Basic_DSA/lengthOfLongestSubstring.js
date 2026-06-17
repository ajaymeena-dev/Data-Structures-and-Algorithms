/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function (s) {
  const str = [...new Set(s.split(""))];
  return str.toString();
};

let s = "pwwkew";
let reult = lengthOfLongestSubstring(s);
console.log(reult);
