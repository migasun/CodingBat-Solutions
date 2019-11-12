
//CH2-4
//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//helloName("Bob") → "Hello Bob!"
//helloName("Alice") → "Hello Alice!"
//helloName("X") → "Hello X!"
	
public String helloName(String name)
{	return ("Hello " + name + '!');	}

//CH2-4
// Given two strings, a and b, return the result of putting them together in the order abba,
// e.g. "Hi" and "Bye" returns "HiByeByeHi".//
//makeAbba("Hi", "Bye") → "HiByeByeHi"
//makeAbba("Yo", "Alice") → "YoAliceAliceYo"
//makeAbba("What", "Up") → "WhatUpUpWhat"

public String makeAbba(String a, String b)
{	return (a+b+b+a);	}

//CH2-4
// The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
// In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
// Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
// Call→	Run
// makeTags("i", "Yay")→	"<i>Yay</i>"
// makeTags("i", "Hello")→	"<i>Hello</i>"
// makeTags("cite", "Yay")→	"<cite>Yay</cite>"
// makeTags("address", "here")→	"<address>here</address>"
// makeTags("body", "Heart")→	"<body>Heart</body>"
// makeTags("i", "i")→	"<i>i</i>"
// makeTags("i", "")→	"<i></i>"
	
public String makeTags(String tag, String word){
    return ('<' + tag + '>' + word + '<' + '/' + tag + '>');	
}


// Given an "out" string length 4, such as "<<>>", and a word, return a new string
// where the word is in the middle of the out string, e.g. "<<word>>".
// Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
//makeOutWord("<<>>", "Yay") → "<<Yay>>"
//makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//makeOutWord("[[]]", "word") → "[[word]]"
public String makeOutWord(String out, String word)
{	return (out.substring(0, 2) + word + out.substring(2, 4));	}


// Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
// The string length will be at least 2.
//extraEnd("Hello")	"lololo"
//extraEnd("ab")	"ababab"
//extraEnd("Hi")	"HiHiHi"
//extraEnd("Candy")	"dydydy"
//extraEnd("Code")	"dedede
public String extraEnd(String str)
{
 	String end = str.substring(str.length()-2);
  	return end + end + end;
}


// Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
// If the string is shorter than length 2, return whatever there is, so "X" yields "X",
// and the empty string "" yields the empty string "".Note that str.length() returns the length of a string.
//extraEnd("Hello") → "lololo"
//extraEnd("ab") → "ababab"
//extraEnd("Hi") → "HiHiHi"
public String firstTwo(String str)
{
	 if (str.length() >= 2) {
	    return str.substring(0, 2);
	  } else {
	    return str;
	  }
}


// Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//firstHalf("WooHoo")	"Woo"
//firstHalf("HelloThere")	"Hello"
//firstHalf("abcdef")	"abc"
//firstHalf("ab")	"a"
//firstHalf("")	""
//firstHalf("0123456789")	"01234"
//firstHalf("kitten")	"kit"
public String firstHalf(String str)
{
	return str.substring(0, str.length()/2);
}


// Given a string, return a version without the first and last char, so "Hello" yields "ell".
// The string length will be at least 2.
//withoutEnd("Hello")	"ell"
//withoutEnd("java")	"av"
//withoutEnd("coding")	"odin"
//withoutEnd("code")	"od"
//withoutEnd("ab")	""
//withoutEnd("Chocolate!")	"hocolate"
//withoutEnd("kitten")	"itte"
//withoutEnd("woohoo")	"ooho"
public String withoutEnd(String str)
{
	return str.substring(1, str.length()-1);	
}


// Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside
// and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
//comboString("Hello", "hi")	"hiHellohi"
//comboString("hi", "Hello")	"hiHellohi"
//comboString("aaa", "b")	"baaab"
//comboString("b", "aaa")	"baaab"
//comboString("aaa", "")	"aaa"
//comboString("", "bb")	"bb"
//comboString("aaa", "1234")	"aaa1234aaa"
//comboString("aaa", "bb")	"bbaaabb"
//comboString("a", "bb")	"abba"
//comboString("bb", "a")	"abba"
//comboString("xyz", "ab")	"abxyzab"
public String comboString(String a, String b)
{
	if(a.length() >= b.length())
		return b+a+b;
	return a+b+a;
}


