document.getElementById("startBtn").addEventListener("click", function() {
  let fullName = prompt("Enter your Full Name:");
  let pan = prompt("Enter your PAN Number (10 characters, uppercase):");

  function isValidPAN(pan) {
    const panRegex = /^[A-Z]{5}[0-9]{4}[A-Z]{1}$/;
    return pan.length === 10 && panRegex.test(pan);
  }

  while (!isValidPAN(pan)) {
    pan = prompt("Invalid PAN! Enter valid PAN (10 characters, uppercase, format: AAAAA9999A):");
  }

  let dobInput = prompt("Enter your Date of Birth (YYYY-MM-DD):");
  let dob = new Date(dobInput);
  while (isNaN(dob.getTime())) {
    dobInput = prompt("Invalid Date! Enter Date of Birth in YYYY-MM-DD format:");
    dob = new Date(dobInput);
  }

  function calculateAge(dob) {
    let diff = Date.now() - dob.getTime();
    let ageDt = new Date(diff);
    return Math.abs(ageDt.getUTCFullYear() - 1970);
  }

  let age = calculateAge(dob);

  let incomeInput = prompt("Enter your Annual Income (number):");
  let annualIncome = Number(incomeInput);

  while (isNaN(annualIncome) || annualIncome < 0) {
    incomeInput = prompt("Invalid Income! Enter your Annual Income (positive number):");
    annualIncome = Number(incomeInput);
  }

  function calculateTax(income) {
    let tax = 0;

    if (income <= 250000) {
      tax = 0;
    } else if (income <= 500000) {
      tax = (income - 250000) * 0.05;
    } else if (income <= 1000000) {
      tax = (250000 * 0.05) + (income - 500000) * 0.20;
    } else {
      tax = (250000 * 0.05) + (500000 * 0.20) + (income - 1000000) * 0.30;
    }

    return Math.round(tax);
  }

  let taxAmount = calculateTax(annualIncome);

  document.getElementById("output").textContent =
    `Name: ${fullName.toUpperCase()}\n` +
    `PAN: ${pan}\n` +
    `Age: ${age} years\n` +
    `Annual Income: ₹${annualIncome}\n` +
    `Calculated Tax: ₹${taxAmount}`;
});
