package com.lvpf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * springmvc处理过程
 *  1、浏览器首先会发送一个请求 http://localhost:8080/springmvc_helloword_war_exploded/hello
 *  2、首先交给tomcat容器
 *  3、在web.xml文件中配置了DispatcherServlet的类，所以此时会由当前的DispatcherServlet来接受请求
 *  4、接收到当前请求之后找到对应的Controller，去Controller中寻找@requestMapping注解标识的方法
 *  5、找到匹配的方法之后，执行方法的逻辑
 *  6、处理完成之后需要返回一个前端页面的名程；
 *  7、有视图处理器来根据名称映射到对应的jsp页面路径
 *  8、DispatcherServlet拿到对应的路径地址之后，返回给浏览器
 *
 */


@Controller
@RequestMapping("/hello")
public class HelloController {

	/**
	 * @RequestMapping表示用来匹配当前方法要处理的请求，其中/可以写也可以不写，一般推荐写上
	 * @RequestMapping可以添加到类上也可以添加到方法上
	 *          方法：http://localhost:8080/springmvc_helloword_war_exploded/hello/hello
	 *          类：http://localhost:8080/springmvc_helloword_war_exploded/hello
	 * 当添加在类上的时候表示给当前所有的当前类的方法前添加一个访问路径
	 *
	 *          添加到类上：
	 *        当包含多个Controller，通过在不同的Controller中包含同名的请求的时候，需要添加
	 *
	 * @param map
	 * @return
	 *
	 * @RequestMapping配置的参数
	 *  value：表示要匹配的请求
	 *  method：表示请求的方式，post get
	 *  params：表示要求请求中必须要包含的参数  "!username" 不能包含的参数名称
	 *  必须要包含username，age两个属性值，并且username的值为 zhangsan
	 *  @RequestMapping(value = "/hello",method = RequestMethod.POST,params = {"username=zhangsan","age"})
	 *
	 *  headers:表示限制请求头中的相关属性值，用来做请求限制
	 *
	 *  produces；限制请求中的Content-Type
	 *
	 *  consumes：限制响应中的Content-Type
	 *
	 *
	 * @RequestMapping可以进行模糊匹配
	 *          ？：替代任意一个字符
	 *         *：替代多个字符
	 *         **：替代多层路径
	 *  如果能匹配到多个请求，那么优先是精准匹配，其次是模糊匹配
	 */

	@RequestMapping(value = "/hello")
	public String hello(Map<String,String> map){
		map.put("hello","hello,Springmvc");
		return "hello";
	}



	/*@Override
	public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

		System.out.println(this.getClass().getName()+"------------");
		//创建对象
		ModelAndView mv = new ModelAndView();
		//添加视图名称，要跳转的页面的名称
		mv.setViewName("hello");
		//向前端页面添加的属性值
		mv.addObject("hello","hello,springmvc");
		return mv;
	}*/
}
