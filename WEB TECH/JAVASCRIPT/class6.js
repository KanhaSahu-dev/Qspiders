// Functions in javascript

// console.log(x(2,3));
// let x = function(a,b){
//     return a+b;
// }

// Function hoisting

// global scope, script scope , local scope ,block level scope

// Template literal and Template string

// When we try to concatenate one number and string 

// Process of javascript is to first convert the number to string to concatenate.

// `${}`=> ${} -> The {} is the expression assosiated with the $.

// function fun(){
//     console.log("hello");
// }


// let y = `${fun}`
// console.log(y);

// Function Scope level

// If we are declaring any variable including global scope and trying access then it will be error.

// function fun(){
//     var x = "sheela";
// }
// console.log(x);

//! Block Level

//~ var can be accessed outside of the block.

// {
//     var x = "sheela"
// }

// console.log(x);

// {
//     let x = 10
//     const y = 5
// }

// console.log(x);
// console.log(y);


//~ If you declare an variable with var then it will create a space in the heap area

/*
!If you declare a variable in let and const then a script area will be created.
!In the heap area there is called a window object in the heap area.
!If you are declaring without any declarations then anyone can access it anywhere.
*/

//~ Trim method will help to remove the space left and right start and end it will not remove the spaces in between the characters

//? Length is used to give the length of the string.

//~ function scope

// function fun(){
//     var x = "hi"
//     let y = 1
//     const z = 2
// }

// console.log(x);
// console.log(y);
// console.log(z);

//~ Block Scope

// {
//     var x = 10
//     let y = 2
//     const z = 1
// }

// console.log(x);
// console.log(y);
// console.log(z);

//~ trim

// let str = "   hello   "
// console.log(str.trim());

// const str2 = "hello hii bye"

// console.log(str2.length);

//~ charAt() charAt() helps to find the character present in the particular index works in string

let str = "sheela"
for(let i = 0;i<str.length;i++){
    console.log(str.charAt(i));
}

// why + - * / are unary operator