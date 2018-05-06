package red.panda.paw.redlist.config.component;

import android.support.annotation.NonNull;

import red.panda.paw.redlist.RedListApplication;
import red.panda.paw.redlist.config.modules.RedListApplicationModule;
import red.panda.paw.redlist.config.modules.RedListServiceControllerModule;

/**
 * Created by martinakdani on 06/05/2018.
 */

public class ComponentRepository {

    private static RedListApplicationComponent redListApplicationComponent;

    private ComponentRepository() {
    }

    public static void initialize(@NonNull final RedListApplication redListApplication) {
        redListApplicationComponent = DaggerRedListApplicationComponent.builder()
                .redListApplicationModule(new RedListApplicationModule(redListApplication))
                .redListServiceControllerModule(new RedListServiceControllerModule())
                .build();
    }

    public static RedListApplicationComponent redListApplicationComponent() {
        return redListApplicationComponent;
    }
}
