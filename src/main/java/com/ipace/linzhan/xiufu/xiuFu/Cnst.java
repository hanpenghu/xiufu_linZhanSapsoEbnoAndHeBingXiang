package com.ipace.linzhan.xiufu.xiuFu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(1)
@Component
public class Cnst {
    @Autowired
    public SapsoMapper sapsoMapper;

}
