package exerciseFourteen;

//14.5 (Random Sentences) Write an application that uses random-number generation to create
//sentences. Use four arrays of strings called article, noun, verb and preposition. Create a sentence
//by selecting a word at random from each array in the following order: article, noun, verb, preposition,
//article and noun. As each word is picked, concatenate it to the previous words in the sentence.
//The words should be separated by spaces. When the final sentence is output, it should start with a
//capital letter and end with a period. The application should generate and display 20 sentences.
//The article array should contain the articles "the", "a", "one", "some" and "any"; the noun
//array should contain the nouns "boy", "girl", "dog", "town" and "car"; the verb array should contain
//the verbs "drove", "jumped", "ran", "walked" and "skipped"; the preposition array should
//contain the prepositions "to", "from", "over", "under" and "on".

import java.security.SecureRandom;
public class RandomSentences 
{
	public static void main (String[] args) 
	{
		SecureRandom secureRandom = new SecureRandom();
		
		int r = secureRandom.nextInt(5);
		int a = secureRandom.nextInt(5);
		int n = secureRandom.nextInt(5);
		int d = secureRandom.nextInt(5);
		int o = secureRandom.nextInt(5);
		int m = secureRandom.nextInt(5);
		
		
		
		String[] article = { "The", "A", "One", "Some", "Any"};
		String[] noun = { "boy", "girl", "dog", "town", "car"};
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] preposition = { "to", "from", "over", "under", "on" };
		
		for (int i = 0; i <= 8; i++) {
			System.out.printf("%d %d %d %d %d %d", r,a,n,d,o,m);
			System.out.println(article[r] + " " + noun[a] + " " + verb[n] + " " + preposition[d]  + " " + article[o]  + " " + noun[m]);
		}
	}
}
