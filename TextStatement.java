import java.util.Enumeration;

public class TextStatement extends Statement {
  public String getResultString1(String name){
    return "Rental Record for " + name +
    "\n";
  }
  
  public String getResultString2(String title, String charge){
    return "\t" + title+ "\t" +
      charge + "\n";
  }
  
  public String getFooterString1(String charge){
    return "Amount owed is " +
    charge + "\n";
  }
  
  public String getFooterString2(String points){
    return "You earned " +
    points +
    " frequent renter points";
  }

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getResultString1(aCustomer.getName());
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      //show figures for this rental
      result += getResultString2(each.getMovie().getTitle(), String.valueOf(each.getCharge()));
    }
    //add footer lines
    result += getFooterString1(String.valueOf(aCustomer.getTotalCharge()));
    result += getFooterString2(String.valueOf(aCustomer.getTotalFrequentRenterPoints()));
    return result;
  }
}