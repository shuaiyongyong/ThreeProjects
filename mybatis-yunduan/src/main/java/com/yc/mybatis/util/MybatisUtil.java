package com.yc.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;

public class MybatisUtil {
	private static SqlSessionFactory factory;
	static{
		InputStream in  = null;
		try {
			//bin 的下面 叫做类路径
			//加载类路径下的mybatis框架的配置文件
			in = Resources.getResourceAsStream("mybatis.xml");
			//Resources 类为从类路径中加载资源，提供了易于使用的方法。
			//LogManager.getLogger().debug("加载类路径下的mybatis框架的配置文件成功...");
		} catch (IOException e) {
			LogManager.getLogger().error("加载类路径下的mybatis框架的配置文件失败！！！");
		}

		//根据加载上来的mybatis配置文件，构建SqlSessionFactory的对象
		factory = new SqlSessionFactoryBuilder().build(in);
		//产生SqlSessionFactory类的实例（相当于是产生连接池），通过调用SqlSessionFactoryBuilder类的实例的build方法来完成。
		//LogManager.getLogger().debug("根据加载上来的mybatis配置文件，构建SqlSessionFactory的对象成功...");
	}
	
	//取到数据库连接
	public static SqlSession getSession(){
		SqlSession session = null;
		if(factory != null){
			session = factory.openSession();
			//openSession()         重新建立一个新的session   相当于 new SqlSession
			//LogManager.getLogger().debug("使用SqlSessionFactory的对象，生产出构建SqlSession的对象...");	
		}
		return session;
	}
	
	//取到数据库会话对象
		public static SqlSession getAutoCommitSession(){
			SqlSession session = null;
			if(factory != null){
				session = factory.openSession(true);
				//openSession()         重新建立一个新的session   相当于 new SqlSession
				//LogManager.getLogger().debug("使用SqlSessionFactory的对象，生产出构建SqlSession的对象...");	
			}
			return session;
		}
}
