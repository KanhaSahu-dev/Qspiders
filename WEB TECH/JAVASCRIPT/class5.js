// immediate invoking function 

// (function (){
//     console.log("hello");
//     (function (){
//         console.log("hii");
//     })();
//     (function (){
//         console.log("hoi");
//     })();
    
// })();

// console.log("hello")

// after immediate invoking function we have to give the semicolon mandatory.


// function hof(a,b,task){
//     let res=task(a,b);
//     console.log(res);
//     return res;
// }

// let add=hof(10,20,function(x,y){return x+y})

// Javascript run in 2 times 
// Declaration Phase 
// Initialisation Phase

// TDZ:- Temporal Dead Zone inside declaration ste.

// call back function