package cn.source.pojo;

import java.io.Serializable;

public class Users implements Serializable {
    /**
     * 用户id
     * 表字段 : users.uId
     */
    private Integer uid;

    /**
     * 用户名称
     * 表字段 : users.uName
     */
    private String uname;

    /**
     * 用户密码
     * 表字段 : users.uPwd
     */
    private String upwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 用户id 字段:users.uId
     *
     * @return users.uId, 用户id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置 用户id 字段:users.uId
     *
     * @param uid the value for users.uId, 用户id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取 用户名称 字段:users.uName
     *
     * @return users.uName, 用户名称
     */
    public String getUname() {
        return uname;
    }

    /**
     * 设置 用户名称 字段:users.uName
     *
     * @param uname the value for users.uName, 用户名称
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * 获取 用户密码 字段:users.uPwd
     *
     * @return users.uPwd, 用户密码
     */
    public String getUpwd() {
        return upwd;
    }

    /**
     * 设置 用户密码 字段:users.uPwd
     *
     * @param upwd the value for users.uPwd, 用户密码
     */
    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }
}