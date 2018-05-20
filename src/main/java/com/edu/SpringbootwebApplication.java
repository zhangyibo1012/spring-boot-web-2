package com.edu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *  ResourceProperties.class 框架的web资源配置
 *  resource 属于classspath
 *  springboot处理静态资源
 * 	第一种：src/main/webapp目录下，就可以直接访问
 * 	第二种：默认4个静态资源的路径：
 * "classpath:/META-INF/resources/", "classpath:/resources/",
 * "classpath:/static/", "classpath:/public/" ;
 *  3.可以通过spring.resource,staticLocations配置文件修改默认静态资源的路径
 *
 * 拦截器使用步骤：
 * 1.写一个拦截器类，实现HandlerInterceptor接口
 * 2.写一个配置类,实现WebMvcConfigurer接口，重写addInterceptors方法，注册拦截器 registry.addInterceptor(new LoginHandlerInterceptor());
 *
 * 异常处理：
 * 排除springboot默认的异常处理逻辑
 * @SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
 *
 * 使用ErrorPageRegistrar处理指定异常页面
 * 写一个类,实现ErrorPageRegistrar接口,实现registerErrorPages方法,注册错误页面
 *
 * 全局异常处理步骤：
 * 1.写一个类，加上注解@ControllerAdvice
 * 2.写一个处理方法，需要加上注解@ExceptionHandler(value = Exception.class) @ResponseBody  value值可以更具体些
 *
 *  public String errorHandler(Exception e) {
 *		return "global error" + e.getClass().getName();
 *	}
 *
 * @EnableTransactionManagement //开启事务 在需要事务的方法添加@Transactional
 * 默认只对运行时异常进行事务回滚控制
 * @Transactional(rollbackFor=Exception.class)设置对哪些异常进行回滚 默认运行时
 * @Transactional(noollbackFor=Exception.class)设置对哪些异常不进行回滚 默认运行
 */
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
 //开启事务 在需要的方法添加@Transactional
@EnableTransactionManagement
public class SpringbootwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwebApplication.class, args);

	}
}
