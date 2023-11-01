package racingcar.validator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class AttemptNumberValidatorTest {
    @Test
    void validateNumber_should_throw_exception_when_attempts_is_not_a_number() {
        assertThatThrownBy(() -> AttemptNumberValidator.validateNumber("abc"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("시도 횟수는 숫자만 가능합니다.");
    }

    @Test
    void validateNumber_should_throw_exception_when_attempts_is_empty() {
        assertThatThrownBy(() -> AttemptNumberValidator.validateNumber(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("시도 횟수는 공백일 수 없습니다.");
    }

    @Test
    void validateNumber_should_throw_exception_when_attempts_is_negative() {
        assertThatThrownBy(() -> AttemptNumberValidator.validateNumber("-1"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("유효하지 않은 시도 횟수입니다.");
    }

    @Test
    void validateNumber_should_throw_exception_when_attempts_is_zero() {
        assertThatThrownBy(() -> AttemptNumberValidator.validateNumber("0"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("유효하지 않은 시도 횟수입니다.");
    }
}