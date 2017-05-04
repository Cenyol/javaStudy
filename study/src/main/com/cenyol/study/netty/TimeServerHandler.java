package com.cenyol.study.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.util.Date;

/**
 * Created by cenyol on 02/05/2017.
 */
public class TimeServerHandler extends ChannelInboundHandlerAdapter {
    private int counter = 0;

    @Override
    public void channelActive(final ChannelHandlerContext ctx) {

    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        String body = (String) msg;
        System.out.println("The time server receive order : " + body + "; the counter is " + ++counter);
        String currentTime = "QUERY TIME ORD".equalsIgnoreCase(body) ? new Date(System.currentTimeMillis()).toString() : "BAD ORDER";
        currentTime += "%_&";

        ByteBuf resp = Unpooled.copiedBuffer(currentTime.getBytes());
        ctx.writeAndFlush(resp);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}