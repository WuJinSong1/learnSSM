package test;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnssm.model.SsmDemo;
import com.learnssm.service.SsmDemoService;

public class test01 {

	private ApplicationContext ctx = null;

	@Before
	public void doBefore() {
		ctx = new ClassPathXmlApplicationContext("classpath:config/spring.xml");
	}

	@Test
	public void test() {
		SsmDemoService ssmDemoService = ctx.getBean(SsmDemoService.class);

		List<SsmDemo> beans = ssmDemoService.getAllRecords();
		// java8 的遍历方式，笔者这里是图方便，反正最终是要便利list，自己看咯，哈哈
		beans.forEach(e -> System.out.println(e));

	}

}
