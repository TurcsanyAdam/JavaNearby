package com.nearby;

public class Main {

    public static void main(String[] args) {
	nearby(1,0,1);
    }
    public static int[] nearby(int x, int y, int range){
        int[][] multi = new int[][]{
                { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
                { 1, 3, 5, 7 },
                { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
        };

        int[] result = new int[0];
        for(int i = 0; i < range; i++){
            if(y-(range-i) < multi[x].length && y-(range-i) >= 0){
                int u = multi[x][y-(range-i)];
                result = addX(result.length,result,u);

            }
            if(y+(range-i) < multi[x].length){
                int z = multi[x][y+(range-i)];
                result =addX(result.length,result,z);

            }
        }

        return result;
    }

    public static int[] addX(int n, int arr[], int x)
    {
        int i;

        int newarr[] = new int[n + 1];

        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }
}
