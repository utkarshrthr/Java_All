package com.core;

public class FUn {
	public static void main(String[] args) {
		int t  =5;
		int matrixSize = 2*t-1;
        for(int i = 0; i<t;i++){
            int st = matrixSize/2-i;
            int en = matrixSize/2+i;
            for(int j=0;j<matrixSize;j++){
                if(j>= st && j<=en ){
                    System.out.print((char)(65+i));
                }
                else {  
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}