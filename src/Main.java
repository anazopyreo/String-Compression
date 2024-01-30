public class Main {
    public static void main(String[] args) {
        char[] chars1 = {'a','a','b','b','c','c','c'};
        char[] expectedChars1 = {'a','2','b','2','c','3'};
        System.out.println(testSolution(chars1, expectedChars1));

        char[] chars2 = {'a'};
        char[] expectedChars2 = {'a'};
        System.out.println(testSolution(chars2, expectedChars2));

        char[] chars3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        char[] expectedChars3 = {'a','b','1','2'};
        System.out.println(testSolution(chars3, expectedChars3));
    }

    private static boolean testSolution(char[] chars, char[] expectedChars){
        Solution solution = new Solution();
        int k = solution.compress(chars);
        if(k != expectedChars.length)
                return false;
        for(int i = 0; i < expectedChars.length; i++)
            if(chars[i] != expectedChars[i])
                return false;
        return true;
    }
}