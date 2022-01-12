public class ServerNameGenerator {
    static String[] adjectives = {"charming", "cruel", "perfect", "rough", "sharp", "tasty", "zealous"};
    static String[] nouns = {"egg", "car", "apple", "radio", "computer", "laptop", "water", "coffee", "cereal", "engine"};

    public static String getRandom(String[] array){
        int random = (int)(Math.random() * array.length);//defined the random as an int
        return array[random];//this returns my array using int for the strings for random
    }

    public static void main(String[] args) {
        String adjective = getRandom(adjectives);//getRandom method is called and passes adjective words
        String noun = getRandom(nouns);//same here with the nouns

        System.out.printf("Here is your server name:\n" + "%s-%s\n", adjective, noun);
        System.out.println("Run again to get a new server name combo.");
    }
}
