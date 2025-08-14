let portfolio = {};

document.getElementById("tradeForm").addEventListener("submit", function(event) {
    event.preventDefault();

    let action = document.getElementById("action").value;
    let company = document.getElementById("company").value;
    let shares = parseInt(document.getElementById("shares").value);
    let price = parseFloat(document.getElementById("price").value);
    let outputDiv = document.getElementById("output");

    if (!portfolio[company]) {
        portfolio[company] = { shares: 0, price: 0 };
    }

    if (action === "buy") {
        portfolio[company].shares += shares;
        portfolio[company].price = price;
        outputDiv.innerHTML += `Bought ${shares} shares of ${company} at ₹${price} each.<br>`;
    } 
    else if (action === "sell") {
        if (portfolio[company].shares >= shares) {
            portfolio[company].shares -= shares;
            outputDiv.innerHTML += `Sold ${shares} shares of ${company}.<br>`;
        } else {
            outputDiv.innerHTML += `Not enough shares to sell for ${company}.<br>`;
        }
    }

    updatePortfolioValue();
});

function updatePortfolioValue() {
    let totalValue = 0;
    for (let company in portfolio) {
        totalValue += portfolio[company].shares * portfolio[company].price;
    }
    document.getElementById("portfolioValue").innerHTML = `Portfolio Value: ₹${totalValue}`;
}
