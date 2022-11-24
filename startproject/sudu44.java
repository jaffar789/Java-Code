package startproject;

import java.util.HashSet;

public class sudu44<bolean> {
	
	public boolean sudoku(int[][] a) {
      HashSet ha =new HashSet();
          for(int i = 0; i<a.length; i++)
          {
              for(int j = 0; j<a.length; j++)
              {
                  if(a[i][j]!='.'){
                      if(!ha.add("row" +i+a[i][j]) || !ha.add("coloum"+j+a[i][j])){
                          return false;
                       }
                        if(!ha.add("box"+(i/3)*3+j/3 +a[i][j])){
                              return false;
                        }
                               else{
                            	   System.out.println("Finished");
                               }
                  		}
              }
          }
          
	}
	public static void main(String[] args) {


	}

}

