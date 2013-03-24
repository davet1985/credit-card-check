/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcard;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dave
 */
public class CreditCardTest {
  
  Luhn luhn = new Luhn();
  
  public CreditCardTest() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getCardType method, of class CreditCard.
   */
  @Test
  public void testGetCardTypeAndValidate() {
    
    Luhn luhn = new Luhn();
    
    CreditCard cc = new CreditCard("4111111111111111");
    cc.setCardType(luhn.getCardType(cc.getCardNumber()));
    cc.setCardNumberValid(luhn.validateCardNumber(cc.getCardNumber()));
    
    assertEquals("Visa", cc.getCardType());
    assertEquals(Boolean.TRUE, cc.getCardNumberValid());
    System.out.println();
    
    CreditCard cc2 = new CreditCard("4111111111111");
    cc2.setCardType(luhn.getCardType(cc2.getCardNumber()));
    cc2.setCardNumberValid(luhn.validateCardNumber(cc2.getCardNumber()));
    assertEquals("Visa", cc2.getCardType());
    assertEquals(Boolean.FALSE, cc2.getCardNumberValid());
    System.out.println();
    
    CreditCard cc3 = new CreditCard("4012888888881881");
    cc3.setCardType(luhn.getCardType(cc3.getCardNumber()));
    cc3.setCardNumberValid(luhn.validateCardNumber(cc3.getCardNumber()));
    assertEquals("Visa", cc3.getCardType());
    assertEquals(Boolean.TRUE, cc3.getCardNumberValid());
    System.out.println();
    
    CreditCard cc4 = new CreditCard("378282246310005");
    cc4.setCardType(luhn.getCardType(cc4.getCardNumber()));
    cc4.setCardNumberValid(luhn.validateCardNumber(cc4.getCardNumber()));
    assertEquals("AMEX", cc4.getCardType());
    assertEquals(Boolean.TRUE, cc4.getCardNumberValid());
    System.out.println();
    
    CreditCard cc5 = new CreditCard("6011111111111117");
    cc5.setCardType(luhn.getCardType(cc5.getCardNumber()));
    cc5.setCardNumberValid(luhn.validateCardNumber(cc5.getCardNumber()));
    assertEquals("Discover", cc5.getCardType());
    assertEquals(Boolean.TRUE, cc5.getCardNumberValid());
    System.out.println();
    
    CreditCard cc6 = new CreditCard("5105105105105100");
    cc6.setCardType(luhn.getCardType(cc6.getCardNumber()));
    cc6.setCardNumberValid(luhn.validateCardNumber(cc6.getCardNumber()));
    assertEquals("MasterCard", cc6.getCardType());
    assertEquals(Boolean.TRUE, cc6.getCardNumberValid());
    System.out.println();
    
    CreditCard cc7 = new CreditCard("5105105105105106");
    cc7.setCardType(luhn.getCardType(cc7.getCardNumber()));
    cc7.setCardNumberValid(luhn.validateCardNumber(cc7.getCardNumber()));
    assertEquals("MasterCard", cc7.getCardType());
    assertEquals(Boolean.FALSE, cc7.getCardNumberValid());
    System.out.println();
    
    CreditCard cc8 = new CreditCard("9111111111111111");
    cc8.setCardType(luhn.getCardType(cc8.getCardNumber()));
    cc8.setCardNumberValid(luhn.validateCardNumber(cc8.getCardNumber()));
    assertEquals("Unknown", cc8.getCardType());
    assertEquals(Boolean.FALSE, cc8.getCardNumberValid());
    System.out.println();
    
  }


}
