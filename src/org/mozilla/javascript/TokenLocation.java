package org.mozilla.javascript;

/**
 * The lexer token location info
 */
public class TokenLocation {
	int type;
	int lineno;
	int column;
	String fileName;
	public TokenLocation(int t, int l, int c, String f)
	{
		type = t;
		lineno = l;
		column = c;
		fileName = f;
	}
	public String toString() 
	{
		return "<" + type + "@" + fileName + " " + lineno + ":" + column + ">";
	}
	public int getLineno() 
	{
		return lineno;
	}
	public int getColumn()
	{
		return column;
	}
	public String getFileName() 
	{
		return fileName;
	}
}
