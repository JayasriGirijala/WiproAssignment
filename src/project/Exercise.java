package project;

//Abstract class
abstract class Person {
 public abstract void eat();
 public abstract void exercise();
}

//Subclass: Athlete
class Athlete extends Person {
 @Override
 public void eat() {
     System.out.println("Athlete eats a high-protein, balanced diet.");
 }

 @Override
 public void exercise() {
     System.out.println("Athlete exercises daily with intense training.");
 }
}

//Subclass: LazyPerson
class LazyPerson extends Person {
 @Override
 public void eat() {
     System.out.println("Lazy person eats junk food and skips meals.");
 }

 @Override
 public void exercise() {
     System.out.println("Lazy person rarely exercises and prefers lying on the couch.");
 }
}

//Main class
public class Exercise {
 public static void main(String[] args) {
     Person athlete = new Athlete();
     athlete.eat();
     athlete.exercise();

     System.out.println();

     Person lazy = new LazyPerson();
     lazy.eat();
     lazy.exercise();
 }
}
/*Athlete eats a high-protein, balanced diet.
Athlete exercises daily with intense training.

Lazy person eats junk food and skips meals.
Lazy person rarely exercises and prefers lying on the couch.
*/
