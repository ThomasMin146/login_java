package test_login;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Stream;

public class Main_login {

	public static void main(String[] args) throws IOException {
		
		//frame_login login = new frame_login();
		
		
		String[] login_info = null;
		try {
			FileReader fr = new FileReader(frame_registrate.loginFile);
			BufferedReader br = new BufferedReader(fr);
			String s;     
		    String input="Thomas";
		    
		    while((s=br.readLine())!=null) {
		    	login_info=s.split(" ");
		    	for (String word : login_info) {
		    		 if (word.equals(input))   //Search for the given word
	                 {
	                   System.out.println(word);   
	                 }
		    	}
		    	
		    }
		    
		    fr.close();
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
