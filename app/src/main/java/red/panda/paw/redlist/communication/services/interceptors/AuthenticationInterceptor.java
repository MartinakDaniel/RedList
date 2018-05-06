package red.panda.paw.redlist.communication.services.interceptors;

import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * The authentication interceptor for the service controllers.
 */
public class AuthenticationInterceptor implements Interceptor {

    /**
     * The token of the authentication.
     */
    protected String authToken;

    /**
     * Constructor for the {@link AuthenticationInterceptor} class.
     *
     * @param authToken the authentication token.
     */
    public AuthenticationInterceptor(@NonNull final String authToken){
        this.authToken = authToken;
    }

    @Override
    public Response intercept(@NonNull final Chain chain) throws IOException {
        final Request originalRequest = chain.request();
        final HttpUrl originalHttpUrl = originalRequest.url();

        final HttpUrl newHttpUrl = originalHttpUrl.newBuilder().addQueryParameter("token", authToken).build();

        Request.Builder requestBuilder = originalRequest.newBuilder().url(newHttpUrl);

        final Request authenticatedRequest = requestBuilder.build();
        return chain.proceed(authenticatedRequest);
    }
}
