package com.base.demo;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.base.entities.User;
import com.base.gen.GenCodeService;
import com.base.gen.vo.TableVo;
import com.base.repository.UserRepository;

import ch.qos.logback.core.net.SyslogOutputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseApplicationTests {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	GenCodeService genCodeService; 
	
	@Test
	public void testJpa() throws SQLException {
		
		List<TableVo> allTable = genCodeService.getAllTable();
		System.out.println(allTable);
	}

}
