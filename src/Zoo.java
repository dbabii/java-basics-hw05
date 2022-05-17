import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type.
   */
  public static void feed(List<?> list) {
    System.out.println("Feeding birds");
    for (Object birdVal : list) {
      System.out.println("Feeding bird " + birdVal);
    }
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type.
   * @param bird a new bird.
   */
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    System.out.println("Accepting a bird to a section");
    bird.checkWings();
    list.add(bird);
    System.out.println("Bird is added to list " + bird);
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List<? super Bird> list, Bird newBird) {
    System.out.println("Adding a bird to the birds list");
    list.add(newBird);
    for(Object birdVal : list) {
      System.out.println("There is " + newBird + " bird in the list");
    }
  }
}