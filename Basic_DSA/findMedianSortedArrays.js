var findMedianSortedArrays = function (nums1, nums2) {
  const mergeArr = [...nums1, ...nums2].sort((a, b) => a - b);

  const mid = Math.floor(mergeArr.length / 2);

  let median;

  if (mergeArr.length % 2 === 0) {
    median = (mergeArr[mid - 1] + mergeArr[mid]) / 2;
  } else {
    median = mergeArr[mid];
  }

  return median;
};

const nums1 = [1, 2, 3, 4, 5, 6, 7];
const nums2 = [3, 4, 2, 6, 9, 2, 3];

console.log(findMedianSortedArrays(nums1, nums2));
