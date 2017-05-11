package webdriver;

import java.io.File;

/**
 * Created by HiekmaHe on 10.05.2017.
 */
public class PathTo
{
	private static String n = System.getProperty("file.separator");
	private static String src = "src";
	private static String main = "main";
	private static String resources = "resources";

	public static File gecko()
	{
		return resources();
	}

	public static File resources()
	{
		return createPathFromProjectAnd(src, main, resources);
	}

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
}