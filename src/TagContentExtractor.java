/**
 * Created by aselsan on 20.12.2018 at 18:18.
 */

public class TagContentExtractor {

    static void tagExtractor(String line){

    }

    static String extractTag(String line, int index){
        String tag = "";
        int i = index;
        while(line.charAt(i) !='>'){
            tag += line.charAt(i);
            i++;
        }
        tag += line.charAt(i);

        return tag;
    }

}
