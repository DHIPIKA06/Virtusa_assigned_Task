"use strict";
let sentence = "I am learning TypeScript";
let words = sentence.split(" ");
let shortest = words[0];
for (let word of words) {
    if (word.length < shortest.length) {
        shortest = word;
    }
}
console.log("Shortest word:", shortest);
