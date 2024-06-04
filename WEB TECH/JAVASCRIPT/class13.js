// Whenever we want to submit the form and not connect it to the server then we have to write event.preventDefaultDefault()

let form = document.querySelector("form")
form.addEventListener("submit", (event)=>{
    event.preventDefault()
    let username = document.querySelector("#username").value
    let email = document.querySelector("#email").value
    let password = document.querySelector("#password").value
    console.log(username);
    console.log(password);
    console.log(email);
    // let obj={
    //     [username.name]:username.value,
    //     [email.name]:email.value,
    //     [password.name]:password.value
    // }
    let obj={
        "yo":"hii"
    }
    //adtkp13010081
    console.log(obj);
})

// event bubbling
// 3rd argument true and false.
// event propagation
// stop propagation
// setTimeout

// form validation ,name , object creation dynamically,preventdefault(),form validation

//event bubbling capturing stop propagation 

// Math random, floor round , ceil

// bom, settimeout, setinterval

// mock form event bom