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
  
  public CreditCardTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }
  
  @Test
  public void testValidateCardNumber() {
    
  }

  /**
   * Test of getCardType method, of class CreditCard.
   */
  @Test
  public void testGetCardType() {
    
    CreditCard cc = new CreditCard("4111111111111111");
    assertEquals("Visa", cc.getCardType());
    assertEquals("valid", cc.validateCardNumber());
    System.out.println();
    
    CreditCard cc2 = new CreditCard("4111111111111");
    assertEquals("Visa", cc2.getCardType());
    assertEquals("invalid", cc2.validateCardNumber());
    System.out.println();
    
    CreditCard cc3 = new CreditCard("4012888888881881");
    assertEquals("Visa", cc3.getCardType());
    assertEquals("valid", cc3.validateCardNumber());
    System.out.println();
    
    CreditCard cc4 = new CreditCard("378282246310005");
    assertEquals("AMEX", cc4.getCardType());
    assertEquals("valid", cc4.validateCardNumber());
    System.out.println();
    
    CreditCard cc5 = new CreditCard("6011111111111117");
    assertEquals("Discover", cc5.getCardType());
    assertEquals("valid", cc5.validateCardNumber());
    System.out.println();
    
    CreditCard cc6 = new CreditCard("5105105105105100");
    assertEquals("MasterCard", cc6.getCardType());
    assertEquals("valid", cc6.validateCardNumber());
    System.out.println();
    
    CreditCard cc7 = new CreditCard("5105105105105106");
    assertEquals("MasterCard", cc7.getCardType());
    assertEquals("invalid", cc7.validateCardNumber());
    System.out.println();
    
    CreditCard cc8 = new CreditCard("9111111111111111");
    assertEquals("Unknown", cc8.getCardType());
    assertEquals("invalid", cc8.validateCardNumber());
    System.out.println();
    
  }


}
