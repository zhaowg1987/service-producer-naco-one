package com.jiukeshuke.serviceproducernacos.config;


import org.springframework.context.annotation.Configuration;

/*import com.zaxxer.hikari.HikariDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;*/

/**
 * 分布式事务数据库代理类
 *
 * @Author
 * @create 2019-06-20
 **/
@Configuration
public class DataSourceProxyConfig {

 /*   @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return new DruidDataSource();
    }*/

//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.hikari")
//    public DataSource dataSource() {
//        return new HikariDataSource();
//    }
//
//    @Bean
//    public DataSourceProxy dataSourceProxy(DataSource dataSource) {
//        return new DataSourceProxy(dataSource);
//    }
//
//    /**   mybatis 配置路径     */
//    private static String MYBATIS_CONFIG = "mybatis-config.xml";
//    /**   mybatis mapper resource 路径     */
//    private static String MAPPER_PATH = "mapper/**/*.xml";
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactoryBean(DataSourceProxy dataSourceProxy) throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSourceProxy);
//
//        /** 设置mybatis configuration 扫描路径 */
//        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(MYBATIS_CONFIG));
//        /** 添加mapper 扫描路径 */
//        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
//        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + MAPPER_PATH;
//        sqlSessionFactoryBean.setMapperLocations(pathMatchingResourcePatternResolver.getResources(packageSearchPath));
//        return sqlSessionFactoryBean.getObject();
//    }
//
//
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer(){
//        MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
//        //可以通过环境变量获取你的mapper路径,这样mapper扫描可以通过配置文件配置了
//        scannerConfigurer.setBasePackage("com.jiukeshuke.serviceproducernacos.**.dao");
//        return scannerConfigurer;
//    }

}
