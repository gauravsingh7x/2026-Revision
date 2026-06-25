

// console.log(React);


import React from "react";

let root = document.querySelector("#root");

const h1 = React.createElement("h1", null, "I'm heading 1");

ReactDOM.createRoot(root).render(h1);
