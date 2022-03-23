

function loadCart(){
    var table= document.getElementById("cart-content");
    var productName = ["apple","orange","pear"];
    var productQty = [1,4,3];
    var unitPrice = [0.7,0.5,1];
    var result = "";
    var row ="";
    for(i = 0 ; i< productName.length;i++){
        row = table.insertRow();
        var cell = row.insertCell();
        cell.innerHTML= i+1;
        cell= row.insertCell(); 
        cell.innerHTML = productName[i];
        cell= row.insertCell(); 
        cell.innerHTML = productQty[i];
        cell= row.insertCell(); 
        cell.innerHTML = "$"+(productQty[i]*unitPrice[i]);       
    }

}

