/**
 * Auto Generated Java Class.
 */
public class AnimalCollection {
  private Animal[] animals;
  
  public AnimalCollection() { 
    animals = null;
  }
  
  public AnimalCollection(Animal[] a) { 
    animals = a;
  }
  
  public Animal[] getAnimals(){
    return this.animals;
  }
  
  public void addAnimal(Animal a){
    for(int i=0;i<animals.length;i++){
      if(animals[i] == null){
        animals[i] = a;
        return;
      }
    }
  }
  public void removeAnimal(Animal a){ //SHOULD REMOVE JUST BASED ON NAME
    for(int i=0;i<animals.length;i++){
      if(animals[i] != null && animals[i].equals(a)){
        animals[i] = null;
        return;
      }
    }
    System.out.println("The animal was not found.");
  }
  
  public static void printAnimals(AnimalCollection ac)
  {
    for(Animal a : ac.getAnimals())
    {
      if(a == null)
        continue;
      System.out.println(a);
      System.out.println();
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
