/*
 * Copyright 2019, OpenTelemetry Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.opentelemetry.distributedcontext.spi;

import io.opentelemetry.distributedcontext.DistributedContextManager;
import javax.annotation.concurrent.ThreadSafe;

/**
 * DistributedContextManagerProvider is a service provider for {@link DistributedContextManager}.
 * Fully qualified class name of the implementation should be registered in {@code
 * META-INF/services/io.opentelemetry.distributedcontext.spi.DistributedContextManagerProvider}.
 * <br>
 * <br>
 * A specific implementation can be selected by a system property {@code
 * io.opentelemetry.distributedcontext.spi.DistributedContextManagerProvider} with value of fully
 * qualified class name.
 *
 * @see io.opentelemetry.OpenTelemetry
 */
@ThreadSafe
public interface DistributedContextManagerProvider {

  /**
   * Creates a new {@code DistributedContextManager} instance.
   *
   * @return a {@code DistributedContextManager} instance.
   * @since 0.1.0
   */
  DistributedContextManager create();
}
