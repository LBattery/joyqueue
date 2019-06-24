/**
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
package com.jd.joyqueue.broker.election.network.codec;

import com.jd.joyqueue.network.transport.codec.PayloadEncoder;
import com.jd.joyqueue.network.command.CommandType;
import com.jd.joyqueue.network.transport.command.Type;
import com.jd.joyqueue.broker.election.command.TimeoutNowResponse;
import io.netty.buffer.ByteBuf;

/**
 * author: zhuduohui
 * email: zhuduohui@jd.com
 * date: 2018/10/2
 */
public class TimeoutNowResponseEncoder implements PayloadEncoder<TimeoutNowResponse>, Type {
    @Override
    public void encode(final TimeoutNowResponse response, ByteBuf buffer) throws Exception {
        buffer.writeBoolean(response.isSuccess());
        buffer.writeInt(response.getTerm());
    }

    @Override
    public int type() {
        return CommandType.RAFT_TIMEOUT_NOW_RESPONSE;
    }
}