document.getElementById("cardNum").addEventListener("change",function(){
    var cardNum = document.getElementById("cardNum").value;
    var lblError = document.getElementById("lblError")
    var error = ""
    if(isNaN(cardNum)){
        error = "Please enter numberical value"
    }
    else if(cardNum.length!= 16){
        error ="Please enter a 16 digit card number"
    }
    lblError.innerHTML= error
})
document.getElementById("submit").onclick = function(){
    var cvv = document.getElementById("cvv").value;
    if(isNaN(cvv)){
        alert( "Please enter numberical value")
    }
    else if(cvv.length!= 3){
        alert("Please enter a 3 digit cvv")
    }
    else{
        alert("Payment Successful");
    }

}

