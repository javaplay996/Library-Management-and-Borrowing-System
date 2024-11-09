package com.entity.vo;

import com.entity.YonghuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 用户
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-17
 */
@TableName("yonghu")
public class YonghuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 用户姓名
     */

    @TableField(value = "yonghu_name")
    private String yonghuName;


    /**
     * 学号
     */

    @TableField(value = "yonghu_xuehao")
    private String yonghuXuehao;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 身份证号
     */

    @TableField(value = "yonghu_id_number")
    private String yonghuIdNumber;


    /**
     * 手机号
     */

    @TableField(value = "yonghu_phone")
    private String yonghuPhone;


    /**
     * 住址
     */

    @TableField(value = "yonghu_zhuzhi")
    private String yonghuZhuzhi;


    /**
     * 照片
     */

    @TableField(value = "yonghu_photo")
    private String yonghuPhoto;


    /**
     * 身份
     */

    @TableField(value = "yonghu_role")
    private String yonghuRole;


    /**
     * 专业
     */

    @TableField(value = "yonghu_zhanye")
    private String yonghuZhanye;


    /**
     * 班级
     */

    @TableField(value = "yonghu_banji")
    private String yonghuBanji;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：用户姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 获取：用户姓名
	 */

    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 设置：学号
	 */
    public String getYonghuXuehao() {
        return yonghuXuehao;
    }


    /**
	 * 获取：学号
	 */

    public void setYonghuXuehao(String yonghuXuehao) {
        this.yonghuXuehao = yonghuXuehao;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：身份证号
	 */
    public String getYonghuIdNumber() {
        return yonghuIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setYonghuIdNumber(String yonghuIdNumber) {
        this.yonghuIdNumber = yonghuIdNumber;
    }
    /**
	 * 设置：手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 设置：住址
	 */
    public String getYonghuZhuzhi() {
        return yonghuZhuzhi;
    }


    /**
	 * 获取：住址
	 */

    public void setYonghuZhuzhi(String yonghuZhuzhi) {
        this.yonghuZhuzhi = yonghuZhuzhi;
    }
    /**
	 * 设置：照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 设置：身份
	 */
    public String getyonghuRole() {
        return yonghuRole;
    }


    /**
	 * 获取：身份
	 */

    public void setyonghuRole(String yonghuRole) {
        this.yonghuRole = yonghuRole;
    }
    /**
	 * 设置：专业
	 */
    public String getYonghuZhanye() {
        return yonghuZhanye;
    }


    /**
	 * 获取：专业
	 */

    public void setYonghuZhanye(String yonghuZhanye) {
        this.yonghuZhanye = yonghuZhanye;
    }
    /**
	 * 设置：班级
	 */
    public String getYonghuBanji() {
        return yonghuBanji;
    }


    /**
	 * 获取：班级
	 */

    public void setYonghuBanji(String yonghuBanji) {
        this.yonghuBanji = yonghuBanji;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
