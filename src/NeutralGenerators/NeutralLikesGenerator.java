/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NeutralGenerators;

import CharacterGenerator.Interfaces.LikesGenerator;
import CharacterGenerator.Interfaces.Randomizer;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Greatmelons
 */
public class NeutralLikesGenerator implements LikesGenerator, Randomizer{
     
    List<String> likesDislikesList = Arrays.asList("goblins", "dragons", "spiders", "insects", "fruits", "death", "animals", "swords", "legendary folklore", "drunkness", "ale", "rock punishing", "fighting", "birds", "shiny things", "torture", "nails", "sharp things", "holidays", "ugliness", "fish", "magic", "sorcerers", "undead things", "dungeon crawling", "looting", "raiding", "loud noises", "dark and wet places", "spirits of ancestors", "high places", "snow", "mining");

    public String generateLikes() {
        String likes = likesDislikesList.get(randomizer.nextInt(likesDislikesList.size()));
        return likes;
    }
    
}