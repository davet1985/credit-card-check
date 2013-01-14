/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcard;

/**
 *
 * @author Dave
 */
public class CreditCardRun {
  
  public static void main(String[] args) {
    CreditCard cc = new CreditCard("4417123456789112");
    System.out.println(cc.getCardType());
    System.out.println(cc.validateCardNumber());
  }
  
}
