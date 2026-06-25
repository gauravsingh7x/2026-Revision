
// console.log(window);
// console.log(React);



let h1 = React.createElement("h1", {height:200}, 
    [React.createElement("p", {key:1}, "I'm paragraph tag"),
    React.createElement("span", {key:2}, "I'm Span")],
    [React.createElement("p", {key:3}, "I'm paragraph tag"),
    React.createElement("span", {key:4}, "I'm Span")]
);

// console.log(h1);


const realDOM = document.querySelector("#root");

const reactDOM = ReactDOM.createRoot(realDOM);

reactDOM.render(h1);


//module in js 
import { a, sum } from "./main.js";

console.log(a);

sum(5,10);