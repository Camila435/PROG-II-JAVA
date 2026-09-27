package Proyectos.casting;

class Animal {  void makeNoise() {System.out.println("generic noise"); }
}
class Dog extends Animal {
  void makeNoise() {System.out.println("bark"); }
  void playDead() { System.out.println("roll over"); }
}
class CastTest2 {
  public static void main(String [] args) {
    Animal [] a = {new Animal(), new Dog(), new Animal() };
    for(Animal animal : a) { //for adaptado
      animal.makeNoise();
     //* */ if(animal instanceof Dog) {
       // animal.playDead();       //error 
     // }  
     if(animal instanceof Dog) {  
  
    Dog d = (Dog) animal;    // para que compile el programa anterior reemplazar lo rojo con  					    // esto
    d.playDead();
    }
    }
  }
}
