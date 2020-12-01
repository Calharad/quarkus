package io.quarkus.vertx.http.deployment;

import io.quarkus.builder.item.SimpleBuildItem;
import io.quarkus.runtime.RuntimeValue;
import io.vertx.ext.web.Router;

public final class VertxFrameworkRouterBuildItem extends SimpleBuildItem {

    private RuntimeValue<Router> router;

    VertxFrameworkRouterBuildItem(RuntimeValue<Router> router) {
        this.router = router;
    }

    public RuntimeValue<Router> getRouter() {
        return router;
    }
}
