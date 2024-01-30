class Solution {
    public int compress(char[] chars) {
        int pointer = 0;
        char c = chars[0];
        int count = 1;
        for(int i = 1; i < chars.length; i++){
            char temp = chars[i];
            if(temp == c){
                count++;
            }
            else{
                chars[pointer++] = c;
                if(count > 999)
                    chars[pointer++] = Character.forDigit(count / 1000,10);
                if(count > 99)
                    chars[pointer++] =  Character.forDigit(count / 100 % 10,10);
                if(count > 9)
                    chars[pointer++] =  Character.forDigit(count / 10 % 10,10);
                if(count > 1)
                    chars[pointer++] =  Character.forDigit(count % 10,10);
                count = 1;
                c = temp;
            }
        }
        chars[pointer++] = c;
        if(count > 999)
            chars[pointer++] = Character.forDigit(count / 1000,10);
        if(count > 99)
            chars[pointer++] =  Character.forDigit(count / 100 % 10,10);
        if(count > 9)
            chars[pointer++] =  Character.forDigit(count / 10 % 10,10);
        if(count > 1)
            chars[pointer++] =  Character.forDigit(count % 10,10);
        return pointer;
    }
}