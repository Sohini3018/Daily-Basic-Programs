{
  var a = 10; // less strict
  let b = 20;
  const c = 30;

  // All these will be printed
  console.log(a);
  console.log(b);
  console.log(c); 
}

console.log(a);
console.log(b); // let is block scoped
console.log(c); // const is also block scoped 
// can not access let and const from outside of block
