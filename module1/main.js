const queryString = window.location.search;
const urlParams = new URLSearchParams(queryString);
const previousKeyword = urlParams.get('keyword')


// Get the input field
var input = document.getElementById("inputSearch");

// Set previous search keyword to search box
input.value= previousKeyword;

// Execute a function when the user releases a key on the keyboard
input.addEventListener("keyup", function(event) {

  // Number 13 is the "Enter" key on the keyboard
  if (event.keyCode === 13) {
    // Cancel the default action, if needed
    event.preventDefault();

    const keyword = input.value;
    if (window.location.href.includes("product_list")) {
      const newQueryString = window.location.search;
      const newUrlParams = new URLSearchParams(newQueryString);
      newUrlParams.set('keyword', keyword);
      window.location.search = newUrlParams;
    } else {
      window.location.href = "html/product_list.html?keyword=" + keyword;
    }
  }
});