// Given 2 strings, return their concatenation, except omit the first char of each.
// The strings will be at least length 1.
//nonStart("Hello", "There")	"ellohere"
//nonStart("java", "code")	"avaode"
//nonStart("shotl", "java")	"hotlava"
//nonStart("ab", "xy")	"by"
//nonStart("ab", "x")	"b"
//nonStart("x", "ac")	"c"
//nonStart("a", "x")	""
//nonStart("kit", "kat")	"itat"
//nonStart("mart", "dart")	"artart"

public String nonStart(String a, String b)
{	
	return (a.substring(1) + b.substring(1));	
}


// Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
// The string length will be at least 2.
//left2("Hello")	"lloHe"
//left2("java")	"vaja"
//left2("Hi")	"Hi"
//left2("code")	"deco"
//left2("cat")	"tca"
//left2("12345")	"34512"
//left2("Chocolate")	"ocolateCh"
//left2("bricks")	"icksbr"
public String left2(String str)
{	
	return (str.substring(2) + str.substring(0, 2));
}


// Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
// The string length will be at least 2.
//right2("Hello")	"loHel"
//right2("java")	"vaja"
//right2("Hi")	"Hi"
//right2("code")	"deco"
//right2("cat")	"atc"
//right2("12345")	"45123"
public String right2(String str)
{
	int len = str.length()-2;
	return (str.substring(len) + str.substring(0, len));
}


// Given a string, return a string length 1 from its front, unless front is false,
// in which case return a string length 1 from its back. The string will be non-empty.
// theEnd("Hello", true) → "H"
// theEnd("Hello", false) → "o"
// theEnd("oh", true) → "o"
public String theEnd(String str, boolean front)
{
	if(front)
		return str.substring(0, 1);
	return str.substring(str.length()-1);
}

// Given a string, return a version without both the first and last char of the string.
// The string may be any length, including 0. 
//withouEnd2("Hello")	"ell"
//withouEnd2("abc")	"b"
//withouEnd2("ab")	""
//withouEnd2("a")	""
//withouEnd2("")	""
//withouEnd2("coldy")	"old"
//withouEnd2("java code")	"ava cod"
public String withouEnd2(String str)
{
	int len = str.length();
	if(len >= 3)
		return str.substring(1, len-1);
	return "";
}


// Given a string of even length, return a string made of the middle two chars,
// so the string "string" yields "ri". The string length will be at least 2.
//middleTwo("string")	"ri"
//middleTwo("code")	"od"
//middleTwo("Practice")	"ct"
//middleTwo("ab")	"ab"
//middleTwo("0123456789")	"45"

public String middleTwo(String str) 
{
	int half = str.length()/2-1;
	return str.substring(half, half+2);
}


// Given a string, return true if it ends in "ly".
//endsLy("oddly")	true
//endsLy("y")	false
//endsLy("oddy")	false
//endsLy("oddl")	false
//endsLy("olydd")	false
//endsLy("ly")	true
//endsLy("")	false
//endsLy("falsey")	false
//endsLy("evenly")	true
public boolean endsLy(String str)
{
	int len = str.length();
	if(len >= 2)
		return (str.substring(str.length()-2).equals("ly"));
	return false;
}


// Given a string and an int n, return a string made of the first and last n chars from the string.
// The string length will be at least n.
//nTwice("Hello", 2) → "Helo"
//nTwice("Chocolate", 3) → "Choate"
//nTwice("Chocolate", 1) → "Ce"
//nTwice("Hello", 2)	"Helo"
//nTwice("Chocolate", 3)	"Choate"
//nTwice("Chocolate", 1)	"Ce"
//nTwice("Chocolate", 0)	""
//nTwice("Hello", 4)	"Hellello"
//nTwice("Code", 4)	"CodeCode"
//nTwice("Code", 2)	"Code"
public String nTwice(String str, int n)
{	
	return (str.substring(0, n) + str.substring(str.length()-n));	
}


