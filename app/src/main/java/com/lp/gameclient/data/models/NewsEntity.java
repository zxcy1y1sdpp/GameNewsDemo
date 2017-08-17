package com.lp.gameclient.data.models;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by LP on 2017/8/17/11:12.
 */

public class NewsEntity extends RealmObject{

    @PrimaryKey
    private String id;
    private int cateId;

    private String type;
    private String source_id;
    private String source_name;
    private String template_id;
    private String title;
    private String url;
    private String status;
    private String create_time;
    private String time_length;
    private RealmList<ImageEntity> mImageEntityList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource_id() {
        return source_id;
    }

    public void setSource_id(String source_id) {
        this.source_id = source_id;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getTime_length() {
        return time_length;
    }

    public void setTime_length(String time_length) {
        this.time_length = time_length;
    }

    public RealmList<ImageEntity> getmImageEntityList() {
        return mImageEntityList;
    }

    public void setmImageEntityList(RealmList<ImageEntity> mImageEntityList) {
        this.mImageEntityList = mImageEntityList;
    }

}
