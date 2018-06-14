package com.ctrip.framework.apollo.core;

import com.ctrip.framework.apollo.core.enums.Env;
import com.ctrip.framework.apollo.core.utils.ResourceUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * The meta domain will load the meta server from System environment first, if not exist, will load
 * from apollo-env.properties. If neither exists, will load the default meta url.
 * 
 * Currently, apollo supports local/dev/fat/uat/lpt/pro environments.
 */
public class MetaDomainConsts {

  private static Map<Env, Object> domains = new HashMap<>();

  public static final String DEFAULT_META_URL = "http://config.local";

  static {
    Properties prop = new Properties();
    prop = ResourceUtils.readConfigFile("apollo-env.properties", prop);
    Properties env = System.getProperties();
    domains.put(Env.LOCAL,
        env.getProperty("local_meta", prop.getProperty("local.meta", DEFAULT_META_URL)));
    domains.put(Env.DEV,
        env.getProperty("dev_meta", prop.getProperty("dev.meta", DEFAULT_META_URL)));
    domains.put(Env.FAT,
        env.getProperty("fat_meta", prop.getProperty("fat.meta", DEFAULT_META_URL)));
    domains.put(Env.UAT,
        env.getProperty("uat_meta", prop.getProperty("uat.meta", DEFAULT_META_URL)));
    domains.put(Env.LPT,
        env.getProperty("lpt_meta", prop.getProperty("lpt.meta", DEFAULT_META_URL)));
    domains.put(Env.PRO,
        env.getProperty("pro_meta", prop.getProperty("pro.meta", DEFAULT_META_URL)));
    domains.put(Env.PRO,
            env.getProperty("pro_meta", prop.getProperty("pro.meta", DEFAULT_META_URL)));
    domains.put(Env.T1,
            env.getProperty("t1_meta", prop.getProperty("t1.meta", DEFAULT_META_URL)));
    domains.put(Env.T2,
            env.getProperty("t2_meta", prop.getProperty("t2.meta", DEFAULT_META_URL)));
    domains.put(Env.T6,
            env.getProperty("t6_meta", prop.getProperty("t6.meta", DEFAULT_META_URL)));
    domains.put(Env.T8,
            env.getProperty("t8_meta", prop.getProperty("t8.meta", DEFAULT_META_URL)));
    domains.put(Env.T9,
            env.getProperty("t9_meta", prop.getProperty("t9.meta", DEFAULT_META_URL)));
    domains.put(Env.T10,
            env.getProperty("t10_meta", prop.getProperty("t10.meta", DEFAULT_META_URL)));
    domains.put(Env.SANDBOX,
            env.getProperty("sandbox_meta", prop.getProperty("sandbox.meta", DEFAULT_META_URL)));
  }

  public static String getDomain(Env env) {
    return String.valueOf(domains.get(env));
  }
}
