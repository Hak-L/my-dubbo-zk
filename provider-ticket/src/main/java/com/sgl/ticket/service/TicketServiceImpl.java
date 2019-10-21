package com.sgl.ticket.service;/**
 * Created by Ni Klaus on 2019/10/21 0021
 */

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 *@ClassName TicketServiceImpl
 *@Description TODO
 *@Author Ni Klaus
 *@Date 2019/10/21 0021 下午 13:57
 *@Version 1.0
 */
@Component //注册为组件
@Service //这里的Service注解是dubbo的注解，交给dubbo管理
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket(){
        return "获取科比门票成功！票号：001";
    }
}
