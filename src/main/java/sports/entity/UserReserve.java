package sports.entity;

import java.io.Serializable;

/*
* 存放用户预约的信息，用户每次预约或修改都会记录成一次交易，这个交易信息用reserve_id来表示
* 包含了用户id，活动id和用户预约状态三个部分
** */
public class UserReserve implements Serializable {

    private String reserve_id;
    private String activity_id;
    private String user_id;
    private Integer reserve_status;

    public String getReserve_id() {
        return reserve_id;
    }

    public void setReserve_id(String reserve_id) {
        this.reserve_id = reserve_id;
    }

    public String getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(String activity_id) {
        this.activity_id = activity_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getReserve_status() {
        return reserve_status;
    }

    public void setReserve_status(Integer reserve_status) {
        this.reserve_status = reserve_status;
    }

    @Override
    public String toString() {
        return "UserReserve{" +
                "reserve_id='" + reserve_id + '\'' +
                ", activity_id='" + activity_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", reserve_status=" + reserve_status +
                '}';
    }
}
