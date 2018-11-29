package base;

import android.os.Bundle;




/**
 * Description: MVP Activity基类
 * Creator: yxc
 * date: 17/9/14
 */

public abstract class BaseMvpActivity<T extends BasePresenter> extends BaseActivity implements BaseView {

    public abstract T  getmPresenter() ;

    protected T mPresenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mPresenter = getmPresenter();
        if (mPresenter != null)
            mPresenter.attachView(this);
        
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
    

    protected abstract void initInject();

}
