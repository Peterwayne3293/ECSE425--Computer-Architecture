package edumips64.core;

import edumips64.utils.*;
import java.util.*;
import edumips64.core.is.*;
import java.util.logging.Logger;


public class Cache{
	private Map<Integer , String> cache;
	final int tagLength= ;
	final int indexLength= ;
	final int BlockLength= ;



	public Cache(){
		cache = new HashMap<Integer,String>();
	}

	private class block{

	}




	private int getTag(int address){
		String addressBinary = Integer.toBinaryString(no);
		String tagString=substring(0, tagLength);
		int tag=Integer.parseInt(tagString);
		return tag;
	}

	private int getIndex(int address){
		String addressBinary = Integer.toBinaryString(no);
		String iString=substring(tagLength, tagLength+indexLength);
		int i=Integer.parseInt(iString);
		return i;
	}





}