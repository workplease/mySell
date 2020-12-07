package com.zzz.sell.utils;

import com.zzz.sell.VO.ResultVO;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-07 22:28
 * @Version: 1.0
 *
 * 传输数据结果工具类
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
