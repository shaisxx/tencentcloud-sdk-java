/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dbbrain.v20191016;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dbbrain.v20191016.models.*;

public class DbbrainClient extends AbstractClient{
    private static String endpoint = "dbbrain.tencentcloudapi.com";
    private static String version = "2019-10-16";

    public DbbrainClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DbbrainClient(Credential credential, String region, ClientProfile profile) {
        super(DbbrainClient.endpoint, DbbrainClient.version, credential, region, profile);
    }

    /**
     *获取实例异常诊断事件的详情信息。
     * @param req DescribeDBDiagEventRequest
     * @return DescribeDBDiagEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagEventResponse DescribeDBDiagEvent(DescribeDBDiagEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBDiagEventResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBDiagEventResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBDiagEvent"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例诊断事件的列表。
     * @param req DescribeDBDiagHistoryRequest
     * @return DescribeDBDiagHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBDiagHistoryResponse DescribeDBDiagHistory(DescribeDBDiagHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBDiagHistoryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBDiagHistoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBDiagHistory"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定时间段内的实例空间使用概览，包括磁盘增长量(MB)、磁盘剩余(MB)、磁盘总量(MB)及预计可用天数。
     * @param req DescribeDBSpaceStatusRequest
     * @return DescribeDBSpaceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBSpaceStatusResponse DescribeDBSpaceStatus(DescribeDBSpaceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBSpaceStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBSpaceStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBSpaceStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取慢日志统计柱状图
     * @param req DescribeSlowLogTimeSeriesStatsRequest
     * @return DescribeSlowLogTimeSeriesStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogTimeSeriesStatsResponse DescribeSlowLogTimeSeriesStats(DescribeSlowLogTimeSeriesStatsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogTimeSeriesStatsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogTimeSeriesStatsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSlowLogTimeSeriesStats"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按照Sql模板+schema的聚合方式，统计排序指定时间段内的top慢sql。
     * @param req DescribeSlowLogTopSqlsRequest
     * @return DescribeSlowLogTopSqlsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogTopSqlsResponse DescribeSlowLogTopSqls(DescribeSlowLogTopSqlsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSlowLogTopSqlsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSlowLogTopSqlsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSlowLogTopSqls"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例Top表的实时空间统计信息，默认返回按大小排序。
     * @param req DescribeTopSpaceTablesRequest
     * @return DescribeTopSpaceTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopSpaceTablesResponse DescribeTopSpaceTables(DescribeTopSpaceTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopSpaceTablesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopSpaceTablesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTopSpaceTables"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
