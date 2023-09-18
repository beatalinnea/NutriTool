package model;

import java.util.ArrayList;

/**
 * Collects all clients
 */
public class Nutritionist {
    public ArrayList <Client> allClients;

    public Nutritionist () {
        this.allClients  = new ArrayList<Client>();
    }

    public Client addClient (String name, String email) {
        if (checkIfEmailExists(email)) {
            return null;
        }
        Client c = new Client(name, email);
        allClients.add(c);
        return c;
    }

    private boolean checkIfEmailExists(String email) {
        for (Client client : allClients) {
          if (client.getEmail().equals(email)) {
            return true;
          }
        }
        return false;
      }

    public String getClients () {
        return allClients.toString();
    }
}
