/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] + nums[j] == target) {
        console.log(i, j);
      }
    }
  }
};

const nums = [6, 4, 3, 2, 7];
const target = 7;

twoSum(nums, target);
