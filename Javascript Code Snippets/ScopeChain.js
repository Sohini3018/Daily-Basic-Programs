function a()
{
  console.log(b); // accessed because b is defined globally
  var c = 10;
  print();
  function print()
  {
    console.log(b);
    console.log(c);
    // these can be accesses as they are in scope
    // All are under scope chain
    // every function has access to it's parent's lexical environment
  }
            
}
        
var b = 20;
a();
console.log(c); // this can't be accessed as c is initialized locally
