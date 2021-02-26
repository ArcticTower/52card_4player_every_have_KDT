public class Hand {
    private Card[] hand = new Card[13];

    public void fill(Card[] cards){
        for(int i =0;i<13;i++){
            hand[i]=cards[i];
        }
    }

    public boolean contains(int suit, int rank){
        for(Card c : hand){


                if (c.rank == rank && c.suit == suit || (c.rank == rank && suit == 0)) {
                    return true;
                }

        }
        return false;
    }
}
