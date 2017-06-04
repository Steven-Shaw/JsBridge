package com.apkfuns.jsbridge;

/**
 * Created by pengwei on 16/5/13.
 */
public interface JsBridgeConfig {

    // 默认协议
    String DEFAULT_PROTOCOL = "JsBridge";

    // 注册module
    JsBridgeConfig registerModule(Class<? extends JsModule>... modules);

    // 设置协议头
    JsBridgeConfig setProtocol(String protocol);

    // 加载结束函数名
    JsBridgeConfig setLoadReadyMethod(String readyName);
}
