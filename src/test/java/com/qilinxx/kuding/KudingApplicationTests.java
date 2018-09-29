package com.qilinxx.kuding;

import com.qilinxx.kuding.domain.mapper.StudentMapper;
import com.qilinxx.kuding.domain.mapper.TeacherMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KudingApplicationTests {

	@Autowired
	StudentMapper studentMapper;
	@Autowired
	TeacherMapper teacherMapper;
	@Test
	public void contextLoads() {
//		String s = studentMapper.selectNameById("01htlg0tgsj9hotduvc6k294lt");
//		System.out.println(s);
		String t = teacherMapper.selectNameById("subp1cf7guhspqkv0t21d6qo0m");
		System.out.println(t);
	}

}
