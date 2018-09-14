package com.jpc.mvp.demo3;

import com.jpc.mvp.demo3.base.BaseModel;

public class DataModel {
        public static BaseModel request(Class<? extends BaseModel> clazz) {
            // 声明一个空的BaseModel
            BaseModel model = null;
            // 判断class对象是不是BaseModel的实例

                try {
                    //利用反射机制获得对应Model对象的引用
                    model = (BaseModel) clazz.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            return model;
        }
    }

