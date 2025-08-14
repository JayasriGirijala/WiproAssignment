const taxRecords = [];

function calculateTax(name, pan, income, callback) {
    let tax = 0;

    if (income <= 250000) tax = 0;
    else if (income <= 500000) tax = (income - 250000) * 0.05;
    else if (income <= 1000000) tax = 250000 * 0.05 + (income - 500000) * 0.2;
    else tax = 250000 * 0.05 + 500000 * 0.2 + (income - 1000000) * 0.3;

    const result = { name, pan, income, tax };
    callback(result);
}

function logToConsole(result) {
    console.log(`Name: ${result.name}, PAN: ${result.pan}, Income: ₹${result.income}, Tax: ₹${result.tax.toFixed(2)}`);
}

function displayOnPage(result) {
    document.getElementById("result").textContent = 
        `Name: ${result.name}\nPAN: ${result.pan}\nIncome: ₹${result.income}\nTax: ₹${result.tax.toFixed(2)}`;
}

function saveToRecords(result) {
    taxRecords.push(result);
    console.log("Current Tax Records:", JSON.stringify(taxRecords, null, 2));
}

document.getElementById("calculateBtn").addEventListener("click", function() {
    const name = document.getElementById("name").value.trim();
    const pan = document.getElementById("pan").value.trim();
    const income = Number(document.getElementById("income").value);

    if (!name || !pan || !income) {
        alert("Please fill all fields correctly.");
        return;
    }

    calculateTax(name, pan, income, function(result) {
        logToConsole(result);
        displayOnPage(result);
        saveToRecords(result);
    });
});
