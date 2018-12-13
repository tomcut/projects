package singletonDemo;

import java.util.Arrays;

import abstractFactoryModel.Client;

public class Test1 {
  char []c={'a','b','c'};
  int a=10;
  static String str="good";
  
  public static void main(String[] args) {
	  Test1 test1=new Test1();
	  test1.change('g', "ok", 20);
	  System.out.println(Arrays.toString(test1.c));
	  System.out.println(test1.a);
	  System.out.println(test1.str);
	  
	  String s=new String("10")+"abc";
  }
  void change(char c ,String str,int a){
	  this.c[0]=c;
	  str="ok";
	  this.a=a;
  }
}
