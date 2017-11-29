package com.pingxundata.pxmeta;

import com.pingxundata.pxmeta.pojo.RequestResult;
import com.pingxundata.pxmeta.utils.JsonAnalyzeUtil;

/**
 * Created by Administrator on 2017/9/20.
 */

public class Test {
    public static void main(String[] args){
        RequestResult requestResult= JsonAnalyzeUtil.jsonStrToArray("",String.class);
        System.out.print(requestResult.getResultList().size());
    }
}
