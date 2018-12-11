package com.strings;

import java.util.Locale;

public class LowerCase {
	public static void main(String[] args) {
		String s="JAVATPOi4NT HelLo StrINg";
		String eng=s.toLowerCase(Locale.forLanguageTag("at"));
		System.out.println(eng);
	}

}
