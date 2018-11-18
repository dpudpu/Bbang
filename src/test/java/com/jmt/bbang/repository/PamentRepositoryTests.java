package com.jmt.bbang.repository;

import com.jmt.bbang.domain.Bank;
import com.jmt.bbang.domain.Payment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class PamentRepositoryTests {
    @Autowired
    PaymentRepository paymentRepository;

    @Test
    public void 은행으로저장(){
        Bank bank = new Bank();
        bank.setBankAccount("21312312");
        bank.setBankName("국민");
        bank.setRemitter("bae");
        bank.setAmount(15);

        Payment payment = paymentRepository.save(bank);

        System.out.println(((Bank) payment).getBankName());
    }
}
