package project.Hangman;

import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class HangmanLogic{
    private final int maxLives = 5;
    private final String currentWord;
    private Set<Character> guessedLetters;
    private int currentLives;
    private int firstLetters = 2;
    private StringBuilder outputWord;
    private Scanner scanner;
    private Random rand;

    public HangmanLogic() { // Запуск игры, инициализация переменных
        rand = new Random();
        scanner = new Scanner(System.in);
        currentWord = HangmanWords.words[rand.nextInt(HangmanWords.words.length)];
        currentLives = maxLives;
        guessedLetters = new HashSet<>();
        outputWord = new StringBuilder();
        fillOutputWordWithUnderScores();
        chooseFirstLetters(); // Выбор нескольких случайных букв из слова которые станут подсказкой
    }
    public void fillOutputWordWithUnderScores() {
        for (int i = 0; i < currentWord.length(); i++) {
            outputWord.append("_");
        }
    }
    public void chooseFirstLetters(){ // Выбирает первые 2 слова
        for(int i = 0; i < firstLetters;) {
            char randLetter = currentWord.charAt(rand.nextInt(currentWord.length() - 1));
            if(guessedLetters.contains(randLetter)) continue;
            else {
                guessedLetters.add(randLetter);
                i++;
            }
        }
    }
    public String getOutputWord() {
        for(int i = 0; i < currentWord.length(); i++) {
            if(guessedLetters.contains(currentWord.charAt(i))) {
                outputWord.setCharAt(i, currentWord.charAt(i));
            }
        }
        return outputWord.toString();
    }

    public String getCurrentWord() {
        return currentWord;
    }

    public int getCurrentLives() {
        return currentLives;
    }

    public int getMaxLives() {
        return maxLives;
    }
    public Set<Character> getGuessedLetters() {
        return guessedLetters;
    }
    public void addToGuessedLetters(Character guessedLetter) {
        guessedLetters.add(guessedLetter);
    }
    public void reduceLives(){
        currentLives--;
    }
    public boolean hasLivesLeft() {
        return currentLives > 0;
    }
}