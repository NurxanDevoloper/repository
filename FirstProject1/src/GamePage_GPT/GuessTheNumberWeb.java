//import java.util.Random;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.*;
//
//@SpringBootApplication
//public class GuessTheNumberWeb {
//
//    public static void main(String[] args) {
//        SpringApplication.run(GuessTheNumberWeb.class, args);
//    }
//}
//
//@RestController
//@RequestMapping("/game")
//class GameController {
//
//    private final Random random = new Random();
//    private int targetNumber = random.nextInt(100) + 1;
//    private int attempts = 0;
//
//    @GetMapping("/start")
//    public String startGame() {
//        targetNumber = random.nextInt(100) + 1;
//        attempts = 0;
//        return "Welcome to 'Guess the Number'! I have chosen a number between 1 and 100. Can you guess what it is?";
//    }
//
//    @GetMapping("/guess/{number}")
//    public String makeGuess(@PathVariable int number) {
//        attempts++;
//        if (number < targetNumber) {
//            return "Too low! Try again.";
//        } else if (number > targetNumber) {
//            return "Too high! Try again.";
//        } else {
//            int finishedAttempts = attempts;
//            attempts = 0; // Reset for a new game
//            targetNumber = random.nextInt(100) + 1; // New target number
//            return "Congratulations! You guessed the number in " + finishedAttempts + " attempts. Start a new game with /game/start";
//        }
//    }
//}
