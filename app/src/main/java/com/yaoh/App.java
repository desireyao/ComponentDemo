package com.yaoh;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.yaoh.compont.BuildConfig;

/**
 * @author yaoh
 * @date Create in 2019-08-09 13:25
 * @description TODO
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }

        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }
}
