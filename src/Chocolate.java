public class Chocolate {
    public static int calculateMaxChocolates(int money, int price, int wrap) {
        int chocolates = money / price;
        int wrappers = chocolates;

        while (wrappers >= wrap) {
            int newChocolates = wrappers / wrap;
            chocolates += newChocolates;
            int remainingWrappers = wrappers % wrap;
            wrappers = newChocolates + remainingWrappers;
        }

        return chocolates;
    }

    public static void main(String[] args) {
        int money = 15;
        int price = 1;
        int wrap = 3;

        int maxChocolates = calculateMaxChocolates(money, price, wrap);
        System.out.println("Максимальное количество шоколадок: " + maxChocolates);
    }
}
