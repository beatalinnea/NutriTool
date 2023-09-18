package controller;

/**
 * Responsible for staring the application.
 */
public class App {
  /**
   * Application starting point.

   * @param args command line arguments.
   */
  public static void main(String[] args) {
    // adapt to start the application in your way
    model.Client m = new model.Client("beata", "be222gr@student.lnu.se");
    Simple c = new Simple();
    view.ConsoleUI v = new view.ConsoleUI();
    model.Nutritionist n = new model.Nutritionist();
    n.addClient("beata", "be222gr@student.lnu.se");

    c.doSomethingSimple(m, v);
    c.printClients(n, v);
  }
}
