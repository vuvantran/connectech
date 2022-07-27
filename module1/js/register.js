

document.getElementById("submit").onclick = function(){
    var username = document.getElementById("username").value;
    var name = document.getElementById("name").value;
    var email = document.getElementsById("email").value;
    var dob = document.getElementById("dob").value;
    var password = document.getElementById("password").value;
    var cfmpassword = document.getElementById("cfmpassword").value;
    var gender = document.querySelector('input[name="gender"]:checked').value;
    var website = document.querySelector("#website:checked").value;
    var marketing = document.querySelector("#marketing:checked").value;
    var result = "";
    if (username== name){
        result = "Username cannot be the same as name";
    }
    else if(password!== cfmpassword){
        result="Your password does not match";
    }
    else{
        result ="Welcome "+name+" have successfully created an account with the username of "
            + username+" your date of birth is "+ dob+", gender is "+ gender+", agree to  "
            + website+" "+ marketing+" agreement, and your email is "+email;
    }
    alert(result);
};


