package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeTasksRequest  extends AbstractModel{


    /**
    * 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 异步任务请求ID，执行 CDB 相关操作返回的 AsyncRequestId
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private String AsyncRequestId;
    

    /**
    * 任务类型，不传值则查询所有任务类型，可能的值：1-数据库回档；2-SQL操作；3-数据导入；5-参数设置；6-初始化；7-重启；8-开启GTID；9-只读实例升级；10-数据库批量回档；11-主实例升级；12-删除库表；13-切换为主实例；
    */
    @SerializedName("TaskTypes")
    @Expose
    private Integer [] TaskTypes;
    

    /**
    * 任务状态，不传值则查询所有任务状态，可能的值：-1-未定义；0-初始化; 1-运行中；2-执行成功；3-执行失败；4-已终止；5-已删除；6-已暂停；
    */
    @SerializedName("TaskStatus")
    @Expose
    private Integer [] TaskStatus;
    

    /**
    * 第一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01
    */
    @SerializedName("StartTimeBegin")
    @Expose
    private String StartTimeBegin;
    

    /**
    * 最后一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01
    */
    @SerializedName("StartTimeEnd")
    @Expose
    private String StartTimeEnd;
    

    /**
    * 记录偏移量，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;
    

    /**
    * 单次请求返回的数量，默认值为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;
    

    /**
     * 获取实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用[查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取异步任务请求ID，执行 CDB 相关操作返回的 AsyncRequestId
     * @return AsyncRequestId 异步任务请求ID，执行 CDB 相关操作返回的 AsyncRequestId
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * 设置异步任务请求ID，执行 CDB 相关操作返回的 AsyncRequestId
     * @param AsyncRequestId 异步任务请求ID，执行 CDB 相关操作返回的 AsyncRequestId
     */
    public void setAsyncRequestId(String AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * 获取任务类型，不传值则查询所有任务类型，可能的值：1-数据库回档；2-SQL操作；3-数据导入；5-参数设置；6-初始化；7-重启；8-开启GTID；9-只读实例升级；10-数据库批量回档；11-主实例升级；12-删除库表；13-切换为主实例；
     * @return TaskTypes 任务类型，不传值则查询所有任务类型，可能的值：1-数据库回档；2-SQL操作；3-数据导入；5-参数设置；6-初始化；7-重启；8-开启GTID；9-只读实例升级；10-数据库批量回档；11-主实例升级；12-删除库表；13-切换为主实例；
     */
    public Integer [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * 设置任务类型，不传值则查询所有任务类型，可能的值：1-数据库回档；2-SQL操作；3-数据导入；5-参数设置；6-初始化；7-重启；8-开启GTID；9-只读实例升级；10-数据库批量回档；11-主实例升级；12-删除库表；13-切换为主实例；
     * @param TaskTypes 任务类型，不传值则查询所有任务类型，可能的值：1-数据库回档；2-SQL操作；3-数据导入；5-参数设置；6-初始化；7-重启；8-开启GTID；9-只读实例升级；10-数据库批量回档；11-主实例升级；12-删除库表；13-切换为主实例；
     */
    public void setTaskTypes(Integer [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    /**
     * 获取任务状态，不传值则查询所有任务状态，可能的值：-1-未定义；0-初始化; 1-运行中；2-执行成功；3-执行失败；4-已终止；5-已删除；6-已暂停；
     * @return TaskStatus 任务状态，不传值则查询所有任务状态，可能的值：-1-未定义；0-初始化; 1-运行中；2-执行成功；3-执行失败；4-已终止；5-已删除；6-已暂停；
     */
    public Integer [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * 设置任务状态，不传值则查询所有任务状态，可能的值：-1-未定义；0-初始化; 1-运行中；2-执行成功；3-执行失败；4-已终止；5-已删除；6-已暂停；
     * @param TaskStatus 任务状态，不传值则查询所有任务状态，可能的值：-1-未定义；0-初始化; 1-运行中；2-执行成功；3-执行失败；4-已终止；5-已删除；6-已暂停；
     */
    public void setTaskStatus(Integer [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * 获取第一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01
     * @return StartTimeBegin 第一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01
     */
    public String getStartTimeBegin() {
        return this.StartTimeBegin;
    }

    /**
     * 设置第一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01
     * @param StartTimeBegin 第一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01
     */
    public void setStartTimeBegin(String StartTimeBegin) {
        this.StartTimeBegin = StartTimeBegin;
    }

    /**
     * 获取最后一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01
     * @return StartTimeEnd 最后一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01
     */
    public String getStartTimeEnd() {
        return this.StartTimeEnd;
    }

    /**
     * 设置最后一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01
     * @param StartTimeEnd 最后一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01
     */
    public void setStartTimeEnd(String StartTimeEnd) {
        this.StartTimeEnd = StartTimeEnd;
    }

    /**
     * 获取记录偏移量，默认值为0
     * @return Offset 记录偏移量，默认值为0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置记录偏移量，默认值为0
     * @param Offset 记录偏移量，默认值为0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取单次请求返回的数量，默认值为20，最大值为100
     * @return Limit 单次请求返回的数量，默认值为20，最大值为100
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置单次请求返回的数量，默认值为20，最大值为100
     * @param Limit 单次请求返回的数量，默认值为20，最大值为100
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);
        this.setParamSimple(map, prefix + "StartTimeBegin", this.StartTimeBegin);
        this.setParamSimple(map, prefix + "StartTimeEnd", this.StartTimeEnd);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

