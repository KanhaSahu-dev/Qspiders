
function sendMsg(){
    let y = prompt("are you 18+")
    alert("are you sure to send messege? you are "+y)
    let conform = confirm("are you conirm to send messege?");
    if(conform){
        let x = document.createElement("h1");
    console.log(x);
    x.innerText="hii shekhar"
    let body=document.querySelector("body");
    body.appendChild(x);
    x.style.color="hotpink"
    alert("Successfully message sent")
    }  else{
        let i = "you cancelled"
        console.log("You cancelled");
        alert(i);
    }  
}



// defer attribute stops the execution of the code untill it executes what is needed or the body tag.