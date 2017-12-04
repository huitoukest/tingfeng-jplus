package com.tingfeng.jplus.core;

import java.io.File;

public class FunctionUtil {
	  public static String packagePath = "com.tingfeng.function";
	  
	  public static void function(Class<?> returnType,Class<?>... parameterTypes){
		  
	  }
	  
	  public static void function(Object ... args){
		  
	  }
	  
	  
	  public static String getClassPath() {
		 return  FunctionUtil.class.getClassLoader().getResource("/").getPath(); 
	  }
	  
	  public static void init() {
		  String cPath = getClassPath();
		  cPath = cPath + packagePath.replaceAll("\\.", "/");
		  File pathFile = new java.io.File(cPath);
		  if(!pathFile.exists() || !pathFile.isDirectory()) {
			  pathFile.mkdirs();
		  }
		  
	  }
}
