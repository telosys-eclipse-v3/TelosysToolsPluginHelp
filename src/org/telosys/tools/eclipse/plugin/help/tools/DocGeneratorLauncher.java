package org.telosys.tools.eclipse.plugin.help.tools;

import org.telosys.tools.generator.context.doc.DocGenerator;

public class DocGeneratorLauncher {

	
	/**
	 * Current project's help directory
	 */
	private final static String HELP_DIR = "/html/objects" ;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String userDir =  System.getProperty("user.dir") ;
		System.out.println( "USER DIR : " + userDir );
		// USER DIR is "X:\xxx\xxx\workspace\project"
		
		//String destDir = userDir + "/target/doc/html/objects/" ;
		String destDir = userDir + HELP_DIR ;
		System.out.println( "DEST DIR : " + destDir );	
		
		int n = DocGenerator.generateHtmlDoc(destDir);
		
		System.out.println("Normal end of generation. " + n + " files generated.");
	}

}
