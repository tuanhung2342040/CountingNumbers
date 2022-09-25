
/**
 *
 * @author jmadar
 */
public class WordsDefinitionTester {
    
    private String testGetDefinition(String msg) {
	
		WordsDefinition translator = new WordsDefinition();
		return translator.getDefinition(msg);     
		
    }
    
    
    public static void main(String[] args) {
        WordsDefinitionTester tester = new WordsDefinitionTester();
        String str1="apple";
        String str2="I want to eat an apple";

        // test for one word
        System.out.println("Test case: single word");
        System.out.println("Test get definition: "+str1+" \n\t"+tester.testGetDefinition("apple"));
        // Add more test cases
        String str3 = "people";
        String str4 = "program";
        System.out.println("Test get definition: "+str3+" \n\t"+tester.testGetDefinition(str3));
        System.out.println("Test get definition: "+str4+" \n\t"+tester.testGetDefinition(str4));



        // test for a line of text
        System.out.println("Test case: line");
        System.out.println("Test get definition: "+str2+" \n\t"+tester.testGetDefinition("I want to eat an apple"));
        // Add more test cases
        String str5 = "There is no way to escape";
        String str6 = "Coding is one of the hardest skills that I have ever learned";
        System.out.println("Test get definition: "+str5+" \n\t"+tester.testGetDefinition(str5));
        System.out.println("Test get definition: "+str6+" \n\t"+tester.testGetDefinition(str6));
    }
}
