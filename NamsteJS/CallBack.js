setTimeout(function (){
    console.log("Times");
},5000);

function x (y){
    console.log("X");
    y();
}
x(function y (){
    console.log("Y");
})