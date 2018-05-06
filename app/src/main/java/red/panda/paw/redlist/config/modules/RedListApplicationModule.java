package red.panda.paw.redlist.config.modules;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import red.panda.paw.redlist.RedListApplication;

/**
 * Module class for the {@link RedListApplication}.
 */
@Module
public class RedListApplicationModule {

    private final RedListApplication redListApplication;

    public RedListApplicationModule(@NonNull final RedListApplication redListApplication) {
        this.redListApplication = redListApplication;
    }

    @Provides
    @Singleton
    public RedListApplication provideRedListApplication() {
        return redListApplication;
    }
}
