package com.aoligei.utlis;

import com.aoligei.entity.vo.ResultVO;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/19 17:17
 */
public class ResultUtil {


    public static ResultVO buildSuccess(Object data, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode("200");
        resultVO.setData(data);
        resultVO.setMsg(msg);
        return resultVO;
    }

    public static ResultVO buildError(String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode("500");
        resultVO.setData("");
        resultVO.setMsg(msg);
        return resultVO;
    }

    private ResultUtil() {
    }
}
