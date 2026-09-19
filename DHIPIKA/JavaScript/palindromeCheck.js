/**
 * Checks whether a given string is a palindrome. Ignores case and
 * non-alphanumeric characters so phrases like "A man, a plan, a
 * canal: Panama" are correctly detected.
 *
 * @param {string} input - the string to check
 * @returns {boolean} true if input is a palindrome
 */
function isPalindrome(input) {
    const normalized = input.toLowerCase().replace(/[^a-z0-9]/g, "");
    const reversed = normalized.split("").reverse().join("");
    return normalized === reversed;
}

// ---- Demo usage with dynamic sample inputs ----
const sampleStrings = ["racecar", "hello", "A man, a plan, a canal: Panama"];

sampleStrings.forEach((str) => {
    console.log(`"${str}" -> ${isPalindrome(str) ? "Palindrome" : "Not a palindrome"}`);
});

module.exports = { isPalindrome };
