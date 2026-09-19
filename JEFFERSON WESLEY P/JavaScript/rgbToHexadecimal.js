let r = 255;
let g = 165;
let b = 0;

let hex = "#" +
    r.toString(16).padStart(2, "0") +
    g.toString(16).padStart(2, "0") +
    b.toString(16).padStart(2, "0");

console.log("Hexadecimal:", hex);