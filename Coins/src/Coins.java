public class Coins {
    
    public static int numCoins(int cents){
        if (cents < 1){
            return 0;
        }
        int[] coins = {25, 10, 5, 1};
        int numberOfCoins = 0;

        for (int coin : coins) {
            numberOfCoins += cents / coin;
            cents = cents % coin;
            if (cents == 0){
                break;
            }
        }
        return numberOfCoins;
    }

    public static void main(String[] args) {
        System.out.println(numCoins(31));
    }
}
