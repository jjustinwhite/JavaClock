public class UseClock {
  public static void main(String[ ] args) {
    Clock ticktock;
 System.out.println("Testing default constructor\n");
    ticktock = new Clock();
    for (int i=0; i<60; i++) {
      ticktock.tick();
      System.out.println(ticktock);
    }
 System.out.println("\nTesting 3 argument constructor\n");
    ticktock = new Clock(11, 50, "am");
    System.out.println(ticktock);
    for (int i=0; i<10; i++) {
      ticktock.tick();
      System.out.println(ticktock);
    }

 System.out.println("\nTesting 3 argument constructor again\n");
    ticktock = new Clock(11, 50, "pm");
    System.out.println(ticktock);
    for (int i=0; i<10; i++) {
      ticktock.tick();
      System.out.println(ticktock);
    }

  }
}