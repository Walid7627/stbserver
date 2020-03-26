package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;


public class TestSTB {
	public String loadFileXML() {
		StringBuilder s = new StringBuilder(); 
		Resource r = new DefaultResourceLoader().getResource("classpath:smallSTB.xml");
		try {
			FileInputStream fs = new FileInputStream(r.getFile());
			int content;
			while ((content = fs.read()) != -1) {
				s.append((char) content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s.toString();
	}

}