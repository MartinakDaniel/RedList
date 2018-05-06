package red.panda.paw.redlist.config.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import red.panda.paw.redlist.communication.services.RedListServiceController;
import red.panda.paw.redlist.config.Constants;

/**
 * Module class for the {@link RedListServiceController}.
 */
@Module
public class RedListServiceControllerModule {

    /**
     * Provides a {@link RedListServiceController} instance.
     *
     * @return the {@link RedListServiceController}.
     */
    @Provides
    @Singleton
    RedListServiceController provideRedListServiceController() {
        return new RedListServiceController(Constants.RED_LIST_API_TOKEN_KEY);
    }
}
