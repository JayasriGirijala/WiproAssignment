document.getElementById("bookBtn").addEventListener("click", function() {
    let name = document.getElementById("fullname").value.trim();
    let email = document.getElementById("email").value.trim();
    let destination = document.getElementById("destination").value;
    let days = Number(document.getElementById("days").value);
    let travelers = Number(document.getElementById("travelers").value);

   
    if (!name || !email || !destination || days <= 0 || travelers <= 0) {
        alert("Please fill all fields correctly.");
        return;
    }

   
    let pricePerDay = 0;
    if (destination === "Kerala") pricePerDay = 200;
    else if (destination === "Isha") pricePerDay = 300;
    else if (destination === "Mysore") pricePerDay = 400;

    let totalCost = pricePerDay * days * travelers;

    let summaryDiv = document.getElementById("summary");
    summaryDiv.style.display = "block";
    summaryDiv.innerHTML = `
        <h3>Booking Summary</h3>
        <p><strong>Name:</strong> ${name}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Destination:</strong> ${destination}</p>
        <p><strong>Days:</strong> ${days}</p>
        <p><strong>Travelers:</strong> ${travelers}</p>
        <p><strong>Total Price:</strong> ₹${totalCost}</p>
    `;
});
