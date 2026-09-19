/**
 * Converts a binary number (given as a string) to its decimal
 * equivalent. Validates that the input contains only 0s and 1s.
 *
 * @param binary the binary string to convert (e.g. "1011")
 * @returns the decimal value as a number
 * @throws Error if the input is not a valid binary string
 */
function binaryToDecimal(binary: string): number {
    if (!/^[01]+$/.test(binary)) {
        throw new Error(`Invalid binary string: "${binary}"`);
    }

    let decimalValue = 0;
    for (const digit of binary) {
        decimalValue = decimalValue * 2 + Number(digit);
    }
    return decimalValue;
}

// ---- Demo usage with a few different sample inputs ----
const sampleBinaries = ["1011", "100000", "11111111"];

for (const sample of sampleBinaries) {
    console.log(`${sample} (binary) -> ${binaryToDecimal(sample)} (decimal)`);
}

export { binaryToDecimal };