// Given a string and an index, return a string length 2 starting at the given index.
// If the index is too big or too small to define a string length 2, use the first 2 chars.
// The string length will be at least 2.
//twoChar("java", 0)	"ja"
//twoChar("java", 2)	"va"
//twoChar("java", 3)	"ja"
//twoChar("java", 4)	"ja"
//twoChar("java", -1)	"ja"
//twoChar("Hello", 0)	"He"
//twoChar("Hello", 1)	"el"
//twoChar("Hello", 99)	"He"
//twoChar("Hello", 3)	"lo"
//twoChar("Hello", 4)	"He"
//twoChar("Hello", 5)	"He"
//twoChar("Hello", -7)	"He"
//twoChar("Hello", 6)	"He"
//twoChar("Hello", -1)	"He"
//twoChar("yay", 0)	"ya"

public String twoChar(String str, int index)
{
	if(index <= str.length()-2 && index >= 0)
		return str.substring(index, index+2);
	return str.substring(0, 2);
}


// Given a string of odd length, return the string length 3 from its middle,
// so "Candy" yields "and". The string length will be at least 3. 
//middleThree("Candy") → "and"
//middleThree("and") → "and"
//middleThree("solving") → "lvi"
public String middleThree(String str)
{
	int len = str.length()/2;
	return str.substring(len-1,len+2);
}


// Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or
// "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
//hasBad("badxx") → true
//hasBad("xbadxx") → true
//hasBad("xxbadxx") → false
public boolean hasBad(String str)
{
	int len = str.length();
	if(len == 3 && str.equals("bad"))
		return true;
	else if(len >= 4)
	{
		if(str.substring(0, 3).equals("bad"))
			return true;
		return str.substring(1, 4).equals("bad");
	}
	else
		return false;
}


// Given a string, return a string length 2 made of its first 2 chars.
// If the string length is less than 2, use '@' for the missing chars.
//atFirst("hello") → "he"
//atFirst("hi") → "hi"
//atFirst("h") → "h@"
//atFirst("hello")	"he"
//atFirst("hi")	"hi"
//atFirst("h")	"h@"
//atFirst("")	"@@"
//atFirst("kitten")	"ki"
//atFirst("java")	"ja"
//atFirst("j")	"j@"
public String atFirst(String str)
{
	int len = str.length();
	if(len >= 2)
		return str.substring(0, 2);
	else if(len == 1)
		return (str.charAt(0)+"@");
	else
		return "@@";
}


// Given 2 strings, a and b, return a new string made of the first char of a and
// the last char of b, so "yo" and "java" yields "ya". If either string is length 0
// use '@' for its missing char. 
//lastChars("last", "chars")	"ls"
//lastChars("yo", "java")	"ya"
//lastChars("hi", "")	"h@"
//lastChars("", "hello")	"@o"
//lastChars("", "")	"@@"
//lastChars("kitten", "hi")	"ki"
//lastChars("k", "zip")	"kp"
//lastChars("kitten", "")	"k@"
//lastChars("kitten", "zip")	"kp"
public String lastChars(String a, String b)
{
	int lenB = b.length();
	String combStr = "";
	combStr += (a.length() >= 1) ? a.charAt(0) : '@';
	combStr += (lenB >= 1) ? b.charAt(lenB-1) : '@';
	return combStr;
}


// Given two strings, append them together (known as "concatenation") and return the result.
// However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat". 
//conCat("abc", "cat")	"abcat"
//conCat("dog", "cat")	"dogcat"
//conCat("abc", "")	"abc"
//conCat("", "cat")	"cat"
//conCat("pig", "g")	"pig"
//conCat("pig", "doggy")	"pigdoggy"
public String conCat(String a, String b)
{
	int lenA = a.length();
	int lenB = b.length();
	if(lenA >= 1 && lenB >= 1)
	{
		if(a.charAt(lenA-1) == b.charAt(0))
			return (a + b.substring(1));
		else
			return (a + b);
	}
	return (a + b);
}


// Given a string of any length, return a new string where the last 2 chars
// if present, are swapped, so "coding" yields "codign".
//lastTwo("coding")	"codign"
//lastTwo("cat")	"cta"
//lastTwo("ab")	"ba"
//lastTwo("a")	"a"
//lastTwo("")	""
public String lastTwo(String str)
{
	int len = str.length();
	if(len >= 2)
		return str.substring(0, len-2)+str.charAt(len-1)+str.charAt(len-2);
	else
		return str;
}


