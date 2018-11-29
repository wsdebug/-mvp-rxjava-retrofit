package service;

import java.util.List;

import bean.HttpResult;
import bean.Subject;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface MovieService {
    @GET("top250")
    Observable<HttpResult<List<Subject>>> getTopMovie(@Query("start") int start, @Query("count") int count);
}