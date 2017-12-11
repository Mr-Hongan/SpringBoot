package com.lha.config;

import com.jolbox.bonecp.BoneCPDataSource;
import com.lha.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @Desrciption
 * @Author Lu.Hongan
 * @Date Created on 2017-12-10 00:09
 */
@Configuration
@ComponentScan(basePackages="com.lha")
@PropertySource(value={"classpath:jdbc.properties"},ignoreResourceNotFound = true)
public class SpringConfig {

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    @Value("${jdbc.username}")
    private String userName;

    @Value("${jdcb.password}")
    private String password;

    public DataSource dataSource(){
        BoneCPDataSource boneCPDataSource=new BoneCPDataSource();

        //数据库驱动
        boneCPDataSource.setDriverClass(driverClassName);
        //相应驱动的JdbcUrl
        boneCPDataSource.setJdbcUrl(jdbcUrl);
        //数据库用户名
        boneCPDataSource.setUsername(userName);
        //数据库密码
        boneCPDataSource.setPassword(password);
        //检查数据库连接池中空闲连接的间隔时间，单位是分，默认值：240，如果要取消设置为0
        boneCPDataSource.setIdleConnectionTestPeriodInMinutes(60);
        //连接池中未使用的链接最大存活时间，单位是分，默认值：60，如果要设置永远存活则为0
        boneCPDataSource.setIdleMaxAgeInMinutes(30);
        //每个分区最大的连接数
        boneCPDataSource.setMaxConnectionsPerPartition(200);
        //每个分区最小的连接数
        boneCPDataSource.setMinConnectionsPerPartition(5);
        return boneCPDataSource;
    }

    @Bean
    public UserDao getUserDao(){
        return new UserDao();
    }
}
