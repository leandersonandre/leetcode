class Solution {
    public int romanToInt(String s) {
        
        int value = 0;
        
        while(!s.isEmpty()){
            if(s.startsWith("IX")){
                value += 9;
                s = s.replaceFirst("IX","");
            }else if(s.startsWith("IV")){
                value += 4;
                s = s.replaceFirst("IV","");
            }else if(s.startsWith("I")){
                value += 1;
                s = s.replaceFirst("I","");
            }else if(s.startsWith("XL")){
                value += 40;
                s = s.replaceFirst("XL","");
            }else if(s.startsWith("XC")){
                value += 90;
                s = s.replaceFirst("XC","");
            }else if(s.startsWith("X")){
                value += 10;
                s = s.replaceFirst("X","");
            }else if(s.startsWith("CD")){
                value += 400;
                s = s.replaceFirst("CD","");
            }else if(s.startsWith("CM")){
                value += 900;
                s = s.replaceFirst("CM","");
            }else if(s.startsWith("C")){
                value += 100;
                s = s.replaceFirst("C","");
            }else if(s.startsWith("D")){
                value += 500;
                s = s.replaceFirst("D","");
            }else if(s.startsWith("M")){
                value += 1000;
                s = s.replaceFirst("M","");
            }else if(s.startsWith("V")){
                value += 5;
                s = s.replaceFirst("V","");
            }else if(s.startsWith("L")){
                value += 50;
                s = s.replaceFirst("L","");
            }
        }
        
        return value;
        
    }
}
