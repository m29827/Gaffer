/*
 * Copyright 2018 Crown Copyright
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

package uk.gov.gchq.gaffer.operation.impl.join.merge;

import uk.gov.gchq.gaffer.operation.OperationException;

import java.util.List;

public interface Merge {
    /**
     * Merges a Set of Objects.
     *
     * @param input The input Iterable of Objects.
     * @return List containing the merged Objects.
     * @throws OperationException If the merge fails.
     */
    List merge(final Iterable input) throws OperationException;
}
