
/**
 *
 * @author jmadar
 */
public class WordsDefinitionTester {
    
    private String testGetDefinition() {
	// Text EachWord
        // EachWord aWord = new EachWord("a [artificial%3:00:00::] [artificial] unreal, unnatural");    
        // return aWord.toString();
	    
	// Test WordDefinition for one word    
	// WordsDefinition translator = new WordsDefinition();
	// return translator.getDefinition("test");     
	    
        // Test WordDefinition for one sentence   
	WordsDefinition translator = new WordsDefinition();
	return translator.getDefinition("I want to eat an apple");     
		
    }
    
    
    public static void main(String[] args) {
        WordsDefinitionTester tester = new WordsDefinitionTester();
        System.out.println("Test get definition: "+tester.testGetDefinition());
    }
}
