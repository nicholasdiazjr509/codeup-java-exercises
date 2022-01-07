package movies;

import util.Input;



public class MoviesApplication {

    public static void main(String[] args) {
        init();
}
        private static void init(){
            MoviesApplication app = new MoviesApplication();
            app.run();
        }
    private void run(){
        displayStart();
        boolean running = true;
        while(running){
            int choice = promptChoice();
            running = userChoice(choice);
        }
    }
private boolean userChoice(int choice){
        boolean continueApp = true;
        switch(choice){
            case 0:
                continueApp = false;
                stopApp();
                    break;
            case 1:
                showAllMovies();
                break;
            case 2:
                moviesByCategory("animated");
                break;
            case 3:
                moviesByCategory("drama");
            case 4:
                moviesByCategory("horror");
                break;
            case 5:
                moviesByCategory("scifi");
                break;
            case 6:
                moviesByCategory("musical");
                break;

        }
        return continueApp;
}
    private void stopApp() {
        System.out.println("Goodbye.");
    }
    private void showAllMovies(){
        displayMovies(MoviesArray.findAll());
        System.out.println(userPrompt());
    }
    private void moviesByCategory(String category) {
        Movie[] allMovies = MoviesArray.findAll();
        Movie[] filteredMovies;
        int filteredMoviesCount = 0;

        for (Movie movie : allMovies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                filteredMoviesCount++;

            }
        }
        filteredMovies = new Movie[filteredMoviesCount];
        int i = 0;
        for (Movie movie : allMovies) {
            filteredMovies[i] = movie;
            i++;
        }
        displayMovies(filteredMovies);
        System.out.println(userPrompt());
    }
    private void displayMovies(Movie[] movies){
        System.out.println("\n");
        for(Movie movie : movies){
            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
        }
        System.out.println("\n");
    }
    private void displayStart(){
        String output = "My Movie App. \n\n";
        output += userPrompt();
        System.out.println(output);
    }


private String userPrompt(){
    String output =  "What would like to view?\n\n";

               output += "0 - exit \n";
               output += "1 - view all movies \n";
               output +=  "2 - view movies in the animated category \n";
               output +=  "3 - view movies in the drama category \n";
               output +=  "4 - view movies in the horror category \n";
               output +=  "5 - view movies in the scifi category \n";
               output +=  "6 - view movies in the musical category \n";
              // output += "\n" + "Enter choice please: ";
            return output;
}
private int promptChoice(){
        Input in = new Input();
        return in.getInt(0, 6, "Enter choice: ");
}


}
