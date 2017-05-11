package webdriver;

import java.io.File;

import operatingsystem.OperatingSystem;


/**
 * Created by HiekmaHe on 10.05.2017.
 */
public class PathTo
{
	private static String n = System.getProperty("file.separator");
	private static String src = "src";
	private static String main = "main";
	private static String resources = "resources";
	private static String selenium = "selenium";

	private static File createPathFromProjectAnd(String... subfolders)
	{
		String appendMe = new String();
		for (String folder : subfolders) {
			appendMe += n + folder;
		}
		return new File(project() + appendMe);
	}

	public static File project()
	{
		File project = PathTo.thisClass()
				.getParentFile().getParentFile().getParentFile();
		return project;
	}

	private static File /*Do NOT move*/ thisClass()
	{
			/*
			 * Do not physically move this class!
			 * Path is retrieved relativ to this class
 			 */
		return new File (new PathTo().getClass()
				.getProtectionDomain().getCodeSource()
				.getLocation().getPath());
	}

	public static File resources()
	{
		return createPathFromProjectAnd(src, main, resources);
	}

	public static File selenium()
	{
		return createPathFromProjectAnd(src, main, resources, selenium);
	}

	public static File gecko() throws Exception
	{
		return createPathFromProjectAnd(src, main, resources, selenium, OperatingSystem.local().gecko());
	}
}