package hw;

import java.util.Scanner;

public class hw05_105021058 {

	/*
	 * Topic: 讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
	 * Date: 2016/10/03
	 * Author: 105021058  蕭懋霖
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i*(i+1);
		}
		System.out.println(sum);
	}

}
