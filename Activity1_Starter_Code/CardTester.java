/**
 * This is a class that tests the Card class.
 */
  
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
   public static void main(String[] args) {
   	/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      Card one=new Card("two", "hearts", 2);
      System.out.println("Card One:");
      System.out.println("Suit: "+one.getSuit());
      System.out.println("Rank: "+one.getRank());
      System.out.println("Point Value: "+one.getPointValue());
      System.out.println("ToString: "+one);
      
      
      Card two=new Card("five", "spades", 5);
      System.out.println("Card Two:");
      System.out.println("Suit: "+two.getSuit());
      System.out.println("Rank: "+two.getRank());
      System.out.println("Point Value: "+two.getPointValue());
      System.out.println("ToString: "+two);
      
      Card three=new Card("nine", "diamonds", 9);
      System.out.println("Card Three:");
      System.out.println("Suit: "+three.getSuit());
      System.out.println("Rank: "+three.getRank());
      System.out.println("Point Value: "+three.getPointValue());
      System.out.println("ToString: "+three);
   
   
      System.out.println("Testing match between one and two - " +one.matches(two));
      System.out.println("Testing match between two and three - " +two.matches(three));
      System.out.println("Testing match between three and one - " +three.matches(one));
      System.out.println("Testing match between one and one - " +one.matches(one));
   
   
   
   }
}
