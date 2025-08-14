alert("Welcome to the Quiz Game!");

let userName = prompt("What's your name?");
if (!userName) userName = "Player";

let ready = confirm("Hi " + userName + ", are you ready for the quiz?");

if (ready) {
  let answer = prompt(
    "Who is the Deputy Chief Minister of Andhra Pradesh?\n" +
    "A. Y.S. Jagan Mohan Reddy\n" +
    "B. Pawan Kalyan\n" +
    "C. Nara Chandrababu Naidu\n" +
    "D. K. Raghu Rama Krishna Raju\n\n" +
    "Enter A, B, C, or D:"
  );

  if (answer === "B" || answer === "b") {
    alert("Correct! Pawan Kalyan is the Deputy Chief Minister of Andhra Pradesh.");
  } else {
    alert("Wrong answer. The correct answer is B. Pawan Kalyan.");
  }
} else {
  alert("No problem! Come back when you're ready.");
}
