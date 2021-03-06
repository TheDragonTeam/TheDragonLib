package net.thedragonteam.thedragonlib.network.internet;

public class GETResponse {

	public int statuscode;
	public String result;
	public String target;
	public String params;
	public String useragent;
	
	public GETResponse(int code){
		statuscode = code;
		result = "";
		target = "";
		params = "";
		useragent = "";
	}
	
	public GETResponse(String res){
		statuscode = 200;
		result = res;
		target = "";
		params = "";
		useragent = "";
	}
	
	public GETResponse(int code, String res){
		statuscode = code;
		result = res;
		target = "";
		params = "";
		useragent = "";
	}
	
	public GETResponse(int code, String res, String tar){
		statuscode = code;
		result = res;
		target = tar;
		params = "";
		useragent = "";
	}
	
	public GETResponse(int code, String res, String tar, String par){
		statuscode = code;
		result = res;
		target = tar;
		params = par;
		useragent = "";
	}
	
	public GETResponse(int code, String res, String tar, String par, String agent){
		statuscode = code;
		result = res;
		target = tar;
		params = par;
		useragent = agent;
	}
	
}
