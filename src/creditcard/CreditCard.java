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
  private Boolean mCardNumberValid;
  
  public CreditCard (String pCardNumber) {
    this.mCardNumber = pCardNumber;
  }

  /**
   * @return the mCardNumber
   */
  public String getCardNumber() {
    return mCardNumber;
  }

  /**
   * @param mCardNumber the mCardNumber to set
   */
  public void setCardNumber(String mCardNumber) {
    this.mCardNumber = mCardNumber;
  }

  /**
   * @return the mCardType
   */
  public String getCardType() {
    return mCardType;
  }

  /**
   * @param mCardType the mCardType to set
   */
  public void setCardType(String mCardType) {
    this.mCardType = mCardType;
  }

  /**
   * @return the mCardNumberValid
   */
  public Boolean getCardNumberValid() {
    if (this.mCardNumberValid == null) {
      return false;
    }
    return mCardNumberValid;
  }

  /**
   * @param mCardNumberValid the mCardNumberValid to set
   */
  public void setCardNumberValid(Boolean mCardNumberValid) {
    this.mCardNumberValid = mCardNumberValid;
  }
  
}
