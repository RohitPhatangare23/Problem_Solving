package Blind75;

import java.util.HashMap;

public class _24_Equal_row_col {
    public static void main(String[] args) {
        int[][] grid= {{3,2,1},{1,7,6},{2,7,7}};
        int result=equalRowCol(grid);
        System.out.println(result);
    }
    public static int equalRowCol(int[][] grid){
        int pair=0;
        int temp=0;
        int row=0;
        while(temp<=grid.length-1)
        {
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=0;j<grid.length;j++)
            {
                map.put(j,grid[row][j]);
            }
            for(int i=0;i<grid.length;i++)
            {
                int curr=0;
                for(int k=0;k<grid.length;k++)
                {
                    if(map.get(k)!=grid[k][i])
                    {
                        curr=0;
                        break;
                    }
                    else
                        curr=1;
                }
                pair+=curr;
            }
            row++;
            temp++;
        }
        return pair;
    }
}
