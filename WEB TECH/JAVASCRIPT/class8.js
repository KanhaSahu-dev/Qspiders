// Arrow function is espesially designed for arrow functions.

//! Map()

// let arr=[5,6,7,8,9,0]
// arr.map((ele)=>{ //atleast 2 argument variable you have to pass.
//     console.log(ele);
// })

// for loop is applied for iterable not map and it is limited 
// so when you use map in a string it is error

//! forEach() this method is also used as hof method like the map 

// let ar = [1,2,3,4,5,6]
// ar.forEach((ele)=>{console.log("hii");})

// The main difference in map and forEach is forEach doesnt returns whereas map returns
// map will accept 2 values 1st element 2nd one is index
// let ar = arr.map((ele)=>{console.log(ele);})
// console.log(ar);

//! filter() method is used to add conditions to an array and then return based on that condition
// If we have one line in arrow funcion it can return implicitly.


//! Rest and Spread

// If there are more than one parameters in one function  and there is only 1 argument then in that case others things stay where they are

// Rest Rest parameter will accept multiple arguments then convert it into array.

// function fun(...a){
// console.log(a);
// }
// let ar=[1,2,3,4,5];
// fun(ar)

// When i want to make the arrays element together then in that case i will use the rest operator and in case i want to spread the array elements then in that case i will use spread operator.

//! Spread
let arr1 = [1,2,3]
let arr2 = [...arr1,4,5,6]
console.log(arr2);
let arr3=[...arr1]







