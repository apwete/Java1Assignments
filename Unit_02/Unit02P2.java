/**
* Class: CIST 2371 Introduction to JAVA
* Term: Summer 2014
* Instructor: Dave Busse
* Description: Solution to Unit 01 Program
* Due: 6/6/14
* @author: William M. Driver
* @version: 1.0
*
*By turning in this code, I pledge:
*  1) That I have completed the programming assignment independently.
*  2) I have not copied the code from a student or any source.
*  3) I have not given my code to any student.
*
*/

import java.util.Scanner;

public class Unit02P2 {
	public static void main(String[] args) {
		// Declarations
		Scanner s= new Scanner(System.in);
		int counter=0;
		String stuName="", highName="", lowName="";
		double numStu,stuScore, highScore=0, lowScore=0;
		
		//get numStu
		System.out.println("Please, enter the number of students we are dealing with.");
		numStu = s.nextDouble();
		numStu = (int)numStu;
		//this loop contains all the work
		while(counter<numStu){
			counter++;
////test current results
//			System.out.print("Highscore "+highScore+"\tHigh Name "+highName);
//			System.out.println("\t\tLowscore "+lowScore+"\tLow Name "+lowName);
			
			//get stuName
			System.out.println("Enter student number "+counter+"'s name");
			stuName = s.next();
			//get stuScore
			System.out.println("Enter student number "+counter+"'s score");
			stuScore = s.nextDouble();
			//pick high and low scores
			if(stuScore>highScore){
				if(highScore>lowScore){
					lowScore = highScore;
					lowName = highName;
					highScore = stuScore;
					highName = stuName;
				}
				highScore = stuScore;
				highName = stuName;
			}else if(stuScore > lowScore){
				lowScore = stuScore;
				lowName = stuName;
			}
		}
////test counter
//		System.out.println(counter);
		//output results
		System.out.println("Of the " +((int)numStu)+" students "+highName+" has the highest score: "+highScore);
		System.out.println("Of the " +((int)numStu)+" students "+lowName+" has the second highest score: "+lowScore);
		System.out.println("Time to hand out the medals.");
	}
}
