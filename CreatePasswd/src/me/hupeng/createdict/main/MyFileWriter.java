package me.hupeng.createdict.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MyFileWriter {
	private File file;
	private FileOutputStream fileOutputStream;
	private OutputStreamWriter outputStreamWriter;
	private BufferedWriter bufferedWriter;
	public MyFileWriter(String filename){
		file = new File(filename);
		if (file.exists()) {
			file.delete();
		}
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			fileOutputStream = new FileOutputStream(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("文件没找到");
			e.printStackTrace();
		}
		outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		bufferedWriter = new BufferedWriter(outputStreamWriter);
		
	}
	
	public void writeLine(String line) throws IOException{
		bufferedWriter.write(line);
	}
	
	public void close()throws Exception{
		bufferedWriter.flush();
		bufferedWriter.close();
		outputStreamWriter.close();
		fileOutputStream.close();
	}
}
