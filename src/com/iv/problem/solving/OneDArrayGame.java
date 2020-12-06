package com.iv.problem.solving;

public class OneDArrayGame {
	public static void main(String[] args) {
		int[] ar = {0, 0, 1, 1, 1, 0};
		int n = 3;
		int i = 0;
		while(i < ar.length) {
			if(i == ar.length-1 || i+n > ar.length) {
				System.out.println("WIN");
				return;
			}
			else if(i+n <ar.length && ar[i+n] == 0) {
				i+=n;
			}
			else if(ar[i+1] == 0){
				i++;
			}
			else if(i>0 && ar[i-1] == 0){
				i--;
			}
			System.out.println(i);
		}
		System.out.println(i);
	}

    public static boolean canWin(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1) 
            return false;
        if ((i == game.length - 1) || i + leap > game.length - 1) 
            return true;
        game[i] = 1;
        return canWin(leap, game, i + 1) || canWin(leap, game, i - 1) || canWin(leap, game, i + leap);
    }
}
