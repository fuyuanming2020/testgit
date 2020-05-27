package com.zpc.springcloud.eureka.demo;

import java.util.Stack;

public class StackTest {

	private static Stack<Integer> mainStack=new Stack<Integer>();
	private static Stack<Integer> minStack=new Stack<Integer>();

	/**
	 * 出栈
	 * @return
	 * @throws Exception
	 */
	public static Integer pop()throws Exception{
		
		if(null!=mainStack && mainStack.isEmpty()){
			throw new Exception("没有值了");
		}
		
		if(mainStack.peek()==minStack.peek()){
			minStack.pop();
		}
		
		return mainStack.pop();
	}
	
	
	public static void add(Integer v)throws Exception{
		mainStack.add(v);
		if(minStack.isEmpty() || v<=minStack.peek()){
			minStack.add(v);
		}
	}
	
	public static Integer getMin()throws Exception{
		 if(mainStack.isEmpty()){
			 throw new Exception("没有值了");
		 }
		 return minStack.peek();
	}
	
	
	
	public static void main(String[] args) {
		
		try {
			StackTest.add(55);
			StackTest.add(65);
			StackTest.add(33);
			StackTest.add(22);
			StackTest.add(75);
			StackTest.add(23);
			StackTest.add(45);
			StackTest.add(66);
			StackTest.add(78);
			StackTest.add(1);
			StackTest.add(4);
			StackTest.add(6);
			StackTest.add(8);
			StackTest.add(8);
			
			Integer min = StackTest.getMin();
			System.out.println("最小值="+min);
			
			for(int i=0;i<20;i++){
				Integer pop = StackTest.pop();
				System.out.println("pop="+pop);
				Integer min2 = StackTest.getMin();
				System.out.println("最小值="+min2);
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
