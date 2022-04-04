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
import java.util.UUID;

public class ErrorMessage implements ErrorMessageInterface {
    private final String id;
    private final LocalDateTime createdAt;
    private final int code;
    private final String description;

    public ErrorMessage(int code, String description) {
        this.id = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
        this.code = code;
        this.description = description;
    }

    public ErrorMessage(int code, String description, String id, LocalDateTime createdAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.code = code;
        this.description = description;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
