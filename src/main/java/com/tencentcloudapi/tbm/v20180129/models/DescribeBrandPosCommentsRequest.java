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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBrandPosCommentsRequest  extends AbstractModel{

    /**
    * 品牌ID
    */
    @SerializedName("BrandId")
    @Expose
    private String BrandId;

    /**
    * 查询开始时间
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 查询结束时间
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 查询条数上限，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 查询偏移，从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
     * 获取品牌ID
     * @return BrandId 品牌ID
     */
    public String getBrandId() {
        return this.BrandId;
    }

    /**
     * 设置品牌ID
     * @param BrandId 品牌ID
     */
    public void setBrandId(String BrandId) {
        this.BrandId = BrandId;
    }

    /**
     * 获取查询开始时间
     * @return StartDate 查询开始时间
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * 设置查询开始时间
     * @param StartDate 查询开始时间
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * 获取查询结束时间
     * @return EndDate 查询结束时间
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * 设置查询结束时间
     * @param EndDate 查询结束时间
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * 获取查询条数上限，默认20
     * @return Limit 查询条数上限，默认20
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置查询条数上限，默认20
     * @param Limit 查询条数上限，默认20
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取查询偏移，从0开始
     * @return Offset 查询偏移，从0开始
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置查询偏移，从0开始
     * @param Offset 查询偏移，从0开始
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BrandId", this.BrandId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

