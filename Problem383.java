class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        char r[] = ransomNote.toCharArray();
        char m[] = magazine.toCharArray();   
        boolean flag;
        int count = 0;
        for(int i =0; i < r.length; i++){
            flag = true;
            if(count == m.length) return false;
            for(int j =0; j < m.length; j++){
                if(r[i] == m[j]){
                    flag = false;
                    m[j] = 'X';
                    count++;
                    break;
                }
            }
            if(flag) return false;
        }
        
        return true;
    }
}
