package red.panda.paw.redlist.config.component;

import javax.inject.Singleton;

import dagger.Component;
import red.panda.paw.redlist.communication.services.RedListServiceController;
import red.panda.paw.redlist.config.modules.RedListServiceControllerModule;

/**
 * Component class for the {@link RedListServiceController}.
 */
@Singleton
@Component(
        modules = {
                RedListServiceControllerModule.class,
        }
)
public interface RedListServiceControllerComponent {

    /**
     * Gets the {@link RedListServiceController}.
     *
     * @return the {@link RedListServiceController}.
     */
    RedListServiceController getRedListServiceController();
}
