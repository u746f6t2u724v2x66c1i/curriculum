public class BeerSong {
    public static void main(String[] args) {
        for (int i = 99; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall");
            System.out.println(i + " bottles of beer");
            System.out.println("Take one down, pass it around");
            if (i - 1 == 1) {
                System.out.println("1 bottle of beer on the wall");
            } else {
                System.out.println((i - 1) + " bottles of beer on the wall");
            }
            System.out.println();
        }
        System.out.println("No more bottles of beer on the wall");
        System.out.println("No more bottles of beer");
        System.out.println("Go to the store and buy some more");
        System.out.println("99 bottles of beer on the wall");
    }
}

