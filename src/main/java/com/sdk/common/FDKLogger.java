package com.sdk.common;

import lombok.extern.slf4j.Slf4j;
import okhttp3.logging.HttpLoggingInterceptor.Logger;

@Slf4j
public class FDKLogger implements Logger {

  @Override
  public void log(String s) {
    log.debug(s);
  }
}
