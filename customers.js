document.getElementById("manageBtn").addEventListener("click", function() {
  let names = ["Sravanthi", "Jayasri", "Vyshu", "Divya", "Bhavana"];
  let customers = [...names];

  let output = "";

  output += `Original Customers: ${customers.join(", ")}\n`;

  output += `Customers using for...of:\n`;
  for (let cust of customers) {
    output += cust + "\n";
  }

  output += `Customer IDs using for...in:\n`;
  for (let id in customers) {
    output += id + "\n";
  }

  customers.push("Anita");
  output += `After push('Anita'): ${customers.join(", ")}\n`;

  customers.pop();
  output += `After pop(): ${customers.join(", ")}\n`;

  let insertPos = parseInt(prompt(`Enter position to insert new customer 'Vikram' (0 to ${customers.length}):`));
  while (isNaN(insertPos) || insertPos < 0 || insertPos > customers.length) {
    insertPos = parseInt(prompt(`Invalid position. Enter position (0 to ${customers.length}):`));
  }
  customers.splice(insertPos, 0, "Vikram");
  output += `After insert 'Vikram' at position ${insertPos}: ${customers.join(", ")}\n`;

  let deletePos = parseInt(prompt(`Enter position to delete customer (0 to ${customers.length - 1}):`));
  while (isNaN(deletePos) || deletePos < 0 || deletePos >= customers.length) {
    deletePos = parseInt(prompt(`Invalid position. Enter position (0 to ${customers.length - 1}):`));
  }
  customers.splice(deletePos, 1);
  output += `After delete at position ${deletePos}: ${customers.join(", ")}\n`;

  output += `Final Customers: ${customers.join(", ")}`;

  document.getElementById("output").textContent = output;
});
