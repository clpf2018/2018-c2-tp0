/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package0;

/**
 *
 * @author jandj
 */
public class CreerClient {
     public static void main(String args[]) {
    Client client1;
    client1= new Client.ClientBuilder("2", "Joseph").ville("Beyrouth").build();
    client1.setVille("Mdawar");
    /**
    .phone("1234567")
    .address("Fake address 1234")
    .build();
    */
        System.out.println("Ville M: " + client1.getVille()+client1.getId());
    }
   
}
