package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("Vip 는 10프로 할인이 적용되어야 한다.")
    void vip_o()
    {
        //given
        Member member = new Member(1L,"222" ,Grade.VIP);

        int discount = discountPolicy.discount(member, 10000);

        //when
        org.assertj.core.api.Assertions.assertThat(discount).isEqualTo(1000);//then
    }

    @Test
    @DisplayName("Vip 는 10프로 할인이 적용되어야 한다.")
    void vip_x()
    {
        //given

        Member member = new Member(1L,"222" ,Grade.NOMALS);

        int discount = discountPolicy.discount(member, 10000);

        //when
        org.assertj.core.api.Assertions.assertThat(discount).isEqualTo(1000);//then
    }


}