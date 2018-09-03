package com.aikbc.pandora.config;

import java.io.File;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @description MybatisPlus代码生成器
 * @author CJay
 * @date 2018年9月3日 上午10:44:44
 */
public class CodeGeneration {
	
	private static String authorName="CJay";     //作者
    private static File file = new File("src//main//java");
    private static String path = file.getAbsolutePath();
    private static String table="miner_basic_info";             //table名字
//    private static String prefix="sys_";                     //table前缀
    
    
	public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(path);    //输出目录
        gc.setFileOverride(true); //是否覆盖文件
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setOpen(false); //生成后代开文件夹,默认false
        gc.setAuthor(authorName);// 作者

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
/*        dsc.setTypeConvert(new MySqlTypeConvert(){
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                System.out.println("转换类型：" + fieldType);
                // if ( fieldType.toLowerCase().contains( "tinyint" ) ) {
                //    return DbColumnType.BOOLEAN;
                // }
                return super.processTypeConvert(fieldType);
            }       	
        });*/
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://192.168.82.140:3306/miner_db");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
//        strategy.setCapitalMode(true);// 全局大写命名
//        strategy.setDbColumnUnderline(true);//全局下划线命名
//        strategy.setTablePrefix(new String[] { prefix });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(new String[] { table }); // 需要生成的表

        strategy.setSuperServiceClass(null);  // 自定义 service 父类
        strategy.setSuperServiceImplClass(null); // 自定义 service 实现类父类
        strategy.setSuperMapperClass(null); // 自定义 mapper 父类
        strategy.setSuperControllerClass(null); //自定义 controller父类

        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.aikbc.pandora");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("dao");
        pc.setEntity("entity");
        pc.setXml("mapper");
        mpg.setPackageInfo(pc);

        // 执行生成
        mpg.execute();

    }
}
