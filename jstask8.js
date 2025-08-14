const buildingName = "Sunrise Apartments";

let status;

const devices = ["Light", "Fan", "AC"];

let output = "";

for (var i = 0; i < devices.length; i++) {
    status = (i % 2 === 0) ? "ON" : "OFF";
    output += `Checking Switch ${i + 1}: ${devices[i]} is ${status}\n`;
}

output += `All switches checked for ${buildingName}.\n`;
output += `Outside loop: var counter is ${i}\n`;

try {
    buildingName = "Sunset Apartments";
} catch (error) {
    output += `Error: ${error.message}\n`;
}

document.getElementById("output").textContent = output;
