package com.accesssub;
import com.accessmain.*;
class Main extends C{
	public static void main(String[] Args)
	{
		Main obj=new Main();
		obj.displayC();
		obj.displayA();
		obj.displayB();
		obj.privateAccess();
		System.out.println("your name is : "+obj.name);
	
	}

}
