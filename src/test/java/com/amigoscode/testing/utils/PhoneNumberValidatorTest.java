package com.amigoscode.testing.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneNumberValidatorTest {

    private PhoneNumberValidator underTest;

    @BeforeEach
    void setUp() {
        underTest = new PhoneNumberValidator();
    }

//    this is the same as all the tests below
    @ParameterizedTest
    @CsvSource({
            "+447000000000,true",
            "+447000000000789, false",
            "447000000000, false"
    })

    void itShouldValidatePhoneNumber(String phoneNumber, boolean expected) {
//    when
        boolean isValid = underTest.test(phoneNumber);
//    then
        assertThat(isValid).isEqualTo(expected);
    }


//    @ParameterizedTest
//    @CsvSource({"+447000000000, TRUE"})
//    void itShouldValidatePhoneNumber(String phoneNumber, String expected) {
////    when
//        boolean isValid = underTest.test(phoneNumber);
////    then
//        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
//    }

//    @Test
//    void itShouldValidatePhoneNumber() {
////    given
//        String phoneNumber = "+447000000000";
////    when
//        boolean isValid = underTest.test(phoneNumber);
////    then
//        assertThat(isValid).isTrue();
//    }
//
//    @Test
//    @DisplayName("Should fail when does not start with +")
//    void itShouldValidatePhoneNumberWhenIncorrect() {
////    given
//        String phoneNumber = "447000000000";
////    when
//        boolean isValid = underTest.test(phoneNumber);
////    then
//        assertThat(isValid).isFalse();
//    }
//
//    @Test
//    @DisplayName("Should fail when length is longer than 13")
//    void itShouldValidatePhoneNumberWhenLengthTooLong() {
////    given
//        String phoneNumber = "+4470000000009";
////    when
//        boolean isValid = underTest.test(phoneNumber);
////    then
//        assertThat(isValid).isFalse();
//    }
}
