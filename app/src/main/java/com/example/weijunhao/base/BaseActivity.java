package com.example.weijunhao.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by WEI JUNHAO on 2017/2/4.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
        initData();
        initListeners();
    }

    protected abstract void initViews();

    protected abstract void initData();

    protected abstract void initListeners();

    protected abstract void handleClick(View view);

    @Override
    public void onClick(View v) {

    }

    /**
     * 进入Activity
     *
     * @param targetClass 目标activity.class
     */
    protected void enterActivity(Class<?> targetClass) {
        startActivity(new Intent(this, targetClass));
    }

    /**
     * 进入Activity（带数据）
     *
     * @param targetClass 目标activity.class
     * @param bundle      参数
     */
    protected void enterActivity(Class<?> targetClass, Bundle bundle) {
        Intent intent = new Intent(this, targetClass);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /**
     * 进入指定activity并清除压在该Activity上面的Activity
     *
     * @param targetClass
     */
    protected void enterActivityClearTop(Class<?> targetClass) {
        Intent intent = new Intent();
        intent.setClass(this, targetClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    /**
     * 显示加载框
     */
    protected void showLoading() {

    }

    /**
     * 关闭加载框
     */
    protected void closeLoading() {

    }
}
