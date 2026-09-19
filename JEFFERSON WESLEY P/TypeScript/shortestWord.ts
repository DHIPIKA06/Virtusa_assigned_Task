let sentence: string = "I am learning TypeScript";

let words: string[] = sentence.split(" ");
let shortest: string = words[0];

for (let word of words) {
    if (word.length < shortest.length) {
        shortest = word;
    }
}

console.log("Shortest word:", shortest);