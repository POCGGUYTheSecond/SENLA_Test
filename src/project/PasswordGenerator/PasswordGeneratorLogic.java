package project.PasswordGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PasswordGeneratorLogic{
    private Random rand;
    private String letters = "qwertyuiopasdfghjklzxcvbnm";
    private String numbers = "0123456789";
    private String specialSymbols = "`!@#$%^&*()_=+[]{};:\"\\|,."; // Спец символы взяты из списка разрешённых символов при регистрации "Яндекс ID"

    PasswordGeneratorLogic(){
        rand = new Random();
    }
    public String generatePassword(int length){
        ArrayList<Character> characters = new ArrayList<>();
        StringBuilder password = new StringBuilder();
        characters.add(letters.charAt(rand.nextInt(letters.length())));
        characters.add(letters.toUpperCase().charAt(rand.nextInt(letters.length())));
        characters.add(numbers.charAt(rand.nextInt(numbers.length())));
        characters.add(specialSymbols.charAt(rand.nextInt(specialSymbols.length())));
        for(int i = 0; i < length - 4; i++)
        {
            switch(rand.nextInt(4)) {
                case 0:
                    characters.add(letters.charAt(rand.nextInt(letters.length())));
                    break;
                case 1:
                    characters.add(letters.toUpperCase().charAt(rand.nextInt(letters.length())));
                    break;
                case 2:
                    characters.add(numbers.charAt(rand.nextInt(numbers.length())));
                    break;
                case 3:
                    characters.add(specialSymbols.charAt(rand.nextInt(specialSymbols.length())));
                    break;
            }
        }
        Collections.shuffle(characters);
        for(char c : characters) password.append(c);
        return password.toString();
    }
    public String generatePassword(){
        return generatePassword(rand.nextInt(8, 13));
    }
}
