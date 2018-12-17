/**
 * Created by ilkayaktas on 2018-12-17 at 23:37.
 */

/**
 * Longest common subsequence problem
 */
public class CommonChild {
    static int commonChild(String s1, String s2) {
        /*
        if(s1.length() == 0 || s2.length() == 0){
            return 0;
        }

        if(s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1)){
            return 1 + commonChild(removeLast(s1), removeLast(s2));
        } else{
            return max(commonChild(removeLast(s1), s2), commonChild(s1, removeLast(s2)));
        }
        */

        int comparingMatrix[][] = new int[s1.length()+1][s2.length()+1];

    /* Following steps build L[m+1][n+1] in bottom up fashion. Note
         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
        for (int i=0; i<=s1.length(); i++)
        {
            for (int j=0; j<=s2.length(); j++)
            {
                if (i == 0 || j == 0)
                    comparingMatrix[i][j] = 0;
                else if (s1.charAt(i-1) == s2.charAt(j-1))
                    comparingMatrix[i][j] = comparingMatrix[i-1][j-1] + 1;
                else
                    comparingMatrix[i][j] = max(comparingMatrix[i-1][j], comparingMatrix[i][j-1]);
            }
        }
        return comparingMatrix[s1.length()][s2.length()];
    }

    static String removeLast(String s){
        return s.substring(0, s.length()-1);
    }

    static int max(int i1, int i2){
        return i1 > i2 ? i1 : i2;
    }
}
