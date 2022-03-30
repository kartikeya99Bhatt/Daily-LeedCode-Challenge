class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0;i<matrix.length;i++)
        {
            if(target>=matrix[i][0] && target<=matrix[i][matrix[i].length-1])
            {
                boolean ans =SearchRow(i,matrix,target);
                if(ans==true)
                {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean SearchRow(int row,int [][]matrix,int target)
    {
        for(int i=0;i<matrix[row].length;i++)
        {
            if(matrix[row][i]==target)
            {
                return true;
            }
        }
        return false;
    }
}


 // OPTIMISE APPROCH

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        
        while(row<matrix.length && col>=0)
        {
            if(target==matrix[row][col]) return true;
            
            else if(target<matrix[row][col])
            {
                col--;
            }
            else 
            {
                row++;
            }
        }
        
        return false;
    }
}
