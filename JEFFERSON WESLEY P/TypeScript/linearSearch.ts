let arr: number[] = [10, 20, 30, 40, 50];
let target: number = 30;

let index: number = -1;

for (let i = 0; i < arr.length; i++) {
    if (arr[i] === target) {
        index = i;
        break;
    }
}

if (index !== -1) {
    console.log("Element found at index:", index);
} else {
    console.log("Element not found");
}