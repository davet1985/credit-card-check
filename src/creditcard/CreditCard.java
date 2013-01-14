package creditcard;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave
 */
public class CreditCard {
  
  private String mCardNumber;
  private String mCardType;
  
  public CreditCard (String pCardNumber) {
    this.mCardNumber = pCardNumber;
  }
  
  /**
   * 
   * @return the mCardType
   */
  public String getCardType() {
    // set to Unknown by default
    this.mCardType = "Unknown";
    
    // first indicator is the number length
    switch (this.mCardNumber.length()) {
      case 13:
        //second indicator is the the start of the number
        if (this.mCardNumber.startsWith("4")) {
          this.mCardType = "Visa";
        }
        break;
      case 15:
        if (this.mCardNumber.startsWith("34") || this.mCardNumber.startsWith("37")) {
          this.mCardType = "AMEX";
        }
        break;
      case 16:
        if (this.mCardNumber.startsWith("4")) {
          this.mCardType = "Visa";
        }
        if (this.mCardNumber.startsWith("6011")) {
          this.mCardType = "Discover";
        }
        if (this.mCardNumber.startsWith("51") || this.mCardNumber.startsWith("52") || this.mCardNumber.startsWith("53") || this.mCardNumber.startsWith("54") || this.mCardNumber.startsWith("55")) {
          this.mCardType = "MasterCard";
        }
        break;
    }
    
    System.out.print(this.mCardType+": "+this.mCardNumber);
    //once the card type has been discovered return it.
    return this.mCardType;
  }
  
  public String validateCardNumber() {
    
    int count = 0;
    //loop over each digit in the card number
    for (int i=this.mCardNumber.length(); i>0; i--) {
      //if it is the last digit or every other one then leave it untouched and add to the count
      if ((this.mCardNumber.length()-i) % 2 == 0 ) {
          count+=Integer.parseInt(this.mCardNumber.substring(i-1, i));
      }
      //double the second to last digit and every other and add to the count
      else {
        //if the doubled digit is > 10, we must add the individual digits together and then add to the count
        if (String.valueOf(Integer.parseInt(this.mCardNumber.substring(i-1, i)) * 2).length() == 2) {
          count += Integer.parseInt(String.valueOf(Integer.parseInt(this.mCardNumber.substring(i-1, i)) * 2).substring(0, 1)) + Integer.parseInt(String.valueOf(Integer.parseInt(this.mCardNumber.substring(i-1, i)) * 2).substring(1, 2));
        } else {
          count += Integer.parseInt(this.mCardNumber.substring(i-1, i)) * 2;
        }
      }
    }
    
    // if the total count in a multiple of 10 it is valid
    if (count%10 == 0) {
      System.out.print(" (valid)");
      return "valid";
    } else {
      System.out.print(" (invalid)");
      return "invalid";
    }
    
  }

  /**
   * @return the mCardNumber
   */
  public String getmCardNumber() {
    return mCardNumber;
  }

  /**
   * @param mCardNumber the mCardNumber to set
   */
  public void setmCardNumber(String mCardNumber) {
    this.mCardNumber = mCardNumber;
  }

  /**
   * @return the mCardType
   */
  public String getmCardType() {
    return mCardType;
  }

  /**
   * @param mCardType the mCardType to set
   */
  public void setmCardType(String mCardType) {
    this.mCardType = mCardType;
  }
  
}
