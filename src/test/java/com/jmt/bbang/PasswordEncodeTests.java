package com.jmt.bbang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.Md4PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncodeTests {
    private PasswordEncoder passwordEncoder;
    @Before
    public void setUp() throws Exception {
        passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
    @Test
    public void passwordEncode(){
        PasswordEncoder encoder2 = new Md4PasswordEncoder();
        // {1Qh8WUWIqhsEF1DNR+DLEhyajWYIvpJ2RsEa0FCQSeo=}b67c34a948f453c682fb4c52586ab9d8
        System.out.println(encoder2.encode("1234"));
        // {bcrypt}$2a$10$pUOgo50Tle5zE4pnDfL1KOhHIRgGgi8NG5/RrrLC7JfsENgZ5e52a
        String encode = passwordEncoder.encode("1234");
        System.out.println(encode);
        // {bcrypt}$2a$10$W84A53cyqKFTZ4ZzBdwtxeP5gE8YEJ2WIzUXQUFC6GzuTfJVuJVXW
        String encode3 = passwordEncoder.encode("1234");
        System.out.println(encode3);

        boolean matches = passwordEncoder.matches("1234", "{bcrypt}$2a$10$pUOgo50Tle5zE4pnDfL1KOhHIRgGgi8NG5/RrrLC7JfsENgZ5e52a");
        Assert.assertTrue(matches);

    }
}
