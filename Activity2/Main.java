/**
 * This is a class that tests the Deck class.
 */
public class Main{
   public static void main(String[] args) {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	//public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
   String[] ranks1=new String[]{"eight", "two", "three", "seven", "ten"} ;
  String[] suits1=new String[]{"diamonds", "hearts", "spades", "clubs"} ;
    int[] pV1=new int[]{8, 2, 3, 7, 10};

     System.out.println("Deck One");
Deck deck1=new Deck(ranks1, suits1, pV1);
   //  System.out.println("Complete Deck: "+ deck1);

  System.out.println("Checks if the deck is empty: "+deck1.isEmpty()+ "\nSize of the deck: " + deck1.size() + "\nDeal: " + deck1.deal());
System.out.println("Complete Deck: "+ deck1);

      String[] ranks2=new String[]{"nine", "six", "four", "two" } ;
  String[] suits2=new String[]{"spades", "clubs", "hearts", "diamonds"} ;
    int[] pV2=new int[]{9, 6, 4, 2};

          System.out.println("\nDeck Two");

  Deck deck2=new Deck(ranks2, suits2, pV2);
  //   System.out.println("Complete Deck: "+ deck2);

  System.out.println("Checks if the deck is empty: "+deck2.isEmpty()+ "\nSize of the deck: " + deck2.size() + "\nDeal: " + deck2.deal());

     
     System.out.println("\nDeck Three");

      String[] ranks3=new String[]{"five", "nine", "three", "ten" } ;
  String[] suits3=new String[]{"diamonds", "hearts", "clubs", "spades"} ;
    int[] pV3=new int[]{5, 9, 3, 10};

Deck deck3=new Deck(ranks3, suits3, pV3);
     //System.out.println("Complete Deck: "+ deck3);

  System.out.println("Checks if the deck is empty: "+deck3.isEmpty()+ "\nSize of the deck: " + deck3.size() + "\nDeal: " + deck3.deal());
	}}
//}
