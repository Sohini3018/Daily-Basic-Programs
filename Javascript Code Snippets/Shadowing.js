// shadowing with let - let with blocks
let a = 100;
{
  let a = 10;
  console.log(a); // shadows global declaration
}
console.log(a); // global scope

// 10
// 100

// shadowing with const - const with blocks
const a = 200;
{
  const a = 20;
  console.log(a); // shadows global declaration
}
console.log(a); // global scope
// 20
// 200

// shadowing let - const
let a = 200;
{
  const a = 20;
  console.log(a); // shadows global declaration
}
console.log(a); // global scope
// 20
// 200


// shadowing with var - var - var is always having global scoped can be accessed from anywhere.
// var inside and outside ob block both refers to same memory location attached to global obj.
var a = 200;
{
  var a = 20;
  console.log(a); // shadows global declaration
}
console.log(a); // also shadows and overwrites

// 20
// 20


// shadowing var is global memory and let is local memory. So this is valid. 
var a = 200;
{
  let a = 20;
  console.log(a); // shadows global declaration
}
console.log(a);

// 20
// 200

// Important
let a = 200;
{
  var a = 300; // Syntax error - a is already declared
  console.log(a);
}
console.log(a);

