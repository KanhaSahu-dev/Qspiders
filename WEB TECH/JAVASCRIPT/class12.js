// let btn=document.querySelector("#btn");
// let heading=document.querySelector("h1");

// btn.addEventListener("click",()=>{
//     heading.style.backgroundColor="red";
//     heading.setAttribute("class","huuhu")
// });
// btn.addEventListener("mouseover",()=>{
//     heading.style.backgroundColor="yellow"
// });
// btn.addEventListener("dblclick",()=>{
//     heading.removeAttribute("class","huuhu");
//     heading.remove()
// })


// let ar = ['1','2','3','4']

// let [x,y,...z]=ar

// console.log(z);
// When we use rest operator then it should be the last one not even middle.

// let [...a] = arr //rest parameter
// let a = [...arr] // spread operator

// Array destructuring

// Object destructuring

let o = {
    username:"tinku",
    age:22,
    city:"bbsr",
    status:{
        single:"happy😍",
        mingle:"sad😱"
    },
    phonenumber:"996969696969",
    car_list:['a','b','c','d']
}

let {username,age,city,status:{single,mingle},phonenumber,car_list}=o

console.log(mingle);

// Carousal
// Card