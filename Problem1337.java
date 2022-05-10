class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int soldiers[] = new int[mat.length];
        int indices[] = new int[mat.length];
        for(int i=0;i<mat.length; i++){
            for(int j=0;j<mat[i].length; j++){
                soldiers[i] += mat[i][j];
            }
            indices[i] = i;
        }
        for (int j = 1; j < indices.length; j++) {  
            int key = soldiers[j];  
            int key2 = indices[j];
            int i = j-1;  
            while ( (i > -1) && ( soldiers [i] > key ) ) {  
                soldiers [i+1] = soldiers [i];  
                indices [i+1] = indices [i];  
                
                i--;  
            }  
            soldiers[i+1] = key;  
            indices[i+1] = key2;  
        }  
        
        int result[] = new int[k];
        
        for(int i=0;i<k; i++){
            result[i] = indices[i];
        }
        
        return result;
    }
}
