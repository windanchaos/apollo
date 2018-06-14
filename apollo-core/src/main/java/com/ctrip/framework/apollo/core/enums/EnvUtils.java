package com.ctrip.framework.apollo.core.enums;

import com.ctrip.framework.apollo.core.utils.StringUtils;

public final class EnvUtils {
  
  public static Env transformEnv(String envName) {
    if (StringUtils.isBlank(envName)) {
      return null;
    }
    switch (envName.trim().toUpperCase()) {
      case "LPT":
        return Env.LPT;
      case "FAT":
      case "FWS":
        return Env.FAT;
      case "UAT":
        return Env.UAT;
      case "PRO":
      case "PROD": //just in case
        return Env.PRO;
      case "DEV":
        return Env.DEV;
      case "LOCAL":
        return Env.LOCAL;
      case "TOOLS":
        return Env.TOOLS;
      case "T1":
          return Env.T1;
      case "T2":
          return Env.T2;
      case "T6":
          return Env.T6;
      case "T8":
          return Env.T8;
      case "T9":
          return Env.T9;
      case "T10":
          return Env.T10;
      case "SANDBOX":
          return Env.SANDBOX;
      default:
        return null;
    }
  }
}
