package com.cadmin.cadmin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 *
 * @author elliot
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "c_admin")
@ApiModel(value = "管理员表", description = "管理员对象")
public class Admin {
    @ApiModelProperty(value = "主键")
    private Integer id;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "创建时间")
    private Date created;
}
