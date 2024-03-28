package com.ohgiraffers.section02.initdestroy.subsection02.annotation;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    /* init-method와 같은 설정 어노테이션 */
    @PostConstruct
    public void openShop() {
        System.out.println("사장님이 가게 문을 열었습니다~ 이제 쇼핑 가능");
    }

    /* destroy-method와 같은 설정 어노테이션 */
    public void closeShop() {
        System.out.println("사장님이 가게 문을 닫았습니다~ 이제 쇼핑 불가능");
    }


}
