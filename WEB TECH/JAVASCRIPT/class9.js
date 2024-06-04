// Document Object Model
// ---------------------
// console.log(document.getElementById("heading"));
// console.log(document.getElementById("heading1"));
// console.log(document.getElementsByClassName("head")[8]);
// Only direct child can be accesssed directly with the  operator.

// If the same id is there then the first one will be called again and again.

// console.log(document.getElementById("para1"))
// console.log(document.getElementById("para2"))
// console.log(document.getElementById("para3"))

// console.log(document.getElementsByClassName("para"));
// console.log(document.getElementsByTagName("h1"));

// console.log(typeof(document.querySelector("#heading")))
// console.log(document.querySelectorAll(".head,span"));
// 
// console.log(document.querySelector("h1"));
// 
// forEach method can iterate NodeList but cant return a value also cant iterate HTMLcollections.
// map method cant iterate NodeList.

// let x = document.querySelector("h1");
// x.innerText
// console.log(x.innerText);
// 
// 
// let para3 = document.querySelector("#para3");
// 
// para3.innerText="hello shekar";

console.log(document.getElementsByClassName("head")[1]);
console.log(document.getElementById("para1")[2]);
// console.log(document.querySelectorAll(".head")[6]);
// If i dont even have a class 

// html collections
// node list