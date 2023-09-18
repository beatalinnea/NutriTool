package controller;

/**
 * This is just an example contoller class. You should remove it.
 */
public class Simple {

  /**
   * Gets a message from the model and tells the view to show it.

   * @param m The model to get message from.
   * @param v The view used to show the message.
   */
  public void doSomethingSimple(model.Client m, view.ConsoleUI v) {
    v.showMessage(m.getMessage());
  }

    public void printClients(model.Nutritionist n, view.ConsoleUI v) {
    v.showClients(n.getClients());
  }
}
