

document.getElementById("submit").onclick = function(){
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var result = "";
    if(username.length==0){
        result = "Usename cannot be blank";
    }
    else if(password.length ==0){
        result = "Password cannot be blank";
    }
    else{
        result = "Hello "+username;
    }
    alert(result);
};


document.getElementById("submit1").onclick = function(){
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var result = "";
    if(username!=="Helloworld"){
        result = "Wrong username";
    }
    else if(password!=="Hell0There"){
        result = "Wrong Password";
    }
    else{
        result = "Hello "+username;
    }
    alert(result);
};