/*
 * Copyright 2017 Datamountaineer.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.datamountaineer.streamreactor.connect.rethink.config

import com.datamountaineer.streamreactor.connect.rethink.TestBase

/**
  * The point of this test is to check that constants keys are not changed after the refactor of the code.
  */
class TestReThinkSourceConstants extends TestBase {

  // Constants
  val RETHINK_HOST ="connect.rethink.source.host"
  val RETHINK_DB ="connect.rethink.db"
  val RETHINK_PORT ="connect.rethink.source.port"
  val IMPORT_ROUTE_QUERY ="connect.rethink.kcql"

  "RETHINK_HOST should be equals to the same key in ReThinkSinkConfigConstants" in {
    assert(RETHINK_HOST.equals(ReThinkSourceConfigConstants.RETHINK_HOST))
  }

  "RETHINK_DB should be equals to the same key in ReThinkSinkConfigConstants" in {
    assert(RETHINK_DB.equals(ReThinkSourceConfigConstants.RETHINK_DB))
  }

  "RETHINK_PORT should be equals to the same key in ReThinkSinkConfigConstants" in {
    assert(RETHINK_PORT.equals(ReThinkSourceConfigConstants.RETHINK_PORT))
  }

  "EXPORT_ROUTE_QUERY should be equals to the same key in ReThinkSinkConfigConstants" in {
    assert(IMPORT_ROUTE_QUERY.equals(ReThinkSourceConfigConstants.IMPORT_ROUTE_QUERY))
  }
}