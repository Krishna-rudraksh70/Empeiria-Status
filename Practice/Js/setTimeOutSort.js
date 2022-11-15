// I like asynchronous nature of javascript because it helps me to sort arrays easily. No more bubble, selection, merge or quick sort algorithms. Timeout sort for the win!


let arr = [10, 100, 500, 20, 35];

arr.forEach(item => {
  setTimeout(() => console.log(item), item);
})

// 10 20 35 100 500
// lol🤣🤣🤣


