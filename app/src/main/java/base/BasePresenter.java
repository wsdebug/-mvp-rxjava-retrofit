package base;

/**
 * Description: BasePresenter
 * Creator: yxc
 * date: 2016/9/21 10:42
 */
public interface BasePresenter<T extends BaseView> {
    abstract void initModel();
    abstract void attachView(T baseView);
    abstract void detachView();
}
