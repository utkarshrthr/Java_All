package com.iv.problem.solving;

public class BracketSequence {

    public static void main(String args[] ) throws Exception {
    	String seq = ")()()(";
        int count = 0;
        char[] ch = seq.toCharArray();
        for(int i = 0;i<ch.length;i++){
        	int flag = 0;
            int start = i;
            for(int j = 0;j<ch.length;j++){
            	if(ch[(start+j)%ch.length]=='(') {
            		flag++;
            	}
            	else {
            		flag--;
            		if(flag<0) {
            			break;
            		}
            	}
            }
            if(flag == 0) count++; 
        }
        System.out.println(count);
    }
}

/**
 * A bracket sequence is a string that contains only characters '(' and ')'. A correct bracket sequence is a bracket sequence that can be transformed into a correct arithmetic expression by 
 * inserting characters '1' and '+' between the original characters of the sequence. For example, bracket sequences '()()' and '(())' are correct. The resulting expressions of these sequences are: 
 * '(1)+(1)' and '((1+1)+1)'. However, '(', ')(', and '(' are incorrect bracket sequences. You are given a bracket sequence , where  denotes the type of 's bracket (open or close). It is not 
 * mandatory that  is necessarily correct. Your task is to determine the number of 's such that  is a correct bracket sequence.
	Input format
		The single line contains sequence .
	Output format 
		Print the number of shifts denoting the correct bracket sequence.
 * */
