/**
 * Removes duplicate characters from a string while preserving the
 * order in which each character first appeared.
 *
 * @param input any string (accepted dynamically, not hardcoded)
 * @returns a new string with duplicates removed
 */
function removeDuplicateChars(input: string): string {
    const seen = new Set<string>();
    let result = "";

    for (const char of input) {
        if (!seen.has(char)) {
            seen.add(char);
            result += char;
        }
    }
    return result;
}

// ---- Demo usage with a few different sample inputs ----
const sampleInputs = ["programming", "aabbccddee", "TypeScript"];

for (const sample of sampleInputs) {
    console.log(`"${sample}" -> "${removeDuplicateChars(sample)}"`);
}

export { removeDuplicateChars };
