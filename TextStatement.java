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
}