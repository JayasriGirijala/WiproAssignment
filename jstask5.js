let books = [
  { title: "JavaScript Basics", author: "Anu", price: 450, available: true },
  { title: "HTML & CSS", author: "Devi", price: 350, available: false }
];

const out = document.getElementById("out");
function print(msg) { out.textContent += msg + "\n"; }

print("All Books:");
for (let b of books) {
  print(`Title: ${b.title}, Author: ${b.author}, Price: ${b.price}, Available: ${b.available}`);
}

print("\nAvailable Books:");
for (let b of books) {
  if (b.available) {
    print(`Title: ${b.title}, Author: ${b.author}, Price: ${b.price}`);
  }
}

let newBook = { title: "Node.js Guide", author: "Kiran", price: 650, available: true };
books.push(newBook);

print("\nAfter Adding:");
print(books.map(b => b.title).join(", "));

let bookToUpdate = "JavaScript Basics";
for (let b of books) {
  if (b.title === bookToUpdate) {
    b.price = 500;
    print("\nAfter Price Update:");
    print(`${b.title} - ${b.price} ₹`);
  }
}

let bookToDelete = "JavaScript Basics";
books = books.filter(b => b.title !== bookToDelete);

print("\nAfter Deletion:");
print(books.map(b => b.title).join(", "));
