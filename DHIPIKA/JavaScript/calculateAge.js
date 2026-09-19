/**
 * Calculates a person's age in full years given their date of birth.
 *
 * @param {string} dobString - date of birth in "YYYY-MM-DD" format
 * @param {Date} [referenceDate=new Date()] - date to measure age against
 * @returns {number} age in completed years
 */
function calculateAge(dobString, referenceDate = new Date()) {
    const dob = new Date(dobString);

    if (isNaN(dob.getTime())) {
        throw new Error(`Invalid date of birth: "${dobString}"`);
    }

    let age = referenceDate.getFullYear() - dob.getFullYear();
    const monthDifference = referenceDate.getMonth() - dob.getMonth();
    const dayDifference = referenceDate.getDate() - dob.getDate();

    // Subtract a year if the birthday hasn't occurred yet this year.
    if (monthDifference < 0 || (monthDifference === 0 && dayDifference < 0)) {
        age--;
    }

    return age;
}

// ---- Demo usage with dynamic sample inputs ----
const sampleDobs = ["2003-06-15", "1998-11-30", "2000-01-01"];

sampleDobs.forEach((dob) => {
    console.log(`DOB ${dob} -> Age: ${calculateAge(dob)}`);
});

module.exports = { calculateAge };
