// let root=document.querySelector("#root")

// let div=document.createElement("div")

// let h1=document.createElement("h1")

// h1.innerText="Hello Sunday...!"

// let h2=document.createElement("h2")

// h2.innerText="i am second sunday.."

// div.append(h1,h2)

// // div.appendChild(h2)

// root.appendChild(div)

// let image= document.createElement('img');
// console.log(image);
// let imgsrc = "https://cdn.pixabay.com/photo/2024/03/13/02/40/ai-generated-8629915_640.jpg"
// image.src=""
// root.appendChild(image)

// image.style.height="300px"
// image.style.width="300px"

// image.id="hii"

// image.setAttribute("src",imgsrc);
// image.setAttribute("title","sheelaCrush")
// image.setAttribute("id","id1")


let btn = document.querySelector("#btn");
console.log(btn);

btn.addEventListener("click", () => {
    btn.style.color = "red";
    let userName = prompt("Enter your name")
    
    let ar = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Officiis, veritatis."
    ar = ar.split(" ")
    if (userName != "") {
        let div = document.createElement("div");
        let ol = document.createElement("ol");
        for (i of ar) {
            if (i.length > userName.length) {
                let li = document.createElement("li");
                li.innerText = i;
                ol.appendChild(li);
            }
        }
        div.appendChild(ol)
        document.body.appendChild(div);
    
    } else {
        alert("Stay single Forever")
    }
})

/*
// let root=document.querySelector("#root")
// let div=document.createElement("div")
// let h1=document.createElement("h1")
// h1.innerText="Hello Sunday...!"
// h1.id="heading1"
// let h2=document.createElement("h2")
// h2.innerText="i am second sunday.."
// div.append(h1,h2)
// // div.appendChild(h2)
// root.appendChild(div)

// let image=document.createElement("img")
// console.log(image);
// let imgsrc="https://media.istockphoto.com/id/1340689714/photo/portrait-of-happy-beautiful-indian-woman-looking-away-with-a-toothy-smile-and-contemplating.jpg?s=2048x2048&w=is&k=20&c=9J9T39JrmEWU8EREzP_QJccF8lwGDAV-wxEEmpRV8Vw="

// image.setAttribute("src",imgsrc)
// image.setAttribute("title","sheela crush")
// image.setAttribute("class","sheela-crush")
// image.setAttribute("id","sheela-crush")

// console.log(image);

// root.append(image)
// image.style.width="300px"
// image.style.height="300px"


// let btn=document.querySelector("#btn")
let divbox=document.querySelector(".list")
// console.log(btn);
// let list1=["sheela","leela","mala","punam","pinky","chinky","chameli","sri","jyothi","sheema","sen","monalisha","jisoo","perry","jungkook","sunny","sinchan","madhubala","samantha","jilebi"]

// btn.addEventListener("click",()=>{
//    let username=prompt("enter your name")
//    if(username!=""){
//       // let i=list1.length
//       let j=username.length
//       console.log(j);
//       let ol=document.createElement("ol")
      
//       for(let i=0;i<j;i++){
//          let li=document.createElement("li")
//          li.innerText=list1[i]
//          ol.appendChild(li)
//          // console.log(li);
//       }
//       console.log(ol);
//       divbox.append(ol)
//    }
//    else{
//       alert("stay single forever")
//    }
// })

let data=[
   {
      username:"sheela",
      age:23
   },
   {
      username:"leela",
      age:24
   },
  
   {
      username:"shakila",
      age:21
   },
   {
      username:"shakila",
      age:21
   },
   {
      username:"shakila",
      age:21
   },
   {
      username:"shakila",
      age:21
   },
   {
      username:"shakila",
      age:21
   },
   {
      username:"shakila",
      age:21
   },
   {
      username:"shakila",
      age:21
   },
   {
      username:"shakila",
      age:21
   },
]
let table=document.createElement("table")
table.style.border="1px solid black"
let tr=document.createElement("tr")
let th1=document.createElement("th")
let th2=document.createElement("th")
th1.innerText="UserName"
th2.innerText="age"
table.appendChild(tr)
tr.append(th1,th2)
data.map((ele)=>{
let tr=document.createElement("tr")
let td1=document.createElement("td")
td1.innerText=ele.username
let td2=document.createElement("td")
td2.innerText=ele.age
tr.append(td1,td2)
table.appendChild(tr)
})


divbox.appendChild(table)







*/

