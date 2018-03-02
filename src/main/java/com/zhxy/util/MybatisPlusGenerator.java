package com.zhxy.util;

import java.util.*;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MybatisPlusGenerator {

    public static void main(String[] args) {

        AutoGenerator mpg = new AutoGenerator().setGlobalConfig(// 全局配置
                new GlobalConfig()
                        .setOutputDir("G:\\Workspace\\idea\\springbootdemo\\src\\main\\java\\")//代码输出目录
                        .setAuthor("zhuxuanyu")//作者
                        .setFileOverride(true)//覆盖
                        .setActiveRecord(true)//活动记录
                        .setEnableCache(false)//XML 二级缓存
                        .setBaseResultMap(true)//XML ResultMap
                        .setBaseColumnList(true)//XML ColumnList
        ).setDataSource(// 数据源配置
                new DataSourceConfig()
                        .setDbType(DbType.MYSQL)// 数据库类型
                        .setTypeConvert(new MySqlTypeConvert() {
                            // 自定义数据库表字段类型转换【可选】
                            @Override
                            public DbColumnType processTypeConvert(String fieldType) {
                                if ( fieldType.toLowerCase().contains( "tinyint" ) ) {
                                    return DbColumnType.BOOLEAN;
                                }
                                return super.processTypeConvert(fieldType);
                            }
                        })
                        .setDriverName("com.mysql.jdbc.Driver")
                        .setUsername("root")
                        .setPassword("zhxy")
                        .setUrl("jdbc:mysql://localhost:3306/jiongzhu?useUnicode=true&characterEncoding=utf-8&useSSL=false")
        ).setStrategy(// 策略配置
                new StrategyConfig()
                        .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
                        .setInclude((new String[]{"customers","orderitems","orders","products","users","vendors" })) // 需要生成的表
                        .setEntityLombokModel(true)
        ).setPackageInfo(// 包配置
                new PackageConfig()
                        .setModuleName("zhxy")
                        .setParent("com")// 自定义包路径
                        .setController("controller")// 这里是控制器包名，默认 web
                        .setEntity("entity")
                        .setMapper("mapper")
                        .setService("service")
                        .setServiceImpl("service.impl")
        ).setCfg(
                // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
                new InjectionConfig() {
                    @Override
                    public void initMap() {
                        //Map<String, Object> map = new HashMap<>();
                        //map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                        //this.setMap(map);
                    }
                }.setFileOutConfigList(Collections.singletonList(new FileOutConfig("templates\\mp\\mapper.xml.vm") {
                    // 自定义输出文件目录
                    @Override
                    public String outputFile(TableInfo tableInfo) {
                        return "G:\\Workspace\\idea\\springbootdemo\\src\\main\\resources\\mapper\\" + tableInfo.getEntityName() + ".xml";
                    }
                }))
        ).setTemplate(
                new TemplateConfig().setXml(null)
                        .setController(null)
        );

        // 执行生成
        mpg.execute();
    }

}