// Given a string, if the string begins with "red" or "blue" return that color string
// otherwise return the empty string.
public String seeColor(String str)
{
	int len = str.length();
	if(len >= 4)
	{
		if(str.substring(0, 4).equals("blue"))
			return "blue";
		else if(str.substring(0, 3).equals("red"))
			return "red";
		else
			return "";
	}	
	else if(len == 3)
	{
		if(str.substring(0, 3).equals("red"))
			return "red";
		else
			return "";
	}
	else
		return "";
}


// Given a string, return true if the first 2 chars in the string also appear
// at the end of the string, such as with "edited". 
public boolean frontAgain(String str)
{
	int len = str.length();
	if(len >= 2)
		return str.substring(0, 2).equals(str.substring(len-2, len));
	else
		return false;
}
// Given two strings, append them together (known as "concatenation") and return the result.
// However, if the strings are different lengths, omit chars from the longer string so it is the
// same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length. 
public String minCat(String a, String b)
{
	int lenA = a.length();
	int lenB = b.length();
	if(lenA >= lenB)
		return (a.substring(lenA-lenB) + b);
	else
		return (a + b.substring(lenB-lenA));
}


// Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
// The string may be any length. If there are fewer than 2 chars, use whatever is there. 
public String extraFront(String str)
{
	String temp;
	if(str.length() >= 3)
		temp = str.substring(0, 2);
	else
		temp = str;
	return (temp + temp + temp);
}


// Given a string, if a length 2 substring appears at both its beginning and end,
// return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
// The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
public String without2(String str)
{
	int len = str.length();
	if(len >= 2)
	{
		if(str.substring(0,2).equals(str.substring(len-2, len)))
			return str.substring(2);
		else
			return str;
	}
	else
		return str;
}


// Given a string, return a version without the first 2 chars. Except keep the first char
// if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks. 
public String deFront(String str)
{    
	int len = str.length();
	if(len >= 2)
	{
		StringBuilder stbuild = new StringBuilder(len);
		if(str.charAt(0) == 'a')
			stbuild.append('a');
		if(str.charAt(1) == 'b')
			stbuild.append('b');
		stbuild.append(str.substring(2));
		return stbuild.toString();
	}
	else if(len == 1 && str.charAt(0) == 'a')
		return "a";
	else
		return "";
}


// Given a string and a second "word" string, we'll say that the word matches the string if it appears at
// the front of the string, except its first char does not need to match exactly. On a match, return the
// front of the string, or otherwise return the empty string. So, so with the string "hippo" the word
// "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
public String startWord(String str, String word)
{
	int lenStr = str.length();
	int lenWord = word.length();
	String temp;
	if(lenStr >= lenWord)
	{
		temp = str.substring(1, lenWord);
		if(word.substring(1).equals(temp))
			return (str.charAt(0)+temp);
		else
			return "";
	}
	else
		return "";
}


// Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
// and otherwise return the string unchanged. 
public String withoutX(String str)
{
	int len = str.length();
	if(len >= 2)
	{
		char ch = str.charAt(0);
		StringBuilder stbuild = new StringBuilder(len);
		if(ch != 'x')
			stbuild.append(ch);
		stbuild.append(str.substring(1, len-1));
		ch = str.charAt(len-1);
		if(ch != 'x')
			stbuild.append(ch);
		return stbuild.toString();
	}
	else if(len == 1 && str.charAt(0) == 'x')
		return "";
	else
		return str;
}


// Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars
// and otherwise return the string unchanged. This is a little harder than it looks. 
public String withoutX2(String str)
{
	int len = str.length();
	if(len >= 2)
	{
		char ch = str.charAt(0);
		StringBuilder stbuild = new StringBuilder(len);
		if(ch != 'x')
			stbuild.append(ch);
		ch = str.charAt(1);
		if(ch != 'x')
			stbuild.append(ch);
		stbuild.append(str.substring(2));
		return stbuild.toString();
	}
	else if(len == 1 && str.charAt(0) == 'x')
		return "";
	else
		return str;
}
