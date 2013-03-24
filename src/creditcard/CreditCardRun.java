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
    Luhn luhn = new Luhn();
    CreditCard cc = new CreditCard("4111111111111111");
    cc.setCardType(luhn.getCardType(cc.getCardNumber()));
    cc.setCardNumberValid(luhn.validateCardNumber(cc.getCardNumber()));
  }
  
}
