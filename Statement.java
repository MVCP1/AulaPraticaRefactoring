import java.util.Enumeration;

public abstract class Statement {
  public abstract String getResultString1(String name);
  
  public abstract String getResultString2(String title, String charge);
  
  public abstract String getFooterString1(String charge);
  
  public abstract String getFooterString2(String points);
  
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