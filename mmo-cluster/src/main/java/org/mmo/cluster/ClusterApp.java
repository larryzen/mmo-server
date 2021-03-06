package org.mmo.cluster;

import org.mmo.cluster.service.ServerService;
import org.mmo.cluster.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 集群启动类
 * 
 * @author JiangZhiYong
 * @mail 359135103@qq.com
 */
@SpringBootApplication
@ComponentScan("org.mmo")
public class ClusterApp implements CommandLineRunner{
	private static final Logger LOGGER=LoggerFactory.getLogger(ServerService.class);
	
	@Autowired
	private TestService testService;
	
	public static void main(String[] args) {
		SpringApplication.run(ClusterApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (args.length > 0) {
            System.out.println(testService.getMessage(args[0].toString()));
        } else {
        	LOGGER.debug(testService.getMessage());
        }

//       System.exit(0);
	}
	
	
}
