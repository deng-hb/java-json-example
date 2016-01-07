package com.denghb.json.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTest {

	public static void main(String[] args) {
		String string = "{\"name\": \"张三\",\"addtime\": \"2014-01-01\",\"username\": \"abc\", \"id\": 5,\"items\": {\"asd\": \"sdas\"}, \"sss\": [\"asdas\",\"asdas\"]}";
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		
		JsonResult result = gson.fromJson(string, JsonResult.class);
		
		System.out.println(result.getName());
	}
	
}
