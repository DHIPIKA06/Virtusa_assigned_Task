# DHIPIKA_I — M.Tech Internship Programming Tasks (Team 3)

9 programs across Java, TypeScript, and JavaScript, per the assigned task matrix.
All programs accept dynamic input (via `Scanner`, function parameters, or demo
arrays of sample values) rather than hardcoded single-use data.

## Java
- `FibonacciSeries.java` — generates the Fibonacci series up to N terms (N entered at runtime).
  Run: `javac FibonacciSeries.java && java FibonacciSeries`
- `PascalsTriangle.java` — prints Pascal's Triangle up to N rows (N entered at runtime).
  Run: `javac PascalsTriangle.java && java PascalsTriangle`
- `BankAccount.java` — `Account` class encapsulating balance with `deposit`/`withdraw`;
  menu-driven demo in the `BankAccount` class.
  Run: `javac BankAccount.java && java BankAccount`

## TypeScript
- `employeeCrudService.ts` — `EmployeeService` class simulating create/read/update/delete
  on in-memory employee records.
  Run: `npx ts-node employeeCrudService.ts`
- `removeDuplicateChars.ts` — removes duplicate characters from a string, preserving order.
  Run: `npx ts-node removeDuplicateChars.ts`
- `binaryToDecimal.ts` — converts a binary string to its decimal value, with input validation.
  Run: `npx ts-node binaryToDecimal.ts`

## JavaScript
- `calculateAge.js` — computes age in years from a date-of-birth string.
  Run: `node calculateAge.js`
- `palindromeCheck.js` — checks whether a string is a palindrome (case/punctuation insensitive).
  Run: `node palindromeCheck.js`
- `themeSwitcher.html` — dynamic dark/light mode toggle button; preference persisted via `localStorage`.
  Open directly in a browser.
