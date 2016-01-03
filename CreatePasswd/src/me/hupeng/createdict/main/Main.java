package me.hupeng.createdict.main;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws Exception {
		MyFileReader myFileReader = new MyFileReader("e:\\0471.txt");
		MyFileWriter myFileWriter = new MyFileWriter("e:\\0471abc.txt");
		String passwdString;
		while((passwdString = myFileReader.getLine())!=null){
			String temp;
			for (int i = 0; i <= 9999; i++) {
				temp = i + "";
				while(temp.length()<4){
					temp = "0" +temp;
				}
				myFileWriter.writeLine(passwdString + temp);
			}
			
		}
		myFileWriter.close();
		System.out.println("文件写入完成");
	}
}
