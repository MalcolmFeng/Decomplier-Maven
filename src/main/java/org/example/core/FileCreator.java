package org.example.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
	/**
	 * 源码写入到指定包指定后缀的源文件中。
	 * @param src 源代码
	 */
	public static void createFile(String name,String src){
		String filePath = "/Users/Malcolm/Desktop/com/jiefupay/service/";
		File f = new File(filePath);
		if(!f.exists()){
			f.mkdirs();
		}
		BufferedWriter bw=null;
		try {
			bw = new BufferedWriter(new FileWriter(name+".java"));
			bw.write(src);
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
