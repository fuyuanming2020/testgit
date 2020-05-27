package com.zpc.springcloud.eureka;

public class T {

	public static void main(String[] args) {
		
		//落首晚或者全段
		//非首晚或全段
		//按全段处理
		String str="300D100N";
		int indexOfD = str.indexOf("D");
		String substring = str.substring(0, indexOfD);
		System.out.println(substring);
		int indexOfP = str.indexOf("P");
		if(indexOfP!=-1){
			//百分比
			String substringDP = str.substring(indexOfD+1, indexOfP);
			System.out.println(substringDP);
		}
		int indexOfN = str.indexOf("N");
		if(indexOfN!=-1){
			//天数
			String substringDN = str.substring(indexOfD+1, indexOfN);
			System.out.println(substringDN);
		}
		
	}
}
