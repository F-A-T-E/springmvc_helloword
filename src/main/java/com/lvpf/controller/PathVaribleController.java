package com.lvpf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVaribleController {
	/**
	 * @PathVariable可以获取请求路径中的值
	 * 在路径中要使用{变量名称}做表示
	 * 在方法参数中可以添加@PathVariable做标识，如果路径中的名称跟参数的名称不一致的时候，可以添加路径中的变量，推荐添加
	 * @param id
	 * @param name
	 * @return
	 */
	@RequestMapping("/testPathVariable/{id}/{name}")
	public String testPathVariable(@PathVariable("id") Integer id,@PathVariable("name") String name){
		System.out.println(id);
		System.out.println(name);
		return "hello";
	}
}
