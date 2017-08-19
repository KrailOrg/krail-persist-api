/*
 *
 *  * Copyright (c) 2016. David Sowerby
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 *  * the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 *  * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *  * specific language governing permissions and limitations under the License.
 *
 */

package uk.q3c.krail.persist;

/**
 * Provides a common set of persistence information across all type of persistence.  Usually implemented by a persistence-related Guice module or a persistence
 * configuration object
 * <p>
 *
 * @param <K> the key type used as an identifier, usually I18NKey
 * @param <C> for fluency
 *            Created by David Sowerby on 01/07/15.
 */
public interface PersistenceInfo<K, C> {


    C nameKey(K nameKey);

    C descriptionKey(K nameKey);

    C connectionUrl(String url);

    /**
     * Set to true if the persistence is volatile (that is, in memory)
     *
     * @param isVolatile true if persistence is volatile
     * @return this for fluency
     */
    C volatilePersistence(boolean isVolatile);

    String getDescription();

    String getName();

    K getDescriptionKey();

    K getNameKey();

    String getConnectionUrl();

    /**
     * Returns true if the persistence is volatile (that is, in memory)
     */
    boolean isVolatilePersistence();
}
