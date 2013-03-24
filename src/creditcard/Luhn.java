/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcard;

/**
 *
 * @author Dave
 */
public class Luhn {
  
  public Luhn() {
    
  }
  
  public String getCardType(String pCardNumber) {
    // set to Unknown by default
    String lCardType = "Unknown";
    
    // first indicator is the number length
    switch (pCardNumber.length()) {
      case 13:
        //second indicator is the the start of the number
        if (pCardNumber.startsWith("4")) {
          lCardType = "Visa";
        }
        break;
      case 15:
        if (pCardNumber.startsWith("34") || pCardNumber.startsWith("37")) {
          lCardType = "AMEX";
        }
        break;
      case 16:
        if (pCardNumber.startsWith("4")) {
          lCardType = "Visa";
        }
        if (pCardNumber.startsWith("6011")) {
          lCardType = "Discover";
        }
        if (pCardNumber.startsWith("51") || pCardNumber.startsWith("52") || pCardNumber.startsWith("53") || pCardNumber.startsWith("54") || pCardNumber.startsWith("55")) {
          lCardType = "MasterCard";
        }
        break;
    }
    
    System.out.print(lCardType + ": " + pCardNumber);
    //once the card type has been discovered return it.
    return lCardType;
  }
  
  public Boolean validateCardNumber(String pCardNumber) {
    
    int count = 0;
    //loop over each digit in the card number
    for (int i=pCardNumber.length(); i>0; i--) {
      //if it is the last digit or every other one then leave it untouched and add to the count
      if ((pCardNumber.length()-i) % 2 == 0 ) {
          count+=Integer.parseInt(pCardNumber.substring(i-1, i));
      }
      //double the second to last digit and every other and add to the count
      else {
        //if the doubled digit is > 10, we must add the individual digits together and then add to the count
        if (String.valueOf(Integer.parseInt(pCardNumber.substring(i-1, i)) * 2).length() == 2) {
          count += Integer.parseInt(String.valueOf(Integer.parseInt(pCardNumber.substring(i-1, i)) * 2).substring(0, 1)) + Integer.parseInt(String.valueOf(Integer.parseInt(pCardNumber.substring(i-1, i)) * 2).substring(1, 2));
        } else {
          count += Integer.parseInt(pCardNumber.substring(i-1, i)) * 2;
        }
      }
    }
    
    // if the total count in a multiple of 10 it is valid
    if (count%10 == 0) {
      System.out.print(" (valid)");
      return true;
    } else {
      System.out.print(" (invalid)");
      return false;
    }
    
  }
  
}
