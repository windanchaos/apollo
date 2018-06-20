package com.ctrip.framework.apollo.common.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ctrip.framework.apollo.core.enums.Env;
import com.ctrip.framework.apollo.core.enums.EnvUtils;
import com.ctrip.framework.foundation.Foundation;

@Component
public class TitanSettings {

  @Value("${fat.titan.url:}")
  private String fatTitanUrl;
  @Value("${fat.titan.dbname:}")
  private String fatTitanDbname;
  
  @Value("${uat.titan.url:}")
  private String uatTitanUrl;
  @Value("${uat.titan.dbname:}")
  private String uatTitanDbname;

  @Value("${pro.titan.url:}")
  private String proTitanUrl;
  @Value("${pro.titan.dbname:}")
  private String proTitanDbname;
 
  @Value("${dev.titan.url:}")
  private String devTitanUrl;
  @Value("${dev.titan.dbname:}")
  private String devTitanDbname;

  @Value("${t8.titan.url:}")
  private String t8TitanUrl;
  @Value("${t8.titan.dbname:}")
  private String t8TitanDbname;
  
  public String getTitanUrl() {
    Env env = EnvUtils.transformEnv(Foundation.server().getEnvType());
    if (env == null) {
      return "";
    }
	if (env.toString().equals(Env.DEV))
	{
		return devTitanUrl;
	}
	if (env.toString().equals(Env.T8))
	{
		return t8TitanUrl;
	}
//	if (env.toString().equals(Env.FAT))
//	{
//		return fatTitanUrl;
//	}
//	if (env.toString().equals(Env.FWS))
//	{
//
//	}
//	if (env.toString().equals(Env.UAT))
//	{
//		return uatTitanUrl;
//	}
//	if (env.toString().equals(Env.TOOLS))
//	{
//
//	}
//	if (env.toString().equals(Env.PRO))
//	{
//		return proTitanUrl;
//	}
	return "";
//    switch (env) {
//      case FAT:
//      case FWS:
//        return fatTitanUrl;
//      case UAT:
//        return uatTitanUrl;
//      case TOOLS:
//      case PRO:
//        return proTitanUrl;
//      default:
//        return "";
//    }
  }

  public String getTitanDbname() {
    Env env = EnvUtils.transformEnv(Foundation.server().getEnvType());
    if (env == null) {
      return "";
    }
    // update start 20180620 by shuangyu
	if (env.toString().equals(Env.DEV))
	{
		return devTitanDbname;
	}  
	if (env.toString().equals(Env.T8))
	{
		return t8TitanDbname;
	}
//		if (env.toString().equals(Env.FAT))
//		{
//
//		}
//		if (env.toString().equals(Env.FWS))
//		{
//			return fatTitanDbname;
//		}
//		if (env.toString().equals(Env.UAT))
//		{
//			return uatTitanDbname;
//		}
//		if (env.toString().equals(Env.TOOLS))
//		{
//
//		}
//		if (env.toString().equals(Env.PRO))
//		{
//			return proTitanDbname;
//		}
		return "";
		   // update end
//    switch (env) {
//      case FAT:
//      case FWS:
//        return fatTitanDbname;
//      case UAT:
//        return uatTitanDbname;
//      case TOOLS:
//      case PRO:
//        return proTitanDbname;
//      default:
//        return "";
//    }
  }

}
