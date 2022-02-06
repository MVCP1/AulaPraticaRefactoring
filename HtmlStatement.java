import java.util.Enumeration;

public class HtmlStatement extends Statement {
  public String getResultString1(String name){
    return "<H1>Rentals for <EM>" + name +
    "</EM></H1><P>\n";
  }

  public String getResultString2(String title, String charge){
    return title + ": " +
        charge + "<BR>\n";
  }
  
  public String getFooterString1(String charge){
    return "<P>You owe <EM>" +
    charge + "</EM><P>\n";
  }
  
  public String getFooterString2(String points){
    return "On this rental you earned <EM>" + 
    points +
    "</EM> frequent renter points<P>";
  }

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getResultString1(aCustomer.getName());
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      //show figures for each rental
      result += getResultString2(each.getMovie().getTitle(), String.valueOf(each.getCharge()));
    }
    //add footer lines
    result += getFooterString1(String.valueOf(aCustomer.getTotalCharge()));
    result += getFooterString2(String.valueOf(aCustomer.getTotalFrequentRenterPoints()));
    return result;
   }
}