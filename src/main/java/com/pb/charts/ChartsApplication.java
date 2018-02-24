package com.pb.charts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pb.charts.dao") //搜索该目录下的mapper接口，与mapper接口的@Mapper二选一使用
public class ChartsApplication {

	public static void main(String[] args) {

	    SpringApplication.run(ChartsApplication.class, args);
	}


}
