package com.qilinxx.kuding;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * @Auther: ljm
 * @Date: 2018-09-07 17:14
 * @Description: 打war控制转化
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(KudingApplication.class);
	}

}
