package io.core9.plugin.admin.dashboard;

import io.core9.core.plugin.Core9Plugin;
import io.core9.plugin.widgets.datahandler.DataHandlerFactory;
import io.core9.plugin.widgets.datahandler.DataHandlerFactoryConfig;

public interface DashboardPluginsDatahandler<T extends DataHandlerFactoryConfig> extends Core9Plugin, DataHandlerFactory<T> {

}
