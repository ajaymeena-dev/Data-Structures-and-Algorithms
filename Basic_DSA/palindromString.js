const palindromString = (name) => {
  let rev = "";
  for (let i = name.length - 1; i >= 0; i--) {
    rev += name[i];
  }
  if (rev === name) {
    console.log("this is a palindrom string!");
  } else {
    console.log("this is not a palindrom string");
  }
};

const name = "kanak";
palindromString(name);
