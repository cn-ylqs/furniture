package com.furniture.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author za
 * @since 2022-05-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Admin对象", description="")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "管理员账号")
    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private String trueName;

    private String password;

    @ApiModelProperty(value = "头像")
    private Blob icon;

    @ApiModelProperty(value = "管理员部门")
    private Integer department;

    @ApiModelProperty(value = "性别，0为男，1为女")
    private Integer sex;

    private String phone;

    private String email;


}
