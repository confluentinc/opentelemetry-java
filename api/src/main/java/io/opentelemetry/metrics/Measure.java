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

package io.opentelemetry.metrics;

/**
 * Base interface for all the Measure metrics.
 *
 * @param <H> the Handle.
 * @since 0.1.0
 */
public interface Measure<H> extends Metric<H> {

  /** Builder class for {@link Measure}. */
  interface Builder<B extends Measure.Builder<B, V>, V> extends Metric.Builder<B, V> {}
}
