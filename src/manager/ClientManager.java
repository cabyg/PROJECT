/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entity.Client;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ClientManager {
    
    private final Scanner scanner = new Scanner(System.in);
    
    public Client addClient(){
        Client client = new Client();
        System.out.println("First name");
        client.setFirstname(scanner.nextLine());
        System.out.println("Surname");
        client.setLastname(scanner.nextLine());
        System.out.println("cash");
        client.setCash(scanner.nextInt());scanner.nextLine();
        return client;
    }

    public void printListClients(Client[] client) {
        for (int i = 0; i < client.length; i++) {
            Client c = client[i];
            System.out.printf(i+1+".%s %s %s%n"
                    ,c.getFirstname()
                    ,c.getLastname()
                    ,c.getCash()
            );
        }
    }
}