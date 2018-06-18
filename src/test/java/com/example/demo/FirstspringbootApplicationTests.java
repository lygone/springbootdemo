package com.example.demo;

import com.example.demo.dao.GirlRep;
import com.example.demo.some.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstspringbootApplicationTests {

	@Autowired
	private Girl girl;
	@Autowired
	private GirlRep girlRep;
	@Test
	public void contextLoads() {
		girl.setId(null);
		girl.setAge(20);
		girl.setCupSize("B");
		girlRep.save(girl);

	}

}
