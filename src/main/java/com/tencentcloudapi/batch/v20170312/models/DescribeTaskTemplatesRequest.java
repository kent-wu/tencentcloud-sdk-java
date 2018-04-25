package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeTaskTemplatesRequest  extends AbstractModel{


    /**
    * 任务模板ID
    */
    @SerializedName("TaskTemplateIds")
    @Expose
    private String [] TaskTemplateIds;
    

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;
    

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;
    

    /**
    * 返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;
    

    /**
     * 获取任务模板ID
     * @return TaskTemplateIds 任务模板ID
     */
    public String [] getTaskTemplateIds() {
        return this.TaskTemplateIds;
    }

    /**
     * 设置任务模板ID
     * @param TaskTemplateIds 任务模板ID
     */
    public void setTaskTemplateIds(String [] TaskTemplateIds) {
        this.TaskTemplateIds = TaskTemplateIds;
    }

    /**
     * 获取过滤条件
     * @return Filters 过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量
     * @return Limit 返回数量
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量
     * @param Limit 返回数量
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskTemplateIds.", this.TaskTemplateIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

