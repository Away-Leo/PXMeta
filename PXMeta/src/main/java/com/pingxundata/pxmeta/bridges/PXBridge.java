package com.pingxundata.pxmeta.bridges;

import android.app.Activity;
import android.webkit.JavascriptInterface;

import com.pingxundata.pxmeta.utils.ObjectHelper;
import com.pingxundata.pxmeta.utils.ToastUtils;

/**
* @Title: PXBridge.java
* @Description: 用于html页面与android之间的交互桥梁
* @author Away
* @date 2017/11/27 16:31
* @copyright 重庆平讯数据
* @version V1.0
*/
public class PXBridge {

    public static Object extenders;

    public Activity mActivity;

    public void setActivity(Activity mActivity) {
        this.mActivity = mActivity;
    }

    @JavascriptInterface
    public void doVoid(){

    }

    @JavascriptInterface
    public void showAndroid(String metodName){
        if(ObjectHelper.isNotEmpty(mActivity)){
            mActivity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    ToastUtils.showToast(mActivity,"哈哈哈哈哈哈");
                }
            });
        }
    }
}
