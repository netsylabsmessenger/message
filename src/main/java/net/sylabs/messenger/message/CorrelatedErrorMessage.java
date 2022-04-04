/*
 * Copyright (c) 2019-2022 Clément Cazaud <clement.cazaud@gmail.com>,
 *                         Hamza Abidi <abidi.hamza84000@gmail.com>
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

package net.sylabs.messenger.message;

import java.time.LocalDateTime;

public class CorrelatedErrorMessage extends ErrorMessage implements CorrelatedErrorMessageInterface {
    private final String correlationId;

    public CorrelatedErrorMessage(int code, String description, String correlationId) {
        super(code, description);
        this.correlationId = correlationId;
    }

    public CorrelatedErrorMessage(int code, String description, String correlationId, String id, LocalDateTime createdAt) {
        super(code, description, id, createdAt);
        this.correlationId = correlationId;
    }

    @Override
    public String getCorrelationId() {
        return correlationId;
    }

    @Override
    public boolean isCorrelatedTo(MessageInterface message) {
        return correlationId.equals(message.getId());
    }
}
