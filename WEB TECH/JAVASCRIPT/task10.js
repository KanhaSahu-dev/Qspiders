function checkAge(){
    let age = prompt("Are you 18+ (yes or no)");
    if(age=="yes"){
        age = prompt("Enter your age");
    if(age>=18){
        let crush_name = prompt("Enter your crush_name");
        if(crush_name!=null && crush_name.length>=6){
            let crush_age = prompt("Enter your crush_age");
            if(crush_age>=18 && crush_age!=null){
                let con = confirm("Do you really want to send a messege?");
                if(con){
                    alert("We are Matchmakers, so we want to confirm some details");
                    alert("Please provide the marks of the subjects i am going to give you.");
                    let English = prompt("Enter your English marks");
                    let Math = prompt("Enter your Math marks");
                    let Science = prompt("Enter your Science marks");
                    let Sanskrit = prompt("Enter your Sanskrit marks");
                    let Rocket_sc = prompt("Enter your Rocket_sc marks");
                    let Jujutsu_Kaisen = prompt("Enter your Jujutsu_Kaisen marks");
                    let para=document.querySelector("p");
                    let results = (English+Math+Science+Sanskrit+Rocket_sc+Jujutsu_Kaisen)/6;
                    if(results>90){
                        para.innerText="Your grade is A , Yor are a first class Student"
                        para.style.backgroundColor="green";
                        para.style.color="white";
                        para.style.display="block";
                        para.style.display="flex";
                        para.style.justifyContent="center";
                        para.style.alignItems="center";
                        para.style.fontWeight="bold";
                        para.style.fontSize="18px"
                    }else if(results>75&&results<=90){
                        para.innerText="Your grade is B";
                        para.style.backgroundColor="lightgreen";
                    }else if(results>55&&results<=75){
                        para.innerText="Your grade is C";
                        para.style.backgroundColor="yellow"
                        para.style.display="block";
                        para.style.display="flex";
                        para.style.justifyContent="center";
                        para.style.alignItems="center";
                        para.style.fontWeight="bold";
                        para.style.fontSize="18px"
                        para.style.color="black";
                    }else if(results>35&&results<=55){
                        para.innerText="Your grade is D";
                        para.style.backgroundColor="pink";
                        para.style.display="block";
                        para.style.display="flex";
                        para.style.justifyContent="center";
                        para.style.alignItems="center";
                        para.style.fontWeight="bold";
                        para.style.fontSize="18px"
                        para.style.color="maroon";
                    }else{
                        para.innerText="Please dont mention your marks.";
                        para.style.backgroundColor="gold";
                        para.style.display="block";
                        para.style.display="flex";
                        para.style.justifyContent="center";
                        para.style.alignItems="center";
                        para.style.fontWeight="bold";
                        para.style.fontSize="18px"
                        para.style.color="maroon";
                    }
                    if(results>35){
                        alert("Young boy, You are really a good match for the girl have some courage and go for it.")
                    }else{
                        alert("Dont embarass yourself by proposing her.")
                    }
                }else{
                    alert("You cancelled , tata bye bye.")
                }
            }else{
                alert(`Sorry, Please wait for ${18-crush_age} years😉`);
            }
        }
        else{
            alert("Please Enter a valid crush_name whose (length>6)");
        }
    }else{
        alert("Sorry, You are not 18+");
    }
}else{
    alert("You are not 18")
}
}