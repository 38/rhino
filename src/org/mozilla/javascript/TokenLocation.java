package org.mozilla.javascript;

/**
 * The lexer token location info
 */
private class TokenLocation {
	int type;
	int lineno;
	int column;
	public TokenLocation(int t, int l, int c)
	{
		type = t;
		lineno = l;
		column = c;
	}
}
