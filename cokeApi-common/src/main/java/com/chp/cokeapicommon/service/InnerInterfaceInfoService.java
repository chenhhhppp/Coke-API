package com.chp.cokeapicommon.service;

import com.chp.cokeapicommon.model.entity.InterfaceInfo;

/**
 * @author chp
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2024-08-08 11:50:18
 */
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     *
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
