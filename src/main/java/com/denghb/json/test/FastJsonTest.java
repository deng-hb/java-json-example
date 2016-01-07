package com.denghb.json.test;

import com.alibaba.fastjson.JSON;

public class FastJsonTest {

	public static void main(String[] args) {
		String string = "{\"name\": \"张三\",\"addtime\": \"2014-01-01\",\"username\": \"abc\", \"id\": 5,\"items\": {\"asd\": \"sdas\"}, \"sss\": [\"asdas\",\"asdas\"]}";
		JsonResult result = JSON.parseObject(string, JsonResult.class);
		System.out.println(result.getAddtime());
		System.out.println(result.getName());
	}
}
