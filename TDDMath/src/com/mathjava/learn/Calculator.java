package com.mathjava.learn;

import java.util.Scanner;
import java.io.*;

public class Calculator implements Distance, Gradient, Equationoftheline {
	
	double gradient;
	
public static void main(String arg[])
	
	{
              int x1,x2,y1,y2;
	
	         Scanner input=new Scanner(System.in);
 
	         System.out.println("enter x1 point");
	         
	       if(input.hasNextDouble()){
	    	   x1=(int) input.nextDouble();
	        	 
               System.out.println("enter y1 point");
	   
               y1=(int) input.nextDouble();

	         System.out.println("enter x2point");
	   
               x2=(int) input.nextDouble();

	         System.out.println("enter y2 point");
	   
               y2=(int) input.nextDouble();
               
              Calculator calculator = new Calculator();
              System.out.println(calculator.gradient(y2, y1, x2, x1));
              System.out.println(calculator.equation(y2, y1, x2, x1));
              System.out.println(calculator.distance(x2, x1, y2, y1));
	        	 }
	        	 else{
	        		 String string = input.nextLine();
		        	 System.out.println("please enter a number");
	 
	        	 }         
	}
 

	@Override
	public String equation(double y2, double y1,
            double x2, double x1) {
		
//		equation of the line" y= mx+c
		
		gradient = gradient(y2,y1,x2,x1);
		
		double c = y1 - gradient * x1;
		if(c>=0) {
		String equation="y="+gradient+"x+"+c;
		return equation;
		}
		else {
			String equation="y="+gradient+"x"+c;
			System.out.println(equation);
			return equation;
		}
	}

	public double gradient(double y2, double y1,
	                       double x2, double x1)
	    {
	        double gradient= (y2 - y1) / (x2 - x1);
	        return gradient; 
	    }
	
	@Override
	public double distance(double x2,double x1, double y2, double y1) {
		
		    double distance;
		    distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
	            System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+distance);
		return distance;
	}

}
