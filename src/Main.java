import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
        // to handle exceptions include throws
            throws IOException {

        // load data from file
        BufferedReader bf = new BufferedReader(new FileReader("AoC2.txt"));
        String str;
        List<String> rockPaperScissor = new ArrayList<>();
        while ((str = bf.readLine()) != null) {
            rockPaperScissor.add(str);
        }
        // a rock b paper c scissor
        //X for Rock, Y for Paper, and Z for Scissors
        // punten: 1 for Rock, 2 for Paper, and 3 for Scissors
        //0 if you lost, 3 if the round was a draw, and 6 if you won

        int score = 0;

        for (String s : rockPaperScissor) {
            switch (s) {
                case "A X":
                    score += (1 + 3);
                    break;
                case "A Y":
                    score += (2 + 6);
                    break;
                case "A Z":
                    score += (3 + 0);
                    break;
                case "B X":
                    score += (1 + 0);
                    break;
                case "B Y":
                    score += (2 + 3);
                    break;
                case "B Z":
                    score += (3 + 6);
                    break;
                case "C X":
                    score += (1 + 6);
                    break;
                case "C Y":
                    score += (2 + 0);
                    break;
                case "C Z":
                    score += (3 + 3);
                    break;
            }

        }
        System.out.println("The score is: " + score);


        // part two
        //Anyway, the second column says how the round needs to end: X means you need to lose, Y means you need to end the round in a draw, and Z means you need to win. Good luck!"
        // a rock b paper c scissor
        // punten: 1 for Rock, 2 for Paper, and 3 for Scissors

        int score2 = 0;

        for (String s : rockPaperScissor) {
            switch (s) {
                case "A X":
                    score2 += (0 + 3);
                    break;
                case "A Y":
                    score2 += (3 + 1);
                    break;
                case "A Z":
                    score2 += (6 + 2);
                    break;
                case "B X":
                    score2 += (0 + 1);
                    break;
                case "B Y":
                    score2 += (3 + 2);
                    break;
                case "B Z":
                    score2 += (6 + 3);
                    break;
                case "C X":
                    score2 += (0 + 2);
                    break;
                case "C Y":
                    score2 += (3 + 3);
                    break;
                case "C Z":
                    score2 += (6 + 1);
                    break;
            }

        }
                System.out.println("The score for part two is: " + score2);
    }


}