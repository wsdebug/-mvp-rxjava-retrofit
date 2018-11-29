package mvpInterface;




import base.BasePresenter;
import base.BaseView;

/**
 * Description: WelcomeContract
 * Creator: yxc
 * date: 2016/9/22 13:16
 */
public interface WelcomeContract {

    interface View extends BaseView {

        void showContent();

       
    }

    interface Presenter<T extends BaseView> extends BasePresenter {
        
        void onSuccess(String ss);
        void onError();
       
    }

    interface Model  {
        void getData(String id);
    }
}
