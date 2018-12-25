import org.junit.Test;

import java.util.Stack;

/**
 * Created by aselsan on 20.12.2018 at 18:20.
 */
public class TagContentExtractorTest {

    @Test
    public void tagExtractor() {
        TagContentExtractor.tagExtractor("<h1>Nayeem loves counseling</h1>");
        TagContentExtractor.tagExtractor("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");
        TagContentExtractor.tagExtractor("<Amee>safat codes like a ninja</amee>");
        TagContentExtractor.tagExtractor("<SA premium>Imtiaz has a secret crush</SA premium>");
    }

    @Test
    public void extractTag(){
        Stack<String> tagStack = new Stack<>();
        Stack<String> wordStack = new Stack<>();

        String s = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '<'){
                while (s.charAt(i) != '>'){
                    tagStack.push(String.valueOf(s.charAt(i)));
                    i++;
                }
                tagStack.push(String.valueOf(s.charAt(i)));

            }
        }
    }
}