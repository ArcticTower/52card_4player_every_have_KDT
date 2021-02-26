public class Main {

    public static void main(String[] args){

        long N=1000;
        long counter =0;
        int n_players = 4;
        if(args.length>0){
            N = Long.parseLong(args[0]);
        }

        Deck deck = new Deck();
        Hand[] players = new Hand[4];
        for (int i =0;i<4;i++){
            players[i]= new Hand();
        }
        for (int inter =0;inter<N;inter++){

            int local =0;

            deck.fillDeck();
            deck.shuffle();
            for (Hand hand: players){
                hand.fill(deck.deal());
                if(hand.contains(0,1) && hand.contains(0,12) && hand.contains(0,13)){
                    local++;
                }
            }

            if(local==4){
                counter++;
            }

        }

        double chance = (double)counter/(double)N;

        System.out.println("Parameters:\n\t4 players\n\t"+N+"iterations\n\t13 card in hand");
        System.out.println("Goods: "+counter);
        System.out.println("Chance: "+String.format("%.10f",chance));

    }

}
