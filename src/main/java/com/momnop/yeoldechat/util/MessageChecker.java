package com.momnop.yeoldechat.util;

public class MessageChecker {
	
	public static String checkString(String checkedString) {
		
		String s0 = checkedString.toLowerCase();
		String s1 = s0.replace(" good", " favorable");
		String s2 = s1.replace(" it is", " 'tis");
		String s3 = s2.replace(" it was", " 'twas");
		String s4 = s3.replace(" it would", " 'twould");
		String s5 = s4.replace(" it will", " 'twill");
		String s6 = s5.replace(" it were", " 'twere");
		String s7 = s6.replace(" shall not", " shan't");
		String s8 = s7.replace(" will not", " shan't");
		String s9 = s8.replace(" over there", " yonder");
		String s10 = s9.replace(" in the", " i' the");
		String s11 = s10.replace(" thank you", MessageDatabase.getRandomReplacedWord("thankyou"));
		String s12 = s11.replace(" you", MessageDatabase.getRandomReplacedWord("you"));
		String s13 = s12.replace(" are", " art");
		String s14 = s13.replace(" lol", MessageDatabase.getRandomReplacedWord("lol"));
		String s15 = s14.replace(" killed", MessageDatabase.getRandomReplacedWord("killed"));
		String s16 = s15.replace(" beaten", MessageDatabase.getRandomReplacedWord("killed"));
		String s17 = s16.replace(" goodbye", MessageDatabase.getRandomReplacedWord("bye"));
		String s18 = s17.replace(" bye", MessageDatabase.getRandomReplacedWord("bye"));
		String s19 = s18.replace(" seeya", MessageDatabase.getRandomReplacedWord("bye"));
		String s20 = s19.replace(" goodnight", MessageDatabase.getRandomReplacedWord("bye"));
		String s21 = s20.replace(" idiot", MessageDatabase.getRandomReplacedWord("insult-prepend") + MessageDatabase.getRandomReplacedWord("insult-prepend") + MessageDatabase.getRandomReplacedWord("insult"));
		String s22 = s21.replace(" fool", MessageDatabase.getRandomReplacedWord("insult-prepend") + MessageDatabase.getRandomReplacedWord("insult-prepend") + MessageDatabase.getRandomReplacedWord("insult"));
		String s23 = s22.replace(" bastard", MessageDatabase.getRandomReplacedWord("insult-prepend") + MessageDatabase.getRandomReplacedWord("insult-prepend") + MessageDatabase.getRandomReplacedWord("insult"));
		String s24 = s23.replace(" yes", MessageDatabase.getRandomReplacedWord("yes"));
		String s25 = s24.replace(" noob", MessageDatabase.getRandomReplacedWord("noob"));
		String s26 = s25.replace(" hello", MessageDatabase.getRandomReplacedWord("hello"));
		String s27 = s26.replace(" hi", MessageDatabase.getRandomReplacedWord("hello"));
		String s28 = s27.replace(" kill", MessageDatabase.getRandomReplacedWord("kill"));
		String s29 = s28.replace(" gank", MessageDatabase.getRandomReplacedWord("kill"));
		String s30 = s29.replace(" your", MessageDatabase.getRandomReplacedWord("your"));
		String s31 = s30.replace(" my", " mine");
		String s32 = s31.replace(" in", " within");
		String s321 = s32.replace(" withinsane", " insane");
		String s33 = s321.replace(" it's", "'tis");
		//String s34 = s33.replace(" the", " ye");
		String s35 = s33.replace(" joke", MessageDatabase.getRandomReplacedWord("joke"));
		//String s36 = s35.replace(" go", " be off");
		String s37 = s35.replace(" will", MessageDatabase.getRandomReplacedWord("will"));
		String s38 = s37.replace(" gold", MessageDatabase.getRandomReplacedWord("money"));
		String s39 = s38.replace(" money", MessageDatabase.getRandomReplacedWord("money"));
		String s40 = s39.replace(" balls", MessageDatabase.getRandomReplacedWord("balls"));
		String s41 = s40.replace(" groin", MessageDatabase.getRandomReplacedWord("balls"));
		String s42 = s41.replace(" water", MessageDatabase.getRandomReplacedWord("water"));
		String s43 = s42.replace(" food", MessageDatabase.getRandomReplacedWord("food"));
		String s44 = s43.replace(" afk", MessageDatabase.getRandomReplacedWord("afk"));
		String s45 = s44.replace(" aggro", " wrath");
		String s46 = s45.replace(" town", MessageDatabase.getRandomReplacedWord("town"));
		String s47 = s46.replace(" village", MessageDatabase.getRandomReplacedWord("town"));
		String s48 = s47.replace(" home", MessageDatabase.getRandomReplacedWord("town"));
		String s49 = s48.replace(" sell", MessageDatabase.getRandomReplacedWord("sell"));
		String s50 = s49.replace(" buy", MessageDatabase.getRandomReplacedWord("buy"));
		String s51 = s50.replace(" debuff", MessageDatabase.getRandomReplacedWord("debuff"));
		String s52 = s51.replace(" map", " chart");
		String s53 = s52.replace(" between", " betwixt");
		String s54 = s53.replace(" thank", MessageDatabase.getRandomReplacedWord("thank"));
		String s55 = s54.replace(" thx", MessageDatabase.getRandomReplacedWord("thank"));
		String s56 = s55.replace(" please", MessageDatabase.getRandomReplacedWord("please"));
		String s57 = s56.replace(" ok", MessageDatabase.getRandomReplacedWord("ok"));
		String s58 = s57.replace(" is", " be");
		String s59 = s58.replace(" party", MessageDatabase.getRandomReplacedWord("party"));
		String s60 = s59.replace(" group", MessageDatabase.getRandomReplacedWord("party"));
		String s61 = s60.replace(" nub", MessageDatabase.getRandomReplacedWord("noob"));
		String s62 = s61.replace(" no", MessageDatabase.getRandomReplacedWord("no"));
		String s63 = s62.replace(" beginner", MessageDatabase.getRandomReplacedWord("noob"));
		String s64 = s63.replace(" god", " " + MessageDatabase.getRandomGod());
		String s65 = s64.replace(" level", MessageDatabase.getRandomReplacedWord("level"));
		String s66 = s65.replace(" wait", MessageDatabase.getRandomReplacedWord("wait"));
		String s67 = s66.replace(" need", MessageDatabase.getRandomReplacedWord("need"));
		String s68 = s67.replace(" even", " e'en");
		String s69 = s68.replace(" never", " ne'er");
		String s70 = s69.replace(" over", " o'er");
		String s71 = s70.replace(" before", " 'ere");
		String s72 = s71.replace(" unless", " lest");
		String s73 = s72.replace(" haha", MessageDatabase.getRandomReplacedWord("haha"));
		String s74 = s73.replace(" hehe", MessageDatabase.getRandomReplacedWord("haha"));
		String s75 = s74.replace(" heh", MessageDatabase.getRandomReplacedWord("haha"));
		String s76 = s75.replace(" hah", MessageDatabase.getRandomReplacedWord("haha"));
		String s77 = s76.replace(" shop", MessageDatabase.getRandomReplacedWord("shop"));
		String s78 = s77.replace(" store", MessageDatabase.getRandomReplacedWord("shop"));
		String s79 = s78.replace(" vendor", MessageDatabase.getRandomReplacedWord("vendor"));
		String s80 = s79.replace(" seller", MessageDatabase.getRandomReplacedWord("vendor"));
		String s81 = s80.replace(" friend", MessageDatabase.getRandomReplacedWord("friend"));
		String s82 = s81.replace(" buddy", MessageDatabase.getRandomReplacedWord("friend"));
		String s83 = s82.replace(" pal", MessageDatabase.getRandomReplacedWord("friend"));
		String s84 = s83.replace(" mate", MessageDatabase.getRandomReplacedWord("friend"));
		String s85 = s84.replace(" teh", " the");
		String s86 = s85.replace(" assist", MessageDatabase.getRandomReplacedWord("assist"));
		String s87 = s86.replace(" could", " couldst");
		String s88 = s87.replace(" would", " wouldst");
		String s89 = s88.replace(" sure", " shore");
		String s90 = s89.replace(" maybe", MessageDatabase.getRandomReplacedWord("maybe"));
		String s91 = s90.replace(" girl", MessageDatabase.getRandomReplacedWord("girl"));
		String s92 = s91.replace(" woman", MessageDatabase.getRandomReplacedWord("girl"));
		String s93 = s92.replace(" later", " anon");
		String s94 = s93.replace(" often", " oft");
		String s95 = s94.replace(" really", MessageDatabase.getRandomReplacedWord("really"));
		String s96 = s95.replace(" those", " yon");
		String s97 = s96.replace(" here", " hither");
		String s98 = s97.replace(" enough", " enow");
		String s99 = s98.replace(" wow", MessageDatabase.getRandomReplacedWord("wow"));
		String s100 = s99.replace(" child", " poppet");
		String s101 = s100.replace(" why", " wherefore");
		String s102 = s101.replace(" away", " aroint");
		String s103 = s102.replace(" being", " bein'");
		String s104 = s103.replace(" of", " o'");
		String s105 = s104.replace(" fucker", " swiver");
		String s106 = s105.replace(" shit", " nightsoil");
		String s107 = s106.replace(" making", " a-makin'");
		String s108 = s107.replace(" though", " tho'");
		String s109 = s108.replace(" until", " 'till");
		String s110 = s109.replace(" underneath", " 'neath");
		String s111 = s110.replace(" beneath", " 'neath");
		String s112 = s111.replace(" coming", " a-comin");
		String s113 = s112.replace(" walking", " a-walkin");
		String s114 = s113.replace(" hunting", " a-huntin");
		//String s115 = s114.replace(" ", " warrant");
		String s116 = s114.replace("!", MessageDatabase.getRandomReplacedWord("!"));
		String s117 = s116.replace("?", MessageDatabase.getRandomReplacedWord("?"));
		String s118 = s117.replace(" flag", MessageDatabase.getRandomReplacedWord("flag"));
		String s119 = s118.replaceFirst(s118.valueOf(s118.charAt(0)), s118.valueOf(s118.charAt(0)).toUpperCase());
		
		return s119;
	}
	
}
