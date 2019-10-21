package com.sgl.user.service;
/**
 * Created by Ni Klaus on 2019/10/21 0021
 */

import com.sgl.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 *@ClassName UserService
 *@Description TODO
 *@Author Ni Klaus
 *@Date 2019/10/21 0021 下午 14:07
 *@Version 1.0
 */
@Service //这里的@Service注解 还是spring的注解
public class UserService {
    /** Reference是dubbo的注解 注入的是分布式中的远程服务对象
     *  而且这里注入的 TicketService 接口 市场provider-ticket 项目中拷贝过来的服务接口
     *  这里要求两边的全类包路径相同
     * */
    @Reference
    TicketService ticketService;

    public void hello(){
        System.out.println("买到票了："+ticketService.getTicket());
    }
}
