package com.marobiana.ex.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/ex01")
public class Ex01Controllerr {
	
	@RequestMapping("1")
	@ResponseBody
	public String printString() {
		return "예제 1번 문자열을 response 에 출력한다.";
	}
	
	@RequestMapping("2")
	@ResponseBody
	public Map<String, Object> printMap(){
		Map<String, Object> map = new HashMap<>();
		// 과일 이름과 가격 (리턴타입 Map이기에 제이슨 형태)
		map.put("apple", 1500);
		map.put("orange", 1000);
		map.put("banan", 5000);
		return map;
	}
	
	
}
