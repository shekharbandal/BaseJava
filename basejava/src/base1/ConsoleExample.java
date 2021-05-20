package base1;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStream;
import java.io.*;

//import jdk.internal.jline.internal.InputStreamReader;

public class ConsoleExample {

	public static void main(String[] args) {
  //BufferedReader reader = new BufferedReader(new InputStream(System.in));
	try {
 // BufferedReader reader = new BufferedReader(new InputStream(System.in));
	}
	finally {
		String reader = "S";
		if (reader  != null) {
			System.out.println("This is wrong");
		}
	}
}
}


/*Console cn = System.console();
int n;
System.out.println("Enter a Number : ");
n = Integer.parseInt(cn.readLine() );
System.out.println("The given number  : " + n);
}*/