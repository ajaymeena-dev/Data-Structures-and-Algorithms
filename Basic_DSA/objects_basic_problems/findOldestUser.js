const users = [
  { name: "Ajay", age: 22 },
  { name: "Rahul", age: 18 },
  { name: "Ram", age: 50 },
  { name: "Amit", age: 25 },
];

// const result = users.sort((a, b) => b.age - a.age);

// console.log(result[0]);

const oldestUser = users.reduce(
  (curElm, user) => (user.age > curElm.age ? user : curElm),
  users[0],
);

console.log(oldestUser);
