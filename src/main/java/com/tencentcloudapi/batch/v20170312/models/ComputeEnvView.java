package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ComputeEnvView  extends AbstractModel{


    /**
    * 计算环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;
    

    /**
    * 计算环境名称
    */
    @SerializedName("EnvName")
    @Expose
    private String EnvName;
    

    /**
    * 位置信息
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;
    

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;
    

    /**
    * 计算节点统计指标
    */
    @SerializedName("ComputeNodeMetrics")
    @Expose
    private ComputeNodeMetrics ComputeNodeMetrics;
    

    /**
    * 计算环境类型
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;
    

    /**
    * 计算节点期望个数
    */
    @SerializedName("DesiredComputeNodeCount")
    @Expose
    private Integer DesiredComputeNodeCount;
    

    /**
     * 获取计算环境ID
     * @return EnvId 计算环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * 设置计算环境ID
     * @param EnvId 计算环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * 获取计算环境名称
     * @return EnvName 计算环境名称
     */
    public String getEnvName() {
        return this.EnvName;
    }

    /**
     * 设置计算环境名称
     * @param EnvName 计算环境名称
     */
    public void setEnvName(String EnvName) {
        this.EnvName = EnvName;
    }

    /**
     * 获取位置信息
     * @return Placement 位置信息
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * 设置位置信息
     * @param Placement 位置信息
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取计算节点统计指标
     * @return ComputeNodeMetrics 计算节点统计指标
     */
    public ComputeNodeMetrics getComputeNodeMetrics() {
        return this.ComputeNodeMetrics;
    }

    /**
     * 设置计算节点统计指标
     * @param ComputeNodeMetrics 计算节点统计指标
     */
    public void setComputeNodeMetrics(ComputeNodeMetrics ComputeNodeMetrics) {
        this.ComputeNodeMetrics = ComputeNodeMetrics;
    }

    /**
     * 获取计算环境类型
     * @return EnvType 计算环境类型
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * 设置计算环境类型
     * @param EnvType 计算环境类型
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * 获取计算节点期望个数
     * @return DesiredComputeNodeCount 计算节点期望个数
     */
    public Integer getDesiredComputeNodeCount() {
        return this.DesiredComputeNodeCount;
    }

    /**
     * 设置计算节点期望个数
     * @param DesiredComputeNodeCount 计算节点期望个数
     */
    public void setDesiredComputeNodeCount(Integer DesiredComputeNodeCount) {
        this.DesiredComputeNodeCount = DesiredComputeNodeCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "EnvName", this.EnvName);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "ComputeNodeMetrics.", this.ComputeNodeMetrics);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamSimple(map, prefix + "DesiredComputeNodeCount", this.DesiredComputeNodeCount);

    }
}

