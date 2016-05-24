package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class SMergeModel {
	String leftPath;			//�쇊履� �솕硫� �뙆�씪�쓽 Path媛� �떞源�		
	String rightPath;			//�삤瑜몄そ �솕硫� �뙆�씪�쓽 Path媛� �떞源�
	StringBuilder leftTxt;		//�쇊履� �솕硫댁쓽 �뀓�뒪�듃媛� �떞源�
	StringBuilder rightTxt;		//�삤瑜몄そ �솕硫댁쓽 �뀓�뒪�듃媛� �떞源�
	File leftFile;				//�쇊履� �뙆�씪 援ъ“泥�
	File rightFile;				//�삤瑜몄そ �뙆�씪 援ъ“泥�
	
	public String getleftPath(){return leftPath;}
	public String getrightPath(){return rightPath;}
	public StringBuilder getleftTxt(){return leftTxt;}
	public StringBuilder getrightTxt(){return rightTxt;}
	public File getleftFile(){return leftFile;}
	public File getrightFile(){return rightFile;}
	
	public void setleftPath(String leftPath){this.leftPath=leftPath;}
	public void setrightPath(String rightPath){this.rightPath=rightPath;}
	public void setleftTxt(StringBuilder leftTxt){this.leftTxt=leftTxt;}
	public void setrightTxt(StringBuilder rightTxt){this.rightTxt=rightTxt;}
	public void setleftFile(File leftFile){this.leftFile=leftFile;}
	public void setrightFile(File rihgtFile){this.rightFile=rihgtFile;}
	
	public SMergeModel(){
		leftPath = null;
		rightPath = null;
		leftTxt = new StringBuilder();
		rightTxt = new StringBuilder();
		
	}
	
	public void leftSave(StringBuilder leftTxt){
		this.leftTxt = leftTxt;
		
		/*
		 * leftFile에다가 leftTxt를 새로 써주세요(준홍)
		 * fileWriter 이용(다른 함수여도 상관은 없음)
		 */
		
	}
	
	public void rightSave(StringBuilder rightTxt){
		this.rightTxt = rightTxt;
		
		/*
		 * rightFile에다가 rightTxt를 새로 써주세요 (준홍)
		 * fileWriter 이용(다른 함수여도 상관은 없음)
		 */
		
	}
	public void leftLoad(){	
		try {
	    	Scanner leftScanner = new Scanner(leftFile);
	        while(leftScanner.hasNext()){
	        	leftTxt.append(leftScanner.nextLine()+"\n");
	        }
	        leftScanner.close();
			
	    }
	    catch (Exception e) {
	    	System.exit(1);
	    }
		/*
		 * fileChooser �븿�닔 �씠�슜�븯�뿬 data field�뿉 �엳�뒗 leftPath, leftTxt, leftFile �쓣 梨꾩썙�꽔�뼱二쇱꽭�슂(�씗�긽)
		 */
	}
	
	public void rightLoad(){	
		try {
	    	Scanner rightScanner = new Scanner(rightFile);
	        while(rightScanner.hasNext()){
	        	rightTxt.append(rightScanner.nextLine()+"\n");
	        }
	        rightScanner.close();
	    }
	    catch (Exception e) {
	    	System.exit(1);
	    }
		
	}
	
	
}
