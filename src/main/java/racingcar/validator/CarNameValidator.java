package racingcar.validator;

import java.util.List;

import static racingcar.constant.ErrorMessage.*;
import static racingcar.constant.NumberConstant.MAX_CAR_NAME_LENGTH;

public class CarNameValidator {
    public static void validateCarNames(List<String> carNames) {
        for (String name : carNames) {
            if (name.length() > MAX_CAR_NAME_LENGTH) {
                throw new IllegalArgumentException(CAR_NAME_LENGTH_ERROR);
            }
        }
    }
}