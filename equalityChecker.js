document.getElementById("compareBtn").addEventListener("click", function() {
  let val1 = prompt("Enter first value:");
  let val2 = prompt("Enter second value:");

  let val1Num = Number(val1);
  let val2Num = Number(val2);

  let output = "";

  output += `First Value: ${val1} (${typeof val1})\n`;
  output += `Second Value: ${val2} (${typeof val2})\n\n`;

  output += `Using == : ${val1 == val2}  → Equality ignores type\n`;
  output += `Using === : ${val1 === val2} → Strict equality checks type too\n`;
  output += `Using != : ${val1 != val2}  → Values considered ${val1 != val2 ? 'not equal' : 'equal'}\n`;
  output += `Using !== : ${val1 !== val2} → Strict inequality because types ${val1 !== val2 ? 'differ' : 'are same'}\n\n`;

  output += `Number conversion:\n`;
  output += `Number("${val1}") = ${val1Num} (${typeof val1Num})\n`;
  output += `Number("${val2}") = ${val2Num} (${typeof val2Num})\n`;

  document.getElementById("output").textContent = output;
});
