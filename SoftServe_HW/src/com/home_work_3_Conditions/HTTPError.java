package com.home_work_3_Conditions;

import java.util.HashMap;
import java.util.Scanner;

public enum HTTPError 
{

	Err_100(100,"Continue"),
	Err_101(101,"Switching protocols"),
	Err_102(102,"Processing"),
	Err_103(103,"Early Hints"),
	Err_200(200,"OK"),
	Err_201(201,"Created"),
	Err_202(202,"Accepted"),
	Err_203(203,"Non-Authoritative Information"),
	Err_204(204,"No Content"),
	Err_205(205,"Reset Content"),
	Err_206(206,"Partial Content"),
	Err_207(207,"Multi-Status"),
	Err_208(208,"Already Reported"),
	Err_226(226,"IM Used"),
	Err_300(300,"Multiple Choices"),
	Err_301(301,"Moved Permanently"),
	Err_302(302,"Found (Previously Moved Temporarily"),
	Err_303(303,"See Other"),
	Err_304(304,"Not Modified"),
	Err_305(305,"Use Proxy"),
	Err_306(306,"Switch Proxy"),
	Err_307(307,"Temporary Redirect"),
	Err_308(308,"Permanent Redirect"),
	Err_400(400,"Bad Request"),
	Err_401(401,"Unauthorized"),
	Err_402(402,"Payment Required"),
	Err_403(403,"Forbidden"),
	Err_404(404,"Not Found"),
	Err_405(405,"Method Not Allowed"),
	Err_406(406,"Not Acceptable"),
	Err_407(407,"Proxy Authentication Required"),
	Err_408(408,"Request Timeout"),
	Err_409(409,"Conflict"),
	Err_410(410,"Gone"),
	Err_411(411,"Length Required"),
	Err_412(412,"Precondition Failed"),
	Err_413(413,"Payload Too Large"),
	Err_414(414,"URI Too Long"),
	Err_415(415,"Unsupported Media Type"),
	Err_416(416,"Range Not Satisfiable"),
	Err_417(417,"Expectation Failed"),
	Err_418(418,"I'm a Teapot"),
	Err_421(421,"Misdirected Request"),
	Err_422(422,"Unprocessable Entity"),
	Err_423(423,"Locked"),
	Err_424(424,"Failed Dependency"),
	Err_425(425,"Too Early"),
	Err_426(426,"Upgrade Required"),
	Err_428(428,"Precondition Required"),
	Err_429(429,"Too Many Requests"),
	Err_431(431,"Request Header Fields Too Large"),
	Err_451(451,"Unavailable For Legal Reasons"),
	Err_500(500,"Internal Server Error"),
	Err_501(501,"Not Implemented"),
	Err_502(502,"Bad Gateway"),
	Err_503(503,"Service Unavailable"),
	Err_504(504,"Gateway Timeout"),
	Err_505(505,"HTTP Version Not Supported"),
	Err_506(506,"Variant Also Negotiates"),
	Err_507(507,"Insufficient Storage"),
	Err_508(508,"Loop Detected"),
	Err_510(510,"Not Extended"),
	Err_511(511,"Network Authentication Required");


	private final int p1;
	private final String p2;	
	private static HashMap<Integer, String> mapHTTPErrors = new HashMap<Integer, String>();

	private HTTPError(int p1, String p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}

	public int getP1() 
	{
		return p1;
	}

	public String getP2() 
	{
		return p2;
	}

	private static void buffer()
	{
		for(int i=0;i < HTTPError.values().length; i++) 
		{
			mapHTTPErrors.put( HTTPError.values()[i].getP1(), HTTPError.values()[i].getP2());
		}
	}

	public static void getValues(int httpErrCode) 
	{
		buffer();

		if(mapHTTPErrors.containsKey(httpErrCode)) 
		{
			System.out.println("HTTP error code: " + httpErrCode + "; Description: " + mapHTTPErrors.get(httpErrCode));
		}
	}

	protected static int checkInFormatIntOrExit(Scanner in)
	{
		String in_word;

		do 
		{
			System.out.println("Please, enter HTTP error number, or q for exit.");
			try 
			{
				while(!"q".equals( in_word = in.next() ) && Integer.parseInt(in_word) <= 0)
				{
					System.out.println("Please, enter value greater than zero, or for exit enter: q.");
				}

				return "q".equals(in_word) ? -1 : Integer.parseInt(in_word);

			}
			catch(NumberFormatException exc)
			{
				System.out.println("Please, enter value greater than zero, or for exit enter: q.");
			}
		}while(true); 
	}
}