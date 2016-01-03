package me.hupeng.createdict.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class MyFileReader {
	private String filename;
	private FileInputStream fileInputStream;
	private InputStreamReader inputStreamReader;
	private BufferedReader bufferedReader;
	public MyFileReader(String filename){
		this.filename = filename;
		try {
			fileInputStream = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("文件没找到");
			e.printStackTrace();
		}
		inputStreamReader = new InputStreamReader(fileInputStream);
		bufferedReader = new BufferedReader(inputStreamReader);
	}
	
	public String getLine(){
		try {
			return bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
