package org.joyqueue.broker.replication;

import org.joyqueue.network.transport.command.Command;
import org.joyqueue.network.transport.command.CommandCallback;

/**
 * @author LiYue
 * Date: 2020/3/5
 */
public interface CommandSender {
    void sendCommand(String address, Command command, int timeout, CommandCallback callback) throws Exception;
}
