package com.denghb.json.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String string = "{\"name\": \"张三\",\"addtime\": \"2014-01-01\",\"username\": \"abc\", \"id\": 5,\"items\": {\"asd\": \"sdas\"}, \"sss\": [\"asdas\",\"asdas\"]}";

		ObjectMapper objectMapper = new ObjectMapper();
		JsonResult result = objectMapper.readValue(string, JsonResult.class);
		
		System.out.println(result.getName());
	}
}
