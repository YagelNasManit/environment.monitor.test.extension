package org.yagel.environment.monitor.test.plugin.status.provider;

import org.yagel.monitor.EnvironmentConfig;
import org.yagel.monitor.ResourceStatusProvider;

public abstract class AbstractResourceStatusProvider implements ResourceStatusProvider {

  protected EnvironmentConfig config;

  public AbstractResourceStatusProvider(EnvironmentConfig config) {
    this.config = config;
  }
}
