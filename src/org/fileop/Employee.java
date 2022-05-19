package org.fileop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Employee {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium coach\\fileop\\driver\\chromedriver.exe");
		
		WebDriver f = new ChromeDriver();
		
		f.navigate().to("http://www.greenstechnologys.com/");
		
		WebElement dd = f.findElement(By.xpath("//a[text()='Online Courses']"));
		
		Actions sel = new Actions(f);
		sel.moveToElement(dd).perform();
		
		WebElement e = f.findElement(By.xpath("//span[text()='Digital Marketing']"));
		
		e.click();
		
		WebElement g = f.findElement(By.xpath("//p[text()='Digital Marketing is vast and expanding, as such the curriculum of Digital Marketing courses must keep being updated. The regular updation of our courses and their curriculum keeps this program a league apart from that of other Digital Marketing Institutions. Our approach to Digital Marketing training is exhaustive. You will learn various techniques of Digital Marketing through a series of 44 Modules.']"));
		
		String txt = g.getText();
		
		System.out.println(txt);
		
		File doc = new File("D:\\hh7");
		
		boolean fil = doc.mkdir();
		if(fil){  
	         System.out.println("Folder is created successfully");  
	      }else{  
	         System.out.println("Error Found!");	
	      }
	         
	         File doc2 = new File("D:\\hh7\\hh7.txt");
	         
	         boolean fil2 = doc2.createNewFile();
	         if(fil2){  
		         System.out.println("Folder is created successfully");  
		      }else{  
		         System.out.println("Error Found!");	
		      }
		
		boolean canExecute = doc2.canExecute();
		System.out.println(canExecute);
		
		boolean canRead = doc2.canRead();
		System.out.println(canRead);
		
		boolean canWrite = doc2.canWrite();
		System.out.println(canWrite);
		
		FileWriter kk = new FileWriter("D:\\\\hh7\\\\hh7.txt");	
		
		kk.write("dummy");
		
		FileUtils.write(doc2, txt, true);
		
		
		
	}
	}

