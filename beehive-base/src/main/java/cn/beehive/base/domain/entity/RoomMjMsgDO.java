package cn.beehive.base.domain.entity;

import cn.beehive.base.enums.ChatMessageTypeEnum;
import cn.beehive.base.enums.MjMsgActionEnum;
import cn.beehive.base.enums.MjMsgStatusEnum;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author hncboy
 * @date 2023/5/18
 * midjourney 房间消息
 */
@Data
@TableName("bh_room_mj_msg")
public class RoomMjMsgDO {

    /**
     * 主键
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 房间 id
     */
    private Long roomId;

    /**
     * 用户 id
     */
    private Integer userId;

    /**
     * 消息类型
     */
    private ChatMessageTypeEnum type;

    /**
     * 用户输入
     */
    private String prompt;

    /**
     * 最终的输入
     */
    private String finalPrompt;

    /**
     * 响应内容
     */
    private String responseContent;

    /**
     * 指令动作
     */
    private MjMsgActionEnum action;

    /**
     * discord 图片地址
     */
    private String discordImageUrl;

    /**
     * 图片名称
     */
    private String imageName;

    /**
     * uv 指令的父消息 id
     */
    private Long uvParentId;

    /**
     * uv 指令使用比特位
     * 00000000
     * 分别表示 U1 U2 U3 U4 V1 V2 V3 V4
     */
    private Integer uvUseBit;

    /**
     * 状态
     */
    private MjMsgStatusEnum status;

    /**
     * discord 开始时间
     */
    private Date discordStartTime;

    /**
     * discord 结束时间
     */
    private Date discordFinishTime;

    /**
     * 失败原因
     */
    private String failureReason;

    /**
     * discord message id
     */
    private String discordMessageId;

    /**
     * 是否删除
     */
    private Boolean isDeleted;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